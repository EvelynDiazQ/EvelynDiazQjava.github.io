package com.mycompany.ejemploagregacion;

public class Auricular {
    private String marca;
    private String color;
    private String estilo;

    public Auricular(String marca, String color, String estilo) {
        this.marca = marca;
        this.color = color;
        this.estilo = estilo;
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

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
    
    public void mostrar(){
        System.out.println(this.getMarca() + "\t" + this.getColor() + "\t" + this.getEstilo());
    }
}
