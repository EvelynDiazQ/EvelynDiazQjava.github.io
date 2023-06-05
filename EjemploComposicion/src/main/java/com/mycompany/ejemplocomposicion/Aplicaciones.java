package com.mycompany.ejemplocomposicion;

public class Aplicaciones {
    private String nombre;
    private String tipoAplicacion;
    private float espacio;

    public Aplicaciones(String nombre, String tipoAplicacion, float espacio) {
        this.nombre = nombre;
        this.tipoAplicacion = tipoAplicacion;
        this.espacio = espacio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoAplicacion() {
        return tipoAplicacion;
    }

    public void setTipoAplicacion(String tipoAplicacion) {
        this.tipoAplicacion = tipoAplicacion;
    }

    public float getEspacio() {
        return espacio;
    }

    public void setEspacio(float espacio) {
        this.espacio = espacio;
    }

    public void mostrar(){
        System.out.println(this.getNombre() + "\t\t" + this.getTipoAplicacion() + "\t\t"+ this.getEspacio());
        
    }
}
