#Creamos nuestra propia excepcion usando la clase Padre

class NumerosIgualesException(Exception): #Extiende de la clase
    def __init__(self, mensaje):
        self.message= mensaje # hemos usado el atributo de la clase padre Exception

        