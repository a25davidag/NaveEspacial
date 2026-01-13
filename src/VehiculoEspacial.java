public class VehiculoEspacial {
    protected String nombre;
    protected double autonomia;
    protected SistemaPropulsion sistemaPropulsion;
    protected Mision mision;
    protected ModuloCientifico moduloCientifico;

    public VehiculoEspacial(String nombre, double autonomia,String tipoCombustible, double empujeMax) {
        this.nombre = nombre;
        this.autonomia = autonomia;
        this.sistemaPropulsion = new SistemaPropulsion(tipoCombustible,empujeMax, this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }

    public SistemaPropulsion getSistemaPropulsion() {
        return sistemaPropulsion;
    }

    public void setSistemaPropulsion(SistemaPropulsion sistemaPropulsion) {
        this.sistemaPropulsion = sistemaPropulsion;
    }

    public ModuloCientifico getModuloCientifico() {
        return moduloCientifico;
    }

    public void setModuloCientifico(ModuloCientifico moduloCientifico) {
        this.moduloCientifico = moduloCientifico;
    }

    public Mision getMision() {
        return mision;
    }

    public void setMision(Mision mision) {
        this.mision = mision;
    }

    public void protocoloMision(){
        System.out.println("Mensaje a la tierra");
    }


}
