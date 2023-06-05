package com.mycompany.classscanner;

import java.util.Scanner;

public class ClassScanner {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("INTRODUCE TU NOMBRE: ");
        
        String nombreUsuario = entrada.nextLine();
        
        System.out.println("DIGITE SU EDAD:  ");
        
        int edad = entrada.nextInt();
        
        System.out.println("Hola " + nombreUsuario + "." + " El año que viene tendrás " +  (edad + 1)+ " años");
    }
}
