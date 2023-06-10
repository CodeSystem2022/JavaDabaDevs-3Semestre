
package test;

import paquete1.Clase1;
import paquete2.Clase3;

public class TestModificadoresAcceso {
    public static void main(String[] args){
        Clase1 clase1 = new Clase1(); //Constructor
        System.out.println("Clase1 = " + clase1.atributoPublic);  //Atributo
        clase1.metodoPublico(); //Metodo
        Clase3 claseHija = new Clase3();
        System.out.println("claseHija = " + claseHija);
    }
}
