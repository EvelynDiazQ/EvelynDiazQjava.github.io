package com.mycompany.cuenta;
public class Cuenta1 {
    public static void main(String[] args) {
        Cuenta c1;
        c1= new Cuenta(1000.00);
        c1.obtenerSaldo();
        c1.abonar(500);
        c1.obtenerSaldo();
               
    }
    
}
