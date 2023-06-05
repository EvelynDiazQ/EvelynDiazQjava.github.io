package com.mycompany.cola2estudiante_6_9_22;
import java.util.Date;
public class Estudiante {
    private String cedula;
    private String nombre;
    private short edad;
    private Date fecha_ingreso;
    private char estado;

    public Estudiante(String cedula, String nombre, short edad, Date fecha_ingreso, char estado) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.fecha_ingreso = fecha_ingreso;
        this.estado = estado;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public short getEdad() {
        return edad;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "cedula=" + cedula + ", nombre=" + nombre + ", edad=" + edad + ", fecha_ingreso=" + fecha_ingreso + ", estado=" + estado + '}';
    }
    
}
