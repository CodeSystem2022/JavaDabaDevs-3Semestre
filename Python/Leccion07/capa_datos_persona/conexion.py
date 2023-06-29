import psycopg2 as bd #Se corrige error de importación
# psycopg2 as db otra manera de importar del psycopg2
from logger_base import log

class Conexion:
    _DATABASE = 'test_bd'
    _USERNAME = 'postgres'
    _PASSWORD = 'admin'
    _DB_PORT = '5432'
    _HOST = '127.0.0.1' #Se corrige __HOST a _HOST
    _conexion = None
    _cursor = None

    @classmethod
    def obtenerConexion(cls):
        if cls._conexion is None:
            try:
                cls._conexion = bd.connect(host=cls._HOST,
                                           user=cls._USERNAME,
                                           password=cls._PASSWORD,
                                           port=cls._DB_PORT,
                                           database=cls._DATABASE)
                log.debug(f'Conexión Exitosa: {cls._conexion}')
                return cls.conexion #Se corrige el nombre de la variable conexion
            except Exception as e:
                log.error(f'Ocurrió un error: {e}')
                sys.exit()
        else:
            return cls. conexion

    @classmethod
    def obtenerCursor(cls):
        if cls._cursor is None:
            try:
                cls._cursor = cls.obtenerConexion().cursor()
                log.debug(f'Se abrió corectamente el cursor: {cls._cursor}')
                return cls._cursor
            except Exception as e:
                log.error(f'Ocurrió un error: {e}')
                sys.exit()
        else:
            return cls._cursor

if __name__ == '__main__': #Corrección de la comprobación __name__
    Conexion.obtenerConexion()
    Conexion.obtenerCursor()