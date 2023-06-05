package com.mycompany.poo_agregacion_auto_rueda;

public class Motor {
    private String lugarEnsamblaje;
    private String combustible;
    private float capacidad;
    private float caballosFuerza;
    private float torque;
    private char estado;

    public Motor(String lugarEnsamblaje, String combustible, float capacidad, float caballosFuerza, float torque, char estado) {
        this.lugarEnsamblaje = lugarEnsamblaje;
        this.combustible = combustible;
        this.capacidad = capacidad;
        this.caballosFuerza = caballosFuerza;
        this.torque = torque;
        this.estado = estado;
    }

    public String getLugarEnsamblaje() {
        return lugarEnsamblaje;
    }

    public void setLugarEnsamblaje(String lugarEnsamblaje) {
        this.lugarEnsamblaje = lugarEnsamblaje;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public float getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(float capacidad) {
        this.capacidad = capacidad;
    }

    public float getCaballosFuerza() {
        return caballosFuerza;
    }

    public void setCaballosFuerza(float caballosFuerza) {
        this.caballosFuerza = caballosFuerza;
    }

    public float getTorque() {
        return torque;
    }

    public void setTorque(float torque) {
        this.torque = torque;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }
 
   public void mostrar(){
       System.out.println( this.getLugarEnsamblaje()+"\t\t\t" + this.getCombustible() +
               "\t" + this.getCapacidad() + "\t\t" + this.getCaballosFuerza()+ "\t\t\t" + 
               this.getTorque()+ "\t" + this.getEstado());
   } 
}
