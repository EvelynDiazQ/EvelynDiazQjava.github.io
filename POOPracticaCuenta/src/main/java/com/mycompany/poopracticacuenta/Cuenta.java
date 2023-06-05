package com.mycompany.poopracticacuenta;

public class Cuenta {
    private int numero;
    private String titular;
    private double saldo;
    private char estado;
    
    public Cuenta (){}

    public Cuenta(int numero, String titular, double saldo, char estado) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public void retirar (double retiro){
        this.setSaldo(this.getSaldo()- retiro);
    }
    
    public void abonar(double abono){
        this.setSaldo(abono + this.getSaldo());
    }
    
    public void obtenerSaldo (){
        System.out.println("\n\nLA CUENTA DE "+this.getTitular()+" CON NUMERO "+this.getNumero()+ "Y ESTADO :" + this.getEstado());
        System.out.println(" TIENE UN SALDO DE "+this.getSaldo()+" DOLARES.");
    }    
}
