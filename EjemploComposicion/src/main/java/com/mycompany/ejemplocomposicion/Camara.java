package com.mycompany.ejemplocomposicion;

public class Camara {
    private int cantidad;
    private int camaraPrincipal;
    private int camaraTrasera;
    private int granAngular;
    private int lenteMacro;

    public Camara(int cantidad, int camaraPrincipal, int camaraTrasera, int granAngular, int lenteMacro) {
        this.cantidad = cantidad;
        this.camaraPrincipal = camaraPrincipal;
        this.camaraTrasera = camaraTrasera;
        this.granAngular = granAngular;
        this.lenteMacro = lenteMacro;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCamaraPrincipal() {
        return camaraPrincipal;
    }

    public void setCamaraPrincipal(int camaraPrincipal) {
        this.camaraPrincipal = camaraPrincipal;
    }

    public int getCamaraTrasera() {
        return camaraTrasera;
    }

    public void setCamaraTrasera(int camaraTrasera) {
        this.camaraTrasera = camaraTrasera;
    }

    public int getGranAngular() {
        return granAngular;
    }

    public void setGranAngular(int granAngular) {
        this.granAngular = granAngular;
    }

    public int getLenteMacro() {
        return lenteMacro;
    }

    public void setLenteMacro(int lenteMacro) {
        this.lenteMacro = lenteMacro;
    }
    
    public void mostrar(){
        System.out.println(this.getCantidad() + "\t\t\t" + this.getCamaraPrincipal() + "\t\t\t" + this.getCamaraTrasera() + "\t\t\t\t" 
                         + this.getGranAngular()+ "\t\t\t\t" + this.getLenteMacro());
    }  
}
