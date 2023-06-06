/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.Persona;

public class TestBloquesInicializacion {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();

        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());

        System.out.println(new Persona().toString());
        System.out.println(new Persona().toString());

    }

}
