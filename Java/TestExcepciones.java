
package test;

import static aritmetica.Aritmetica.division;
import excepciones.OperacionesExcepcion;


public class TestExcepciones {
    public static void main(String[] args) {
     int resultado = 0;
     try{
       resultado = division(10, 0);
       
     }catch(OperacionesExcepcion e){//Los catch van de menor a mayor jerarquia 
         System.out.println("Ocurrio un error de tipo OperacioneExcepciones");
         System.out.println(e.getMessage());
        }catch(Exception e){
         System.out.println("Ocurrio un Error");
        e.printStackTrace(System.out);//Aqui se imprime. Se conocer como la pila de excepciones
         System.out.println(e.getMessage());
        }
     finally{
         System.out.println("Se reviso la division entre cero");
     }
        System.out.println("La variable de Resultado tiene como valor: "+resultado);
    }
}
