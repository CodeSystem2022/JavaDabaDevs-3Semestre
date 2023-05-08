
// Tipos de Datos en una Funcion
console.log(typeof miFuncion);
function miFuncionDos(a, b){
    console.log(arguments.length);
 }

 miFuncionDos(5, 7, 3, 6);

 //toString
 var miFuncionTexto = miFuncionDos.toString();//convierte la funcion a texto
 console.log(miFuncionTexto);  

   //Funcion Flecha
 const sumarFuncionFlecha = (a, b) =>a + b;
 resultado = sumarFuncionFlecha(3, 7);//Asignamos el valor a una variable
    console.log(resultado);
