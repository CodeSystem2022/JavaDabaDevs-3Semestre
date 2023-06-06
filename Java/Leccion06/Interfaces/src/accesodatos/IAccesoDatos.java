
package accesodatos;


public interface IAccesoDatos {
    int MAX_REGISTRO = 10; //Es un atributo (variable) asociado a una constante (public)
    //cuando declaramos un atributo en una interface se debe hacer una asignacion si o si
    
    //Metodo insertar es abstracto y sin cuerpo
    void insertar();
    
    void listar();
    
    void actualizar();
    
    void eliminar();
    
}
