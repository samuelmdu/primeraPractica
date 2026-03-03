public class RegistroUbicacion {

    private int identificador;
    private String fechaHora;
    private String ubicacion;

    public RegistroUbicacion(int identificador, String fechaHora, String ubicacion) {
        this.identificador = identificador;
        this.fechaHora = fechaHora;
        this.ubicacion = ubicacion;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return " {identificador:" + identificador + " fechaHora: " + fechaHora + " ubicacion:" + ubicacion + "}"
              ;
    }
}
