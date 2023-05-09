class NumerosIgualesException(Exception): # EXTTIENDE  DE LA  CLASE
    def __init__(self, mensaje):
        self.message = mensaje