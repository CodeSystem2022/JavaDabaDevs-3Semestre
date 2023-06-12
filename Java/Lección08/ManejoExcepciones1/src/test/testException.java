package test;

//@author JOHAN
import aritmetica.Aritmetica;
import excepciones.OperacionExcepcion;

public class testException {

    public static void main(String[] args) {
//       //int resultado = 10 / 0;
//       //    System.out.println("resultado =" + resultado);exception division por 0
//

        //método try catch 
//       int resultado = 0;
//       try {
//           resultado = 10/0;
//       }catch(Exception e){
//           System.out.println("Ocurrio un Error");
//           e.printStackTrace(System.out);//se conoce como pila de excepciones
//       }
//       
//        System.out.println("La variable de resultado tiene como valor: "+resultado);
        //
//        int resultado = 0;
//        try {
//            resultado = Aritmetica.division(10, 0);
//        } catch (Exception e) {
//            System.out.println("Ocurrio un Error");
//            e.printStackTrace(System.out);//se conoce como pila de excepciones
//            System.out.println(e.getMessage());
//        }
//        System.out.println("La variable de resultado tiene como valor: " + resultado);
        //finally 
//        int resultado = 0;
//        try {
//            resultado = Aritmetica.division(10, 2);
//        } catch (Exception e) {
//            System.out.println("Ocurrio un Error");
//            e.printStackTrace(System.out);//se conoce como pila de excepciones
//            System.out.println(e.getMessage());
//        } finally {
//            System.out.println("Se reviso la división entre cer0");
//        }
//        System.out.println("La variable de resultado tiene como valor: " + resultado);
        //multiples excepciones 
        int resultado = 0;
        try {
            resultado = Aritmetica.division(10, 0);
        }catch(OperacionExcepcion e){
            System.out.println("Ocurrio un error de tipo OperacionException");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocurrio un Error");
            e.printStackTrace(System.out);//se conoce como pila de excepciones
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Se reviso la división entre cer0");
        }
        System.out.println("La variable de resultado tiene como valor: " + resultado);
    }

}
