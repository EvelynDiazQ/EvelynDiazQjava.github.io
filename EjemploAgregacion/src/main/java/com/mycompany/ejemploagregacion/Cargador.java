package com.mycompany.ejemploagregacion;
public class Cargador {
    private String marca;
    private String color;
    private int voltios;
    private int amperios;
    private char estado;

    public Cargador(String marca, String color, int voltios, int amperios, char estado) {
        this.marca = marca;
        this.color = color;
        this.voltios = voltios;
        this.amperios = amperios;
        this.estado = estado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVoltios() {
        return voltios;
    }

    public void setVoltios(int voltios) {
        this.voltios = voltios;
    }

    public int getAmperios() {
        return amperios;
    }

    public void setAmperios(int amperios) {
        this.amperios = amperios;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }
    
    public void mostrar(){
        System.out.println(this.getMarca() + "\t" + this.getColor() + "\t" + this.getVoltios() + "\t" 
                         + this.getAmperios()+ "\t\t" + this.getEstado());
    }
}
