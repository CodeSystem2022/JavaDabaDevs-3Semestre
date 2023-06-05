
miFuncion(8,6);//esto se le conoce como hosting

function miFuncion (a,b){
   // console.log('Sumamos: '+ (a + b))
    return a + b;
}

//Llamando la funcion
miFuncion(5,4);//le colocamos los argumentos a la funcion

let resultado = miFuncion(6,7);
console.log(resultado);

//Declaramos una funcion de tipo expresion o anonima
let x = function(a,b){return a + b};
resultado = x(5, 6); //al llamarla se pone la variable y parentesis 
console.log(resultado);

//Funcion que se llaman a si mismas: Funciones tipo Self y Invoking
(function(a,b){
    console.log('Ejecutando la funcion: '+ (a+b));
})(9,6);

// una funcion es un tipo de dato
console.log(typeof miFuncion);

//Tambien pueden ser escritas como objetos
//Vamos a ver cuantos argumentos se han definido en una funcion:
function miFuncionDos (a,b){
     console.log(arguments); 
     //en la pisicion 0 esta el 5 y en la posicon 1 esta el 7
     console.log(arguments.length);
     //vemos la cantidad de argumentos
 } 
 miFuncionDos(5,7,3,6);

 //Metodo toString (metodos y funciones son lo mismo)
 var miFuncionTexto = miFuncionDos.toString(); 
 //se puede asignar a una varianble la funcion, como su fuera texto
 console.log(miFuncionTexto);
 //las funciones tambien tienen propiedades y metodos
 //por ejemplo: la propiedad de arguments


 //Funciones flecha (similares a la de tipo exprecion)
const sumarFuncionFlecha = (a,b) => a + b; 
// declaramos una variable de tipo constante (que no cambia)
resultado = sumarFuncionFlecha(3,7); //asignamos el valor a una variable
console.log(resultado);

//Funcion de tipo expresion
 let sumar = function(a=4,b=8){
    console.log(arguments[0]); // muestra el parametro de: a 
    console.log(arguments[1]);// muestra el parametro de: b
    return a + b + arguments[2];
 }
 resultado = sumar(3,2,9);
 console.log(resultado);

 //Usamos el concepto de Hoisting 
 //Primero vamos a llamar la funcion y luego la vamos a definir
let respuesta = sumarTodo(5, 4, 13, 10, 9);
 console.log(respuesta);
 function sumarTodo(){
    let suma = 0;
    for(let i = 0; i < arguments.length ; i++){
        suma += arguments[i]; // arguments es para arreglos
    }
    return suma;
 }

// Tipos primitivos 
let k = 10; //variable global k (que no va a sugfrir ningun cambio)

//Paso por valor:
function cambiarValor(a){ //recibe parametro a. Le pasamos el valor de k
    a = 20; //creamos nueva variable, que le cambia el valor a a  
}
cambiarValor(k); //pasamos k como argumento. 
//Estamos mandando una copia del valor que tiene k, 
//no modifica el valor de k al ingresar a la funcion, 
//le estamos mandando el valor que recibio k

console.log(k);

//al terminar de ejecutarse la funcion, esta se dentruyo, por lo que 
//la variable k sigue teniendo el mismo valor, nada cambio.
//a eso le llamamos paso por valor

//Paso por referencia
const persona = { //objeto
    nombre: 'Juan', //atributos y caracteristicas
    apellido: 'Lepez'
}
console.log(persona);
        
function cambiarValorObjeto(p1){
    p1.nombre = 'Ignacio';
    p1.apellido = 'Perez'
}
// al finalizar la funcion la variable p1 se va a destruir
// p1 estuvo apuntando al mismo espacio de memoria de persona
// se destruye p1 pero las modificaciones quedan permanentemente al objeto persona
 cambiarValorObjeto(persona); //llamando a persona
console.log(persona);






