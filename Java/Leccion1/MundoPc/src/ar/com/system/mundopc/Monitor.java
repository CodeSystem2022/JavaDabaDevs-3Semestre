
package ar.com.system2023.mundopc;

public class Monitor {
    //vamos a crear sus atributos
    private final int idMonitor; //final es una variable de tipo final,es una constrante
    //aparece error hasta que cargemos el constructor
    private String marca;
    private String tamanio;
    private static int contadorMonitores = 0;
    
    //constrcutor vacio
    public Monitor() {
        this.idMonitor = ++Monitor.contadorMonitores; 
//Constructor hara el incremento de cada uno de los monitores
    }

    public Monitor(String marca, int tamanio) { //constructor de tipo publico
        this(); // hacemos el llamado al costructor vacio
        this.marca = marca;
        this.tamanio = tamanio +"\"";
    }

  
    
    //inset code > getter and setter:
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamanio() {
        return this.tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    //Ingresamos manualmente el getIdMonitor, no el set porque es de valor constante
    public int getIdMonitor() {//lo usamos para obtener el valor del monitor
        return this.getIdMonitor();
    }

    //Insert code > toString > select all > generate

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tamanio=" + tamanio + '}';
    }
   
}