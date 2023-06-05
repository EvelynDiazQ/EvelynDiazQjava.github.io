package com.mycompany.cuenta;


public class Cuenta {
    private double saldo;
    
    public Cuenta (double saldo){
        this.saldo = saldo;
    }
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo =saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + '}';
    }
    
    public void abonar (float abono){
        //cuenta + abono//
        this.setSaldo(this.getSaldo() + abono); 
        //saldo=this.getSaldo() + abono;
        
    }
    
    public void obtenerSaldo(){
        System.out.println("El saldo de su cuenta es:" +this.getSaldo() );
                   
    }
    
}


  