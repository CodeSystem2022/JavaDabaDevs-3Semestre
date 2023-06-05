package domain;

public class Persona {
    //Cargamos los atributos:
    private final int idPersona;
    private static int contadorPersonas;
    
    
    static{//Bloque de Inicialización estático 
        System.out.println("Ejecución del bloque estatico");
        ++Persona.contadorPersonas; //usamos el nombre de la clase
        //idPersona = 10; No es un atributo estatico, por esto tenemos un error
    }
    
    {//Bloque de inicialización No estático(contexto dinámico)
        
        System.out.println("Ejecución del bloque NO estático");
        this.idPersona = Persona.contadorPersonas++;//Incrementamos el atributo idpersona
        //usamos this. en inicializacion no estatico
    }
    //Los bloques de inicialización se ejecutan antes del contructor:
    
    
     //Creamos el constructor Persona:
    public Persona(){
        System.out.println("Ejecución del contructor");
    }
    
    //Metodo Get para idPersona
    public int getIdPersona(){
        return this.idPersona;
    }
    //Metodo ToString
    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    } 
}


