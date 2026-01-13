public class NavesTripuladas extends VehiculoEspacial {
    private int capacidadTripulantes;

    public NavesTripuladas(String nombre, double autonomia, String tipoCombustible, double empujeMax, int capacidadTripulantes) {
        super(nombre, autonomia, tipoCombustible, empujeMax);
        this.capacidadTripulantes = capacidadTripulantes;
    }

    public int getCapacidadTripulantes() {
        return capacidadTripulantes;
    }

    public void setCapacidadTripulantes(int capacidadTripulantes) {
        this.capacidadTripulantes = capacidadTripulantes;
    }

    public void scanner(){
        System.out.println("Escaneando el entorno...");
    }

    @Override
    public void protocoloMision() {
        super.protocoloMision();
        this.scanner();
    }
}
