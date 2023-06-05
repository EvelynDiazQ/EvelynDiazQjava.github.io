package com.mycompany.ejemplocomposicion;

public class Bateria {
    private String marca;
    private String material;
    private int miliamperio;

    public Bateria(String marca, String material, int miliamperio) {
        this.marca = marca;
        this.material = material;
        this.miliamperio = miliamperio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getMiliamperio() {
        return miliamperio;
    }

    public void setMiliamperio(int miliamperio) {
        this.miliamperio = miliamperio;
    }
    
    public void mostrar(){
        System.out.println(this.getMarca() + "\t\t" + this.getMaterial() + "\t\t"+ this.getMiliamperio());   
    }   
}
