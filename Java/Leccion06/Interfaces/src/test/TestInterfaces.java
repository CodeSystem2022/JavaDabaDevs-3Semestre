
package test;

import accesodatos.*;


public class TestInterfaces {
    public static void main(String[] args) {
        //vamos a definir una variable de tipo interface
        IAccesoDatos datos = new ImplementacionMySql(); 
       // datos.listar(); //polimorfismo, utilizo la implementacion de MySql
       
       //metodo:
       //imprimir(datos);
       
        datos = new ImplementacionOracle();
        //datos.listar(); //polimorfismo, utilizo la implementacion de oracle
        imprimir(datos);
    }
    //metodo generico:
    public static void imprimir(IAccesoDatos datos){
        datos.listar();
    }
}
