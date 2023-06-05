package com.mycompany.ejemploencapsulamiento;
public class Estudiante {
    // SE ESTABLECEN LOS ATRIBUTOS, POR DEFECTO TODOS LOS ATRIBUTOS  DE UNA CLASE TIENEN QUE SER 
    // PRIVADOS, PARA PROTEGERLOS DE QUE NO CUALQUIER OTRA CLASE PUEDA ACCEDER A ELLOS Y HACER USO DE LOS GETTERS Y SETTERS
    private String apellido;
    private String nombre;
    private int edad;
  
    public Estudiante (){ //COSTRUCTOR VACÍO ENCAPSULADO COMO PÚBLICO
        
    }
    
    public Estudiante(String apellido, String nombre, int edad) { // MÉTODO COSTRUCTOR CON LOS PARÁMETROS, MÉTODO PÚBLICO PARA QUE SE PUEDA ACCEDER 
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getApellido() { 
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "apellido=" + apellido + ", nombre=" + nombre + ", edad=" + edad + '}';
    }   
}
