
package test;

import enumeraciones.Dias;


public class TestDias {
    public static void main(String[] args) {
        DiasDeSem(Dias.MONDAY);
        DiasDeSem(Dias.TUESDAY);
        DiasDeSem(Dias.WEDNESDAY);
        DiasDeSem(Dias.THUERSDAY);
        DiasDeSem(Dias.FRIDAY);
        DiasDeSem(Dias.SATURDAY);
        DiasDeSem(Dias.SUNDAY);
    }
    private static void DiasDeSem(Dias dias){
        switch (dias){
                   case MONDAY:
               System.out.println("First Day of the week");
                break;
            case TUESDAY:
               System.out.println("Second Day of the week");
                break;
            case WEDNESDAY:
               System.out.println("Third Day of the week");
                break;
            case THUERSDAY:
               System.out.println("Fourth Day of the week");
                break;
            case FRIDAY:
               System.out.println("Fifth Day of the week");
                break;
            case SATURDAY:
               System.out.println("Sixth Day of the week");
                break;
            case SUNDAY:
               System.out.println("Seventh Day of the week");
        }
    }
          
}
