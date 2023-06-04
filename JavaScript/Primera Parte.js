//No se puede crear un objeto cuya clase no este definida o inicializada antes de la creacion del objeto
//let persona3 = new Persona('Carla', 'Ponce'); Esto no se debe hacer: Persona is not defined 


class Persona{ //Definimos la clase. //Clase padre

    static contadorPersonas = 0; //Definimos un atributo static que pertenece a la clase y no pertenece a un objeto
    //email = 'Valor default email'; // Atributo NO estatico

    constructor(nombre, apellido){ //Creamos el método constructor.
        this._nombre = nombre; //Declaramos el atributo "nombre".
        this._apellido = apellido; //Declaramos el atributo "apellido".
        this.idPersona = ++Persona.contadorPersonas;//Se coloca "++" adelante para que el incremento se haga antes
        
        //Cada vez que se cree un objeto, va a recibir un id unico que se va a incrementar: 
        //Persona.contadorObjetosPersona++;
        //console.log('Se incrementa el contador: '+' '+Persona.contadorObjetosPersona);
    
    }
  
    //Método get: NO puede llamarse igual que la propiedad
    //por eso agregamos un _ adelante de los atributos (propiedades)
    get nombre(){
        return this._nombre;
    }
    //6.2 Parte Set (Modificamos el atributo)

    set nombre(nombre){
        this._nombre = nombre;
    }
    //Tarea Asignada
    get apellido(){
        return this._apellido;
    }
    set apellido(apellido){
        this._apellido = apellido;
    }

    nombreCompleto(){
        return this.idPersona + ' ' + this._nombre + ' ' + this._apellido;
    }
    
    //sobreescribiendo el método dela clase padre (Object)
    toString(){ //Regresa un string
        //se aplica el polimorfismo que significa = múltiples formas en tiempo de ejecución.
        //El método que se ejecuta depende si es una referencia de tipo padre o hija (depende del objeto).
        return this.nombreCompleto();
    }


    