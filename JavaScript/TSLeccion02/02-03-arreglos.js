// Creacion de Array o arreglos
const autos = ['Ferrari','Renault','BMW']; 
console.log(autos);

console.log(autos[0]); 
console.log(autos[2]);

for(let i = 0; i<autos.length; i++){
    console.log(i+' : '+autos[i])
}

//Modificamos los elementos del arreglo
autos[1]= 'Volvo';
console.log(autos[1])  //cambiamos Renault por

//Agregamos nuevos valores al arreglo:
autos.push('Audi'); // agregamos el elemento al final del arreglo
console.log(autos);

//Otras formas de agregar elementos al arreglo:
autos[autos.length] = 'Porche'; //agregamos elementos al final con el .length
console.log(autos);

//3ra forma de agregar elementos teniendo CUIDADO
autos[6] = 'Renault';
console.log(autos);


//Como preguntar si es un Array o Arreglo?
console.log(Array.isArray(autos));  //devuelve un booleano

console.log(autos instanceof Array);








