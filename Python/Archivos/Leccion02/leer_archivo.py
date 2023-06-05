
archivo = open('prueba.txt', 'r', encoding='utf8')
# vamos a iterar el archivo, cada una de las lineas
#print(archivo.readlines(1)) # accedemos al archivo como si fuera una lista
    # separa los elementos con una coma , por lo tanto podemos elegir cual imprimir

# Anexamos informacion, copiamos a otro
archivo2 = open('copia.txt','w', encoding='utf8')
archivo2.write(archivo.read())
archivo.close()
archivo2.close() #cerramos los dos archivos

print('Se ha terminado el proceso de leer y copias archivos')


