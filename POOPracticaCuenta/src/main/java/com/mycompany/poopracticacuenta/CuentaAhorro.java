package com.mycompany.poopracticacuenta;

public class CuentaAhorro {
    private float balance;
    private final float interes = 0.01f;
    private String nombre;

    public CuentaAhorro(float balance, String nombre) {
        this.balance = balance;
        this.nombre = nombre;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "CuentaAhorro{" + "balance=" + balance + ", interes=" + interes + ", nombre=" + nombre + '}';
    }
    
}
