#Declaramos una variable
try:
    archivo = open('prueba.txt', 'w', encoding='utf8') # Para palabras con acento agregamos encoding = utf8
    # juego de caracteres que soporta los acentos
    archivo.write('Programamos con diferentes tipos de archivos, ahora en txt.\n')
    archivo.write('Los acentos son importante para las palabras\n')
    archivo.write('como por ejemplo: acción, ejecución y producción\n')
    archivo.write('Letras: \nr read, \na append, \nw write, \nx crea un archivo, \nt esta es para texto o text, \nbarchivos binarios, \nw+ y r+ lee y escribe')
    archivo.write('\nSaludos a todos los alumnos de la tecnicatura')
    archivo.write('\nCon esto terminamos')
except Exception as e:
    print(e)
finally:
    archivo.close() # cuando el archivo esta cerrado ya no se puede trabajar con el



    