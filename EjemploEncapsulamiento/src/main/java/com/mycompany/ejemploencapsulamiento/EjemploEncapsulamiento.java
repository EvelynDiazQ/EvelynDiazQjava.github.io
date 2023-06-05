package com.mycompany.ejemploencapsulamiento;

public class EjemploEncapsulamiento {
    
    public static void main(String[] args) {
         
        Estudiante est1 =  new Estudiante ("DIAZ","EVELYN",19); //SE CREA UN OBJETO Y SE INGRESAN LOS VALORES DE CADA ATRIBUTO
        //SE HACE USO DEL GET PARA OBTENER EL VALOR DE UN ATRIBUTO ENCAPSULADO
        System.out.println("APELIIDO: " + est1.getApellido()); //VA A MOSTRAR POR PANTALLA EL APELLIDO 
        System.out.println("NOMBRE: " + est1.getNombre()); //VA A MOSTRAR POR PANTALLA EL NOMBRE
        System.out.println("EDAD: " + est1.getEdad()); //VA A MOSTRAR POR PANTALLA LA EDAD
        System.out.println("ESTUDIANTE : " + est1.getNombre() + "-" + est1.getApellido()+ " tiene " + est1.getEdad() +" años de edad"); //MUESTRA TODOS LOS VALORES JUNTOS
        
    }
}
