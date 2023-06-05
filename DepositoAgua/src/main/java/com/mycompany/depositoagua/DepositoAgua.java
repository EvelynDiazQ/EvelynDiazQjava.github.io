package com.mycompany.depositoagua;

public class DepositoAgua {
   
    public static void main(String[] args) {
        float cantidadAgua, desbordamiento = 0;
        Deposito deposito1 = new Deposito();
        Deposito depositoaux = new Deposito();
        
        deposito1.quitarAgua(10);
        
        //deposito1.agregarAgua(500);
        
        cantidadAgua= 1200.00f;
        if (deposito1.verificarDesbordamiento(cantidadAgua)== false){
            deposito1.agregarAgua(cantidadAgua);
        }   
            else{  //desbordamiento y se agrega agua al deposito auxiliar 
                desbordamiento = deposito1.calcularDesbordamiento(cantidadAgua);
                deposito1.agregarAgua(cantidadAgua);
                depositoaux.agregarAgua(desbordamiento);
                
            }
        
        
        
        System.out.println("DEPOSITO 1: " + deposito1.consultarVolumenActual());// consultar deposito 1
        System.out.println("DEPOSITO AUXILIAR: " + depositoaux.consultarVolumenActual());// consultar deposito auxiliar

        //deposito1.agregarAgua(800);
        
        
    }
}
