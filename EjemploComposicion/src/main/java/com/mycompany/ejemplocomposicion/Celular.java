package com.mycompany.ejemplocomposicion;

import java.util.ArrayList;

public class Celular {
    private String marca;
    private String modelo;
    private String sistemaOperativo;
    private float tamaño;
    private int memoria;
    private ArrayList<Camara> camaras;
    private ArrayList<Bateria> bateria;
    private ArrayList<Aplicaciones> app;
    private char estado;

    public Celular(String marca, String modelo, String sistemaOperativo, float tamaño, int memoria, ArrayList<Camara> camaras, 
            ArrayList<Bateria> bateria, ArrayList<Aplicaciones> app, char estado) {
        this.marca = marca;
        this.modelo = modelo;
        this.sistemaOperativo = sistemaOperativo;
        this.tamaño = tamaño;
        this.memoria = memoria;
        this.camaras = camaras;
        this.bateria = bateria;
        this.app = app;
        this.estado = estado;
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

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public float getTamaño() {
        return tamaño;
    }

    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public ArrayList<Camara> getCamaras() {
        return camaras;
    }

    public void setCamaras(ArrayList<Camara> camaras) {
        this.camaras = camaras;
    }

    public ArrayList<Bateria> getBateria() {
        return bateria;
    }

    public void setBateria(ArrayList<Bateria> bateria) {
        this.bateria = bateria;
    }

    public ArrayList<Aplicaciones> getApp() {
        return app;
    }

    public void setApp(ArrayList<Aplicaciones> app) {
        this.app = app;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public void mostrar(){
      System.out.println("\nMOSTRANDO DATOS DEL CELULAR");
      System.out.println("*************************************************************************************");
      System.out.println("MARCA            :" + this.getMarca());
      System.out.println("MODELO           :  " + this.getModelo());
      System.out.println("SISTEMA OPERATIVO: " + this.getSistemaOperativo());
      System.out.println("TAMAÑO PANTALLA  : " + this.getTamaño());
      System.out.println("MEMORIA          : " + this.getMemoria());
      System.out.println("ESTADO           : " + this.getEstado());
      System.out.println("*************************************************************************************");
      System.out.println("\nDATOS DE LOS MEGAPÍXELES DE LA CÁMARA DEL " + this.getMarca() + " " + this.getModelo() + " SON: ");  
      System.out.println("SEC\tCANTIDAD\tCAMARA FRONTAL\t\tCAMARA PRINCIPAL\t\tLENTE GRAN ANGULAR\t\tLENTE MACRO");
      for (int i = 0; i< this.getCamaras().size(); i++ ){
            System.out.print((i+1)+ "\t");
            camaras.get(i).mostrar();
        }
      System.out.println("\nDATOS DE LA BATERÍA DEL " + this.getMarca() + " " + this.getModelo() + " SON: ");  
      System.out.println("SEC\tMARCA\t\tMATERIAL\tMILIAMPERIO");
      for (int i = 0; i< this.getBateria().size(); i++ ){
            System.out.print((i+1)+ "\t");
            bateria.get(i).mostrar();
        }
      System.out.println("\n PRESENTNADO APLICACIONES DEL  " + this.getMarca() + " " + this.getModelo() + " SON: ");  
      System.out.println("SEC\tNOMBRE\t\t\tTIPO DE APP\tESPACIO OCUPA");
      for (int i = 0; i< this.getApp().size(); i++ ){
            System.out.print((i+1)+ "\t");
            app.get(i).mostrar();
        }
    }
}
