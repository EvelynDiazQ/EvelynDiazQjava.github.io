package com.mycompany.poo_agregacion_auto_rueda;

import java.util.ArrayList;

public class POO_Agregacion_Auto_Rueda {
    
    //método rápido
    
    public static void main(String[] args) {
      //1. CREAR LAS RUEDAS
      Rueda rueda1, rueda2, rueda3, rueda4;
      rueda1 = new Rueda(1000,"PIRELLI", 15, 95.00f, 'N');
      rueda2 = new Rueda(1001,"PIRELLI", 15, 95.00f, 'N');
      rueda3 = new Rueda(1002,"PIRELLI", 15, 95.00f, 'N');
      rueda4 = new Rueda(1003,"PIRELLI", 15, 95.00f, 'N');
      ArrayList<Rueda> llantas = new ArrayList <Rueda>();
      llantas.add(rueda1);
      llantas.add(rueda2);
      llantas.add(rueda3);
      llantas.add(rueda4);
      
      //4. CREAR PUERTAS
     
      Puertas puerta1, puerta2, puerta3, puerta4, puerta5;
      puerta1 = new Puertas("NEGRO", "ACERO", 'N', "CON SEGURO", "DELANTE-IZQUIERDA" );
      puerta2 = new Puertas("NEGRO", "ACERO", 'N', "CON SEGURO", "DELANTE-DERECHA");
      puerta3 = new Puertas("NEGRO", "ACERO", 'N', "CON SEGURO", "ATRÁS-IZQUIERDA");
      puerta4 = new Puertas("NEGRO", "ACERO", 'N', "CON SEGURO", "DELANTE-DERECHA");
      puerta5 = new Puertas("NEGRO", "ACERO", 'N', "CON SEGURO", "MALETERO");
      ArrayList<Puertas> pt = new ArrayList <Puertas>();
      pt.add(puerta1);
      pt.add(puerta2);
      pt.add(puerta3);
      pt.add(puerta4);
      pt.add(puerta5);
    
      //5. CREAR MOTOR
      
      Motor motor1;
      motor1 = new Motor ("USA","GASOLINA PREMIUN",1.4f ,191,182,'N');
      ArrayList<Motor> motorAuto = new ArrayList <Motor>();        
      motorAuto.add(motor1);
      
      //6.CREAR ASIENTOS
      
      Asientos asiento1, asiento2, asiento3, asiento4, asiento5,asiento6;
      asiento1 = new Asientos(1,"RECLINABLES", "PILOTO    ", "NEGRO", 'N');
      asiento2 = new Asientos(1,"RECLINABLES", "COPILOTO  ", "NEGRO", 'N');
      asiento3 = new Asientos(1,"RECLINABLES", "PASAJERO 1", "NEGRO", 'N');
      asiento4 = new Asientos(1,"RECLINABLES", "PASAJERO 2", "NEGRO", 'N');
      asiento5 = new Asientos(1,"RECLINABLES", "PASAJERO 3", "NEGRO", 'N');
      asiento6 = new Asientos(1,"RECLINABLES", "PASAJERO 4", "NEGRO", 'N');
      
      ArrayList<Asientos> asiento = new ArrayList <Asientos>();
      asiento.add(asiento1);
      asiento.add(asiento2);
      asiento.add(asiento3);
      asiento.add(asiento4);
      asiento.add(asiento5);
      asiento.add(asiento6);
      //2. CREAR EL AUTO
      Auto automobil1;
      automobil1 = new Auto(150150150,"KIA", "SORENTO", 20000.00f, llantas,pt,asiento,motorAuto,'N');
      
      //3. MOSTRAR LOS DATOS PARA VERIFICAR QUE SE GRABARON CORRECTAMENTE
      automobil1.mostrar();
    
    }
}
