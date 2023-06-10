import psycopg2  # esto es para poder conectarnos a Postgre

conexion = psycopg2.connect(
    user='postgres',
    password='admin',
    host='127.0.0.1',
    port='5432',
    database='test_bd'
)  # objeto de tipo conexion para importar psycopg2. esto metodo nos permite conectar a Postgre
try:
    with conexion:
        with conexion.cursor() as cursor:
            sentencia = 'UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s'  # definimos la sentencia para ejecurar esto para hacer una consulta a nuestra tabla, modificarla etc.
            valores = (
                ('Luis', 'Pascal', 'lp@email.com', 4),
                ('Romina', 'Ayala', 'ra@email.com', 5),
                ('Ramiro', 'Zulleti', 'rz@email.com', 7)
            )# Es una tupla de tuplas
            cursor.executemany(sentencia, valores)  # de esta manera ejecutamos la sentencia.
            registros_actualizados = cursor.rowcount
            print(f'Los registros actualizados son: {registros_actualizados}')



except Exception as e:
    print(f'Ocurrio un errer: {e}')
finally:  # Esto para que siempre se cierre al terminar el cierre de la conexión.
    conexion.close()
