package com.mycompany.ejemplocomposicion;

import java.util.ArrayList;

public class EjemploComposicion {

    public static void main(String[] args) {
      
      Camara c1;
      c1 = new Camara(1,32,48,12,5);
      
      ArrayList<Camara> cam = new ArrayList <Camara>();
      cam.add(c1);
      
      Bateria bat;
      bat = new Bateria ("SAMSUNG", "LITIO", 4000);
      
      ArrayList<Bateria> b1 = new ArrayList <Bateria>();
      b1.add(bat);
      
      Aplicaciones app1, app2, app3;
      app1 = new Aplicaciones("CONTACTOS ","NATIVA", 7.54f);
      app2 = new Aplicaciones("CAMARA    ","NATIVA", 5.20f);
      app3 = new Aplicaciones("CALENDARIO","NATIVA", 100.0f);
      ArrayList<Aplicaciones> app = new ArrayList <Aplicaciones>();
      app.add(app1);
      app.add(app2);
      app.add(app3);
      
      // CREAR  CELULAR
      Celular celular1;
      celular1 = new Celular("SAMSUMG", "A51", "ANDROID", 6.5f, 128,cam,b1,app, 'N');
      
      // MOSTRAR LOS DATOS PARA VERIFICAR QUE SE GRABARON CORRECTAMENTE
      celular1.mostrar();
    }
}
