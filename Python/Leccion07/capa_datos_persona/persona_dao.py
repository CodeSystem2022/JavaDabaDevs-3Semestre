class PersonaDAO:
    '''
    DAO significa: Data Access Object
    CRUD significa:
        Create -> Insertar
        Read -> Seleccionar
        Update -> Actualizar
        Delete -> Eliminar
'''
    SELECCIONAR = 'SELECT * FROM persona ORDER BY id_persona'

    INSERTAR = 'INSERT INTO persona (nombre, apellido, email) VALUES (%s, %s, %s)'

    _ACTUALIZAR = 'UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s'

    ELIMINAR = 'DELETE FROM persona WHERE id_persona=%s'