package com.mycompany.poo_agregacion_auto_rueda;

import java.util.ArrayList;

public class Auto {
    private long numero_chasis;
    private String marca, modelo;
    private float precio;
    private ArrayList<Rueda> ruedas; //la rueda como parte del Auto
    private ArrayList<Puertas> puertas;//la puerta como parte del Auto
    private ArrayList<Asientos> asientos;//el asiento como parte del Auto
    private ArrayList<Motor> motor;//el motor como parte del Auto
    private char estado;

    public Auto(long numero_chasis, String marca, String modelo, float precio, ArrayList<Rueda> ruedas, ArrayList<Puertas> puertas, ArrayList<Asientos> asientos, ArrayList<Motor> motor, char estado) {
        this.numero_chasis = numero_chasis;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.ruedas = ruedas;
        this.puertas = puertas;
        this.asientos = asientos;
        this.motor = motor;
        this.estado = estado;
    }

    public long getNumero_chasis() {
        return numero_chasis;
    }

    public void setNumero_chasis(long numero_chasis) {
        this.numero_chasis = numero_chasis;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public ArrayList<Rueda> getRuedas() {
        return ruedas;
    }

    public void setRuedas(ArrayList<Rueda> ruedas) {
        this.ruedas = ruedas;
    }

    public ArrayList<Puertas> getPuertas() {
        return puertas;
    }

    public void setPuertas(ArrayList<Puertas> puertas) {
        this.puertas = puertas;
    }

    public ArrayList<Asientos> getAsientos() {
        return asientos;
    }

    public void setAsientos(ArrayList<Asientos> asientos) {
        this.asientos = asientos;
    }

    public ArrayList<Motor> getMotor() {
        return motor;
    }

    public void setMotor(ArrayList<Motor> motor) {
        this.motor = motor;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public void mostrar(){
        System.out.println("CHASIS: " + this.getNumero_chasis());
        System.out.println("MARCA:  " + this.getMarca());
        System.out.println("MODELO: " + this.getModelo());
        System.out.println("PRECIO: " + this.getPrecio());
        System.out.println("ESTADO: " + this.getEstado());
        System.out.println("\nLOS DATOS DE LAS RUEDAS DEL " + this.getMarca() + " " + this.getModelo() + " SON: ");
        System.out.println("SEC\tCODIGO\tMARCA\t\tRIN\tPRECIO\tESTADO");
        for (int i = 0; i< this.getRuedas().size(); i++ ){
            System.out.print((i+1)+ "\t");
            ruedas.get(i).mostrar();
        }
        System.out.println("****************************************************************************************");
        System.out.println("\nLOS DATOS DE LAS PUERTAS DEL " + this.getMarca() + " " + this.getModelo() + " SON: ");
        System.out.println("SEC\tCOLOR\tMATERIAL\tESTADO\t\tSEGURIDAD\t\tPOSICION");
        for (int i = 0; i< this.getPuertas().size(); i++ ){
            System.out.print((i+1)+ "\t");
            puertas.get(i).mostrar();
        }
        System.out.println("****************************************************************************************");
        System.out.println("\nMOSTRANDO DESEMPEÑO DEL MOTOR DEL  " + this.getMarca() + " " + this.getModelo() + " SON: ");
        System.out.println("SEC\tLUGAR ENSAMBLAJE\tCOMBUSTIBLE\t\tCAPACIDAD\tCABALLOS DE FUERZA\tTORQUE\tESTADO");
        for (int i = 0; i< this.getMotor().size(); i++ ){
            System.out.print((i+1)+ "\t");
            motor.get(i).mostrar();
        }
        System.out.println("****************************************************************************************");
        System.out.println("\nLOS DATOS DE LOS ASIENTOS DEL " + this.getMarca() + " " + this.getModelo() + " SON: ");
        System.out.println("SEC\tCANTIDAD\tDISEÑO\t\t\tTIPO DE ASIENTO\t\tTAPIZADO\tESTADO");
        for (int i = 0; i< this.getAsientos().size(); i++ ){
            System.out.print((i+1)+ "\t");
            asientos.get(i).mostrar();
        }
    }   
}
