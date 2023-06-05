package com.mycompany.poo_agregacion_auto_rueda;

public class Puertas {
    private String color;
    private String material;
    private char estado;
    private String seguridad;
    private String  posicion;

    public Puertas(String color, String material, char estado, String seguridad, String posicion) {
        this.color = color;
        this.material = material;
        this.estado = estado;
        this.seguridad = seguridad;
        this.posicion = posicion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public String getSeguridad() {
        return seguridad;
    }

    public void setSeguridad(String seguridad) {
        this.seguridad = seguridad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
      
    public void mostrar(){
        
        System.out.println(this.getColor()+ "\t" + this.getMaterial() + "\t\t" + this.getEstado() + 
                        "\t\t"+ this.getSeguridad()+ "\t\t"+ this.getPosicion());
    }   
}
