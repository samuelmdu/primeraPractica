public class Dispositivo {

    private int codigoDispositivo;
    private String estadoDispositivo;
    private RegistroUbicacion ubicacion;

    public Dispositivo(int codigoDispositivo, String estadoDispositivo) {
        this.codigoDispositivo = codigoDispositivo;
        this.estadoDispositivo = estadoDispositivo;
    }

    public int getCodigoDispositivo() {
        return codigoDispositivo;
    }

    public void setCodigoDispositivo(int codigoDispositivo) {
        this.codigoDispositivo = codigoDispositivo;
    }

    public String getEstadoDispositivo() {
        return estadoDispositivo;
    }

    public void setEstadoDispositivo(String estadoDispositivo) {
        this.estadoDispositivo = estadoDispositivo;
    }

    public RegistroUbicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(RegistroUbicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "{codigoDispositivo:" + codigoDispositivo + " estadoDispositivo:" + estadoDispositivo + "} \nubicacion:" + ubicacion;
    }
}
