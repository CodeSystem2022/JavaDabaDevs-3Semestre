package test;

import Enumeraciones.Continentes;
import Enumeraciones.Dias;

public class testEnumeracion {

    public static void main(String[] args) {
        //System.out.println("Dia 1: "+Dias.LUNES);
        //indicarDiaSemana (Dias.LUNES);
        System.out.println("Continente No. 1: " +Continentes.AFRICA);
        System.out.println("No. de paises en el primer continente: " +Continentes.AFRICA.getPaises());
        System.out.println("No. de habitantes en el primer continente: " +Continentes.AFRICA.getHabitantes());
        
        System.out.println("Continente No. 2: " +Continentes.EUROPA);
        System.out.println("No. de paises en el Segundo continente: " +Continentes.EUROPA.getPaises());
        System.out.println("No. de habitantes en el Segundo continente: " +Continentes.EUROPA.getHabitantes());
       
        System.out.println("Continente No. 3: " +Continentes.ASIA);
        System.out.println("No. de paises en el Tercer continente: " +Continentes.ASIA.getPaises());
        System.out.println("No. de habitantes en el Tercer continente: " +Continentes.ASIA.getHabitantes());
        
        System.out.println("Continente No. 4: " +Continentes.AMERICA);
        System.out.println("No. de paises en el cuarto continente: " +Continentes.AMERICA.getPaises());
        System.out.println("No. de habitantes en el cuarto continente: " +Continentes.AMERICA.getHabitantes());
        
        System.out.println("Continente No. 5: " +Continentes.OCEANIA);
        System.out.println("No. de paises en el quinto continente: " +Continentes.OCEANIA.getPaises());
        System.out.println("No. de habitantes en el quinto continente: " +Continentes.OCEANIA.getHabitantes());
    }   
}

