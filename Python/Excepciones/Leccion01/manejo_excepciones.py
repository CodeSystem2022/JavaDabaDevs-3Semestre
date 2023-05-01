#Importamos nuestra clase de NumerosIgualesException
from NumerosIgualesException import NumerosIgualesException

resultado = None

try:
    a = int(input('Digite el primer numero: ')) 
    b = int(input('Digite el segundo numero: '))
    if a==b: #Comparamos las variables
        # raise nos permite arrojar una excepcion
        raise NumerosIgualesException('Son numeros iguales')
    resultado = a/b
except TypeError as e:
    print(f'TypeError - Ocurrio un error: {type(e)}')
except ZeroDivisionError as e:
    print(f'ZeroDivisionError - Ocurrio un error: {type(e)}')
except Exception as e:
    print(f'Ocurrio un error: {type(e)}')
else:
    print('No se arrojo ninguna excepcion')
finally:
    print('Ejecucion de este bloque finally')
print(f'El resultado es: {resultado}')


