package com.mycompany.poo_agregacion_auto_rueda;

public class Rueda {
    private int codigo;
    private String marca;
    private int rin;
    private float precio;
    private char estado;

    public Rueda(int codigo, String marca, int rin, float precio, char estado) {
        this.codigo = codigo;
        this.marca = marca;
        this.rin = rin;
        this.precio = precio;
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getRin() {
        return rin;
    }

    public void setRin(int rin) {
        this.rin = rin;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }
    
    public void mostrar(){
        
        /*System.out.println("CÓDIGO: " + this.getCodigo());
        System.out.println("MARCA : " + this.getMarca());
        System.out.println("RIN   : " + this.getRin());
        System.out.println("PRECIO: " + this.getPrecio());
        System.out.println("ESTADO: " + this.getEstado());*/
        System.out.println(this.getCodigo()+ "\t" + this.getMarca() + "\t\t" + this.getRin() + "\t" 
                         + this.getPrecio() + "\t" + this.getEstado());  
    }
}
