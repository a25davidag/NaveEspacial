void main() {

    VehiculoEspacial apolo11 = new NavesTripuladas("Apolo 11",3432.213,"Hidrogeno Liquido",7600.50,3);
    System.out.println(apolo11.getSistemaPropulsion().getTipoCombustion());
    apolo11.protocoloMision();
    VehiculoEspacial voyager1 = new SondaExploradora("Voyager 1",6573.50,"Combustible Nuclear",4500.75,8420.25);
    System.out.println(voyager1.getSistemaPropulsion().getTipoCombustion());
    voyager1.protocoloMision();




}
