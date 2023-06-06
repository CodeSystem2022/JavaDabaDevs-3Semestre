/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import enumeraciones.Continentes;
import enumeraciones.Dias;

/**
 *
 * @author Maxi
 */
public class TestEnumeraciones {

    public static void main(String[] args) {
        System.out.println("Día 1: " + Dias.LUNES);
        indicarDia(Dias.DOMINGO);
        indicarDia(Dias.VIERNES);

//        System.out.println(Continentes.AMERICA);
//        System.out.println(Continentes.AMERICA.getPaises());
//        System.out.println(Continentes.AMERICA.getHabitantes());
        infoContinente(Continentes.OCEANIA);
        infoContinente(Continentes.AMERICA);
        infoContinente(Continentes.ASIA);
        infoContinente(Continentes.EUROPA);
        infoContinente(Continentes.AFRICA);

    }

    public static void infoContinente(Continentes continente) {
        switch (continente) {
            case AMERICA -> {
                System.out.println(Continentes.AMERICA);
                System.out.println("Cantidad de paises: " + Continentes.AMERICA.getPaises());
                System.out.println("Cantidad de habitantes: " + Continentes.AMERICA.getHabitantes());
            }
//            case ASIA -> {
//                System.out.println(Continentes.ASIA);
//                System.out.println("Cantidad de paises: " + Continentes.ASIA.getPaises());
//                System.out.println("Cantidad de habitantes: " + Continentes.ASIA.getHabitantes());
//            }
            case EUROPA -> {
                System.out.println(Continentes.EUROPA);
                System.out.println("Cantidad de paises: " + Continentes.EUROPA.getPaises());
                System.out.println("Cantidad de habitantes: " + Continentes.EUROPA.getHabitantes());
            }
            case OCEANIA -> {
                System.out.println(Continentes.OCEANIA);
                System.out.println("Cantidad de paises: " + Continentes.OCEANIA.getPaises());
                System.out.println("Cantidad de habitantes: " + Continentes.OCEANIA.getHabitantes());
            }
            case AFRICA -> {
                System.out.println(Continentes.AFRICA);
                System.out.println("Cantidad de paises: " + Continentes.AFRICA.getPaises());
                System.out.println("Cantidad de habitantes: " + Continentes.AFRICA.getHabitantes());
            }
            default ->
                System.out.println("No se encontró el continente "+ continente + " =(");
        }
    }

    public static void indicarDia(Dias dia) {

        switch (dia) {
            case LUNES ->
                System.out.println("Lunes: Primer día de la semana.");
            case MARTES ->
                System.out.println("Martes: Segundo día de la semana.");
            case MIERCOLES ->
                System.out.println("Miércoles: Tercer día de la semana.");
            case JUEVES ->
                System.out.println("Jueves: Cuarto día de la semana.");
            //case VIERNES -> System.out.println("Viernes: Quinto día de la semana.");
            case SABADO ->
                System.out.println("Sábado: Sexto día de la semana.");
            case DOMINGO ->
                System.out.println("Domingo: Último dia de la semana.");
            default ->
                System.out.println("No se encontró el día " + dia + " =(");

        }

    }

}
