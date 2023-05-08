
package ar.com.system.mundopc;

public class DispositivoEntrada {
    private String tipoEntrada;
    private String marca;
    private final String marca;
   
    public DispositivoEntrada (String tipoEntrada, String marca){
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }

    public String getTipoEntrada() {
        return this.tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getNmarca() {
        return marca;
    }

    public void setNmarca(String nmarca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "DispositivoEntrada{" + "tipoEntrada=" + tipoEntrada + ", marca=" + marca + ", marca=" + marca + '}';
    }
    
        }