package com.mycompany.ejemploagregacion;

public class Usb {
    private String marca;
    private String color;
    private int capacidad;

    public Usb(String marca, String color, int capacidad) {
        this.marca = marca;
        this.color = color;
        this.capacidad = capacidad;
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

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    public void mostrar(){
        System.out.println(this.getMarca() + "\t" + this.getColor() + "\t" + this.getCapacidad() );
    } 
}
