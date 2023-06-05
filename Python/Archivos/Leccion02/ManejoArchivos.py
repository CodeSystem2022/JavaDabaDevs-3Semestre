# los metodos de enter y exit y estan en la clase objet

class ManejoArchivos: # se crea una clase donde se establece esas conecciones, se abre y cierra
    def __init__(self, nombre):
        self.nombre = nombre
    def __enter__(self):
        print('Obtenemos el recurso'.center(50,'-'))
        self.nombre = open(self.nombre,'r',encoding='utf8') # encapsulamos el codigo dentro del metodo
        return self.nombre
    def __exit__(self, tipo_excepction, valor_exception, traza_erro): # se deben usar estos parametros
        print('cerramos el recurso'.center(50,'-'))
        if self.nombre:
            self.nombre.close() # cerramos el archivo


            