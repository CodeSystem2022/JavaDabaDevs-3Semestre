package test;

import enumeraciones.Continentes;
import enumeraciones.Dias;

public class TestEnumeraciones {
    public static void main(String[] args) {
        //System.out.println("Dia 2:"+Dias.MARTES);
        //indicarDiaSemana(Dias.MARTES);//Las enumeraciones se tratan como cadenas
        //ahora no se debn utilizar comillas, se accede a travez de el operador de punto

        //Probamos lo que hicimos en la clase Continentes:
        System.out.println("Continente No.4: " + Continentes.AMERICA);
        System.out.println("Numero de paises en el 4to. continente: "
                + Continentes.AMERICA.getPaises());
        System.out.println("Numero de habitantes en el 4to. continente: "
                + Continentes.AMERICA.getHabitantes());
//Tarea: agregar la ejecucion del resto de los paises:
        System.out.println("Continente No.1: " + Continentes.AFRICA);
        System.out.println("Numero de paises en el 1er. continente: "
                + Continentes.AFRICA.getPaises());
        System.out.println("Numero de habitantes en el 1er. continente: "
                + Continentes.AFRICA.getHabitantes());

        System.out.println("Continente No.5: " + Continentes.OCEANIA);
        System.out.println("Numero de paises en el 5to. continente: "
                + Continentes.OCEANIA.getPaises());
        System.out.println("Numero de habitantes en el 5to. continente: "
                + Continentes.OCEANIA.getHabitantes());

        System.out.println("Continente No.3: " + Continentes.ASIA);
        System.out.println("Numero de paises en el 3ro. continente: "
                + Continentes.ASIA.getPaises());
        System.out.println("Numero de habitantes en el 3ro. continente: "
                + Continentes.ASIA.getHabitantes());

        System.out.println("Continente No.2: " + Continentes.EUROPA);
        System.out.println("Numero de paises en el 2do. continente: "
                + Continentes.EUROPA.getPaises());
        System.out.println("Numero de habitantes en el 2do. continente: "
                + Continentes.EUROPA.getHabitantes());
    }

    private static void indicarDiaSemana(Dias dias){ //usamos dias para acudir a nuestra enumeracion
        switch(dias){
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
                //Tarea: agregar todos los dias de la semana
                //agregar default
            case MIERCOLES:
                System.out.println("Primer dia de la semana");
                break;
            case JUEVES:
                System.out.println("Segundo dia de la semana");
                break;
            case VIERNES:
                System.out.println("Primer dia de la semana");
                break;
            case SABADO:
                System.out.println("Segundo dia de la semana");
                break;
            case DOMINGO:
                System.out.println("Segundo dia de la semana");
                break;
                default:
                System.out.println("El valor ingresado no es valido");
                        break;
                }

        }

}

 



