#Manejo de contexto WITH: sistaxis simplificada, abre y cierra el archivo

##with open('prueba.txt','r',encoding='utf8')as archivo:
   ## print(archivo.read())
    # No hace falta ni el try, ni el finally
    # en el contecto de with lo que se ejecuta de manera automatica son los metodos:
        # __enter__ (en este metodo se abre el archivo)
        # __exit__ (cierra el archivo)
from ManejoArchivos import ManejoArchivos

with ManejoArchivos('prueba.txt') as archivo:
    print(archivo.read())



