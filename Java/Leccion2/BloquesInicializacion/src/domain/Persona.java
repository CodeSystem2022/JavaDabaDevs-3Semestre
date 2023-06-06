package domain;

public class Persona {

    private final int idPersona;
    private static int contadorPersonas;

    // Bloque de inicialización static
    // Se ejecuta antes del constructor y una sola vez
    static {
        System.out.println("Ejecutando bloque estático");
        ++Persona.contadorPersonas;
        // No deja modificar idPersona ya que no es estático
        // idPersona = 10;
    }

    // Bloque de inicialización no estático (dinámico)
    // Se ejecuta cada vez que instanciemos un objeto
    {
        System.out.println("Ejecutando bloque dinámico");
        this.idPersona = Persona.contadorPersonas++;

    }

    public Persona() {
        System.out.println("Ejecutando el constructor");
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
}
