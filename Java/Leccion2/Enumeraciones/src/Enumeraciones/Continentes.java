package enumeraciones;

public enum Continentes {
        AFRICA(53,"1.2 billones"),//agregamos atributos y metodos
        EUROPA(46,"1.1 billones"),
        ASIA(44,"1.9 billones"),
        AMERICA(34,"150.2 billones"),
        OCEANIA(14,"1.2 billones");

        //Definimos un atrituto:
        private final int paises;
        private String habitantes;
        
        //generamos un constructor para usar el argumento paises en cada uno 
        //de los elementos de la enumeracion
        Continentes(int paises, String habitantes){
            this.paises = paises;
            this.habitantes = habitantes;
        }
        //metodo Get,para recuperar valores encapsulados
        public int getPaises(){
            return this.paises;
        }
        public String getHabitantes(){
            return this.habitantes;
        }
    }

