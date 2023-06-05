package com.mycompany.ejemploagregacion;

import java.util.ArrayList;

public class Laptop {
    private String marca;
    private String modelo;
    private String color;
    private int almacenamiento;
    private int procesador;
    private ArrayList<Cargador> cargador; 
    private ArrayList<Usb> usb;
    private ArrayList<Auricular> auricular;
    private char estado;

    public Laptop(String marca, String modelo, String color, int almacenamiento, int procesador, ArrayList<Cargador> cargador,
            ArrayList<Usb> usb, ArrayList<Auricular> auricular, char estado) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.almacenamiento = almacenamiento;
        this.procesador = procesador;
        this.cargador = cargador;
        this.usb = usb;
        this.auricular = auricular;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int getProcesador() {
        return procesador;
    }

    public void setProcesador(int procesador) {
        this.procesador = procesador;
    }

    public ArrayList<Cargador> getCargador() {
        return cargador;
    }

    public void setCargador(ArrayList<Cargador> cargador) {
        this.cargador = cargador;
    }

    public ArrayList<Usb> getUsb() {
        return usb;
    }

    public void setUsb(ArrayList<Usb> usb) {
        this.usb = usb;
    }

    public ArrayList<Auricular> getAuricular() {
        return auricular;
    }

    public void setAuricular(ArrayList<Auricular> auricular) {
        this.auricular = auricular;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }
    
    public void mostrar(){
      System.out.println("\nMOSTRANDO DATOS DE LA LAPTOP");
      System.out.println("*************************************************************************************");
      System.out.println("MARCA            : " + this.getMarca());
      System.out.println("MODELO           : " + this.getModelo());
      System.out.println("COLOR            : " + this.getColor());
      System.out.println("ALMACENAMIENTO   : " + this.getAlmacenamiento());
      System.out.println("PROCESADOR Core i: " + this.getProcesador());
      System.out.println("ESTADO           : " + this.getEstado());
      System.out.println("*************************************************************************************");
      System.out.println("\nDATOS DEL CARGADOR DE LAPTOP " + this.getMarca() + " " + this.getModelo() + " SON: ");  
      System.out.println("SEC\tMARCA\tCOLOR\tVOLTIOS\tAMPERIOS\tESTADO");
      for (int i = 0; i< this.getCargador().size(); i++ ){
            System.out.print((i+1)+ "\t");
            cargador.get(i).mostrar();  
        }
        System.out.println("\nMOSTRANDO  DATOS DEL USB...");
      System.out.println("SEC\tMARCA\tCOLOR\tCAPACIDAD");
      for (int i = 0; i< this.getUsb().size(); i++ ){
            System.out.print((i+1)+ "\t");
            usb.get(i).mostrar();
        } 
       System.out.println("\nMOSTRANDO DATOS DEL AURICULAR...");
      System.out.println("SEC\tMARCA\tCOLOR\tESTILO");
      for (int i = 0; i< this.getAuricular().size(); i++ ){
            System.out.print((i+1)+ "\t");
            auricular.get(i).mostrar();
      }    
    }
}
