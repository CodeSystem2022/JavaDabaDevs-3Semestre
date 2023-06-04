/*

 */
package aritmetica;

import excepciones.OperacionesExcepcion;


public class Aritmetica {
    public static int division(int numerador, int denominador){
        if(denominador == 0){
           throw new OperacionesExcepcion("Division entre cero");
        }
        return numerador / denominador;
    }
}
