public class SondaExploradora extends VehiculoEspacial {
    private double frecuenciaTransmision;

    public SondaExploradora(String nombre, double autonomia, String tipoCombustible, double empujeMax, double frecuenciaTransmision) {
        super(nombre, autonomia, tipoCombustible, empujeMax);
        this.frecuenciaTransmision = frecuenciaTransmision;
    }

    public double getFrecuenciaTransmision() {
        return frecuenciaTransmision;
    }

    public void setFrecuenciaTransmision(double frecuenciaTransmision) {
        this.frecuenciaTransmision = frecuenciaTransmision;
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
