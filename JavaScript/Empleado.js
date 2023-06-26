class Empleado extends Persona{
    static contadorEmpleado = 0;

    constructor(nombre, apellido, edad, sueldo){
        super(nombre, apellido, edad);
        this._idEmpleado = ++contadorEmpleado;
        this._sueldo = sueldo;
    }

    //Métodos get and set
    get _idEmpleado(){
        return this._idEmpleado;
    }
    get sueldo(){
         return this._sueldo;
    }
    set sueldo(sueldo){
        this._sueldo = sueldo;
    }
    toString(){
        return `
        ${super.toString()} 
        ${this._idEmpleado} 
        ${this._sueldo}`;
    }
}

