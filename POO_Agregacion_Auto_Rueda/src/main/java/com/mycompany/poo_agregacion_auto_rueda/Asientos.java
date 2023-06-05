package com.mycompany.poo_agregacion_auto_rueda;

public class Asientos {
    private int  cantidad;
    private String diseño;
    private String tipoAsiento;
    private String tapizado;
    private char estado;

    public Asientos(int cantidad, String diseño, String tipoAsiento, String tapizado, char estado) {
        this.cantidad = cantidad;
        this.diseño = diseño;
        this.tipoAsiento = tipoAsiento;
        this.tapizado = tapizado;
        this.estado = estado;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDiseño() {
        return diseño;
    }

    public void setDiseño(String diseño) {
        this.diseño = diseño;
    }

    public String getTipoAsiento() {
        return tipoAsiento;
    }

    public void setTipoAsiento(String tipoAsiento) {
        this.tipoAsiento = tipoAsiento;
    }

    public String getTapizado() {
        return tapizado;
    }

    public void setTapizado(String tapizado) {
        this.tapizado = tapizado;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }
    
    public void mostrar(){
        System.out.println(this.getCantidad()+ "\t\t" + this.getDiseño() + "\t\t" + this.getTipoAsiento()+ 
                        "\t\t"+ this.getTapizado()+ "\t\t"+ this.getEstado());
        
    }    
}
