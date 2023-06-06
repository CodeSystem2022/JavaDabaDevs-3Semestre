package enumeraciones;

// Enums complejos 
public enum Continentes {
    AFRICA(53,"1.2 Billones"),
    EUROPA(46,"1.1 Billones"),
    AMERICA(34, "1.3 Millones"),
    ASIA(44, "1.9 Millones"),
    OCEANIA(14, "150000");
    
    private final int paises;
    private final String habitantes;

    // Necesitan un getter por estar encapsulados
    public int getPaises() {
        return this.paises;
    }

    public String getHabitantes() {
        return this.habitantes;
    }
    
    
    // Esta asociado a los elementos de la enumeración, esta encapsulado! 
    // Constructor
    Continentes (int paises, String habitantes) {
        this.paises = paises;
        this.habitantes = habitantes;
    }
}
