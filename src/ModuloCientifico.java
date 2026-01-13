public class ModuloCientifico {
    private String Instrumento;
    private VehiculoEspacial vehiculoEspacial;

    public ModuloCientifico(String instrumento ) {
        Instrumento = instrumento;
        this.vehiculoEspacial = vehiculoEspacial;
    }

    public String getInstrumento() {
        return Instrumento;
    }

    public void setInstrumento(String instrumento) {
        Instrumento = instrumento;
    }

    public VehiculoEspacial getVehiculoEspacial() {
        return vehiculoEspacial;
    }

    public void setVehiculoEspacial(VehiculoEspacial vehiculoEspacial) {
        this.vehiculoEspacial = vehiculoEspacial;
    }
}
