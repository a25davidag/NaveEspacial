public class SistemaPropulsion {
    private String tipoCombustion;
    private double empujeMax;
    private VehiculoEspacial vehiculoEspacial;


    public SistemaPropulsion(String tipoCombustion, double empujeMax, VehiculoEspacial vehiculoEspacial) {
        this.tipoCombustion = tipoCombustion;
        this.empujeMax = empujeMax;
    }

    public String getTipoCombustion() {
        return tipoCombustion;
    }

    public void setTipoCombustion(String tipoCombustion) {
        this.tipoCombustion = tipoCombustion;
    }

    public double getEmpujeMax() {
        return empujeMax;
    }

    public void setEmpujeMax(double empujeMax) {
        this.empujeMax = empujeMax;
    }

    public VehiculoEspacial getVehiculoEspacial() {
        return vehiculoEspacial;
    }

    public void setVehiculoEspacial(VehiculoEspacial vehiculoEspacial) {
        this.vehiculoEspacial = vehiculoEspacial;
    }
}
