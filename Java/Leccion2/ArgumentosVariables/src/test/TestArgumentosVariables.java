package test;

public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(3,4,5);//llamamos al metodo, se van agregando los argumentos
        imprimirNumeros(1,2);
        variosParametros("Juan","Perez",7,8,9);
    }
    //si tenemos varios parametros, el parametro variable lo ponemos al final (int ...)
    private static void variosParametros(String nombre,String apellido, int ...numeros){
        System.out.println("Nombre: "+nombre+", Apellido: "+apellido);
        imprimirNumeros(numeros);
    }
   
    //1- Creamos el metodo imprimirNumeros
    private static void imprimirNumeros(int ...numeros){ //int + ... vamos a recibir argumentos varables. 
        //los ... Indica cantidad indefinida de elementos
        for(int i = 0; i< numeros.length;i++){ // for + TAB (arma nuestro ciclo)
            System.out.println("Elementos: "+numeros[i]);
        }
    }
    
}

