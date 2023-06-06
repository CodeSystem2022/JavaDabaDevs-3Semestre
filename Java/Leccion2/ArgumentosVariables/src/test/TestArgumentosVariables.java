package test;

public class TestArgumentosVariables {

    public static void main(String[] args) {
        imprimirNumeros(1, 2, 3, 4, 5);
        imprimirNumeros(9, 8, 7, 6, 5);
        variosParametros("Maxi", 3, 2, 1);

    }
    // Argumentos variables con otros datos
    // Los otros datos siempre van al principio, los variables al final
    private static void variosParametros(String nombre, int... numeros) {
        System.out.println("Nombre: " + nombre);
        imprimirNumeros(numeros);
    }

    // Argumentos variables
    private static void imprimirNumeros(int... numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento: " + numeros[i]);
        }
    }
}
