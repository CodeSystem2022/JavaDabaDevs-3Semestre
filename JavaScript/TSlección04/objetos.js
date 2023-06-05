//LA diferencia entre un tipo primitivo y un objeto, es que un tipo primitivo no tiene propiedades, ni tampoco metótods. U
//Un objeto si tiene propiedas y metodos. 

let x = 10; //variable de tipo primitivo
console.log(x.length);

//Objeto
let persona = {
    nombre: 'Jose',
    apellido: 'Ramirez',
    email: 'jr@gmail.com',
    edad: 28,
    idioma: 'ES',
    get lang(){
        return this.idioma.toUpperCase();//Convierte las minúsculas a mayúsculas
    },
    set lang(lang){
        this.idioma = lang.toUpperCase();
    },
     nombreCompleto: function(){ //método o función en JavaScript
        return this.nombre+' '+this.apellido;
     },

    get nombreEdad(){//Este el método get
        return 'El nombre es: '+ this.nombre+', edad: '+this.edad;
    },

    //Aquí se pueden seguir agregando atributos, métodos. 
    agregarEdadEmail: function(){
        return this.edad+' '+this.email;
    }
};
console.log(persona);
console.log(persona.nombreCompleto())
console.log(persona.agregarEdadEmail());

// 2da forma para crear y acceder a un objeto
let persona2 = new Object (); //Debe crear un nuevo objeto en memoria
persona2.nombre = 'Roberto';
persona2.direccion = '25 de Mayo 55';
persona2.telefono = '55665566';
console.log(persona2.telefono);

console.log(persona['apellido']); //accedemos como si fuera un arreglo

// For in y accedemos al objeto como si fuera un arreglo

for(propiedad in persona){
    console.log(propiedad);//accedemos a una propiedad
    console.log(persona[propiedad]);//Accedemos a sus valores
}
//Agregar y eleminar una propieda de un objeto

persona.apellido = 'Perez'; //Cambiamos dinamicamente el valor de un objeto
delete persona.apellida;// Eliminamos el error
console.log(persona);


//número 1: la más sencilla: concatenar cada valor de cada propiedad
console.log('Distintas formas de imprimir un objeto: forma 1');
console.log(persona.nombre+', '+persona.apellido);

//Número 2: A través del ciclo for in
console.log('Distintas formas de imprimir un objeto: forma 2');
for(nombrePropiedad in persona){
    console.log(persona[nombrePropiedad]);
}

//Número 3: la función Object.values()
console.log('Distintas formas de imprimir un objeto: forma 3');
let personaArray = Object.values(persona);
console.log(personaArray);

//Número 4: Utilizamos el método JSON.stringify
console.log('Distintas formas de imprimir un objeto: forma 4');
let personaString = JSON.stringify(persona);
console.log(personaString);

console.log(persona.nombreEdad);
persona.lang = 'en';
console.log(persona.lang);

//Definimos una función en mayúscula 

function Persona3 (nombre, apellido, email){//Nuestro CONSTRUCTOR
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this.nombreCompleto = function(){//CReamos una función dentro del Constructor, asi lo podemos reutilizar
        return this.nombre+' '+this.apellido;
    }
}

let padre = new Persona3('Leo', 'Lopez', 'LL@email.com');
console.log(padre);
padre.telefono = '44646464';
console.log(padre.nombreCompleto());//Utilizamos la función
let madre = new Persona3('Josefina', 'Ramallo', 'JR@hotmail.com');
console.log(madre);
console.log(madre.nombreCompleto());

//Distintas formas de crear objetos
//Caso 1
let miObjeto = new Object();//Esta es una opción formal
//Caso número 2
let miObjeto2 = {};//Esta opción es breve y recomendada
//Caso String 1
let miCaddena1 = new String('HOla');//Sintaxis formal
//Caso String 2
let miCadena = 'Hola'; //Esta la sintaxis simplificada y recomenda

//Caso con números 1 
let miNumero = new Number(1);//Es formal no recomendada

//caso con número 2 
let miNumero2 = 1;//sintaxis recomendada 

//Caso Boolean 1
let miBoolean1 = new Boolean(false);//Formal

//Caso Boolean 2 
let miBoolean2 = false; //Sintaxis recomendada

//Caso arreglos 1
let miArreglo1 = new Array(); //Formal

//Caso arreglos 2 

let miArreglo2 = [];//Sintaxis recomendada 

//Caso funcion 1 
let miFuncion1 = new function(){}; //Todo despues de new es considerado objeto
//CAso función 2
let miFuncion2 = function(){};//Notación simplificada y recomendada

//Uso de prototype
Persona3.prototype.telefono = '26612662';
console.log(padre);

//Uso de Call

let Persona4 = {
    nombre: 'Juan',
    apellido: 'Perez',
    nombreCompleto2: function(titulo, telefono){
        return titulo+': '+this.nombre+' '+this.apellido+' '+telefono;
        //return this.nombre+' '+this.apellido;
    }
}

let persona5 = {
    nombre: 'Carlos',
    apellido: 'Lara'
}
console.log(Persona4.nombreCompleto2('Licenciado', '55252525'));
console.log(Persona4.nombreCompleto2.call(persona5, 'Ing.', '555556654'));

//método apply nos permite llamar otro método u objeto que no tiene defino su propio metodod
let arreglo = ['Ing.', '55565665'];
console.log(Persona4.nombreCompleto2.apply(persona5, arreglo));
