public class Mision {
    protected String destino;
    protected int id;
    protected VehiculoEspacial vehiculoEspacial;

    public Mision(String nombre, int id) {
        this.destino = nombre;
        this.id = id;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public VehiculoEspacial getVehiculoEspacial() {
        return vehiculoEspacial;
    }

    public void setVehiculoEspacial(VehiculoEspacial vehiculoEspacial) {
        this.vehiculoEspacial = vehiculoEspacial;
    }
}
