public class Mascota {

    private int codigoMascota;
    private String nombre;
    private String especie;
    private String estado;
    private Dispositivo dispositivo;

    public Mascota(int codigoMascota, String nombre, String especie, String estado) {
        this.codigoMascota = codigoMascota;
        this.nombre = nombre;
        this.especie = especie;
        this.estado = estado;

    }

    public int getCodigoMascota() {
        return codigoMascota;
    }

    public void setCodigoMascota(int codigoMascota) {
        this.codigoMascota = codigoMascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Dispositivo getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    @Override
    public String toString() {
        return
                "\nID: " + codigoMascota +
                "\nnombre: " + nombre +
                "\nespecie:" + especie +
                "\nestado: " + estado +
                "\ndispositivo: " + dispositivo;
    }
}
