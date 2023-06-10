
package paquete2;

import paquete1.Clase1;

public class Clase3 extends Clase1{
  public Clase3(){
    super("protected"); //accedemos al contructor de la clase padre
    this.atributoProtected = "Accedemos desde la clase hija"; //accedemos al atributo 
    System.out.println("AtributoProtected = " + this.atributoProtected);
    this.atributoPublic = "es totalmente publico";
  
   }    
}
