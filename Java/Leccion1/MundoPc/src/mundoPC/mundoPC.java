
package mundoPC;

 // con el * se importan todos los paquetes que tiene esa clase
import ar.com.system2023.mundopc.*;



public class mundoPC {
    public static void main(String[] args) { //pvsm + tab
        
        Monitor monitorHP = new Monitor("HP", 13); //importar la clase
        Teclado tecladoHP = new Teclado("Bluetooth", "HP");
        Raton ratonHP = new Raton("Bluetooth","HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
        
        //creamos objetos de diferente marcas
        Monitor monitorGamer = new Monitor("Gamer", 32); //importar la clase
        Teclado tecladoGamer = new Teclado("Bluetooth", "Gamer");
        Raton ratonGamer = new Raton("Bluetooth","Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);
        
        Orden orden1 = new Orden();//agregamos el arreglo vacio
        Orden orden2 = new Orden();//Una nueva lista para el objeto orden2
          
        
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        orden1.mostrarOrden();
        
        Computadora computadorasVarias = new Computadora("Computadora de diferentes marcas", monitorHP, tecladoGamer, ratonHP);
        orden2.agregarComputadora(computadorasVarias);
        orden2.mostrarOrden();
        
        
        //Crear mas objetos de tipo computadora con todos sus elementos
        //completar una lista en el objeto orden1 que llegue a los 10 elementos
        //probar de esta manera los metdos al maximo rendimiento
      
      //DELL
        Orden orden3 = new Orden();  
        Monitor monitorDell = new Monitor("Dell", 17); //importar la clase
        Teclado tecladoDell = new Teclado("Bluetooth", "Dell");
        Raton ratonDell = new Raton("Bluetooth","Dell");
        Computadora computadoraDell = new Computadora("Dell",monitorDell,tecladoDell,ratonDell);
        
        orden3.agregarComputadora(computadoraDell);
        orden3.mostrarOrden();
        
      //MSI
        Orden orden4 = new Orden();  
        Monitor monitorMSI = new Monitor("MSI", 30); //importar la clase
        Teclado tecladoMSI = new Teclado("Bluetooth", "MSI");
        Raton ratonMSI = new Raton("Bluetooth","MSI");
        Computadora computadoraMSI = new Computadora("MSI",monitorMSI,tecladoMSI,ratonMSI);
        
        orden4.agregarComputadora(computadoraMSI);
        orden4.mostrarOrden();
        
        
    }
}
