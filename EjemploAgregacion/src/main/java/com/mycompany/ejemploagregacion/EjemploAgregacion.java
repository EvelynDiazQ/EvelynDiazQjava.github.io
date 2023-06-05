package com.mycompany.ejemploagregacion;
import java.util.ArrayList;
public class EjemploAgregacion {
    public static void main(String[] args) {
        
        Cargador c1;
        c1 = new Cargador("Hp", "NEGRO",125, 7, 'N');
        
        ArrayList<Cargador> carga = new ArrayList<Cargador>();
        carga.add(c1);
        
        Usb u1, u2;
        u1 = new Usb ("Hp  ", "AZUL", 32);
        u2 = new Usb ("SanDisk", "GRIS", 128);
        
        ArrayList<Usb> usb = new ArrayList<Usb>();
        usb.add(u1);
        usb.add(u2);
        
        Auricular a1;
        a1 = new Auricular("SONY", "NEGRO", "PORTÁTILES");
        
        ArrayList<Auricular> auricular = new ArrayList<Auricular>();
        auricular.add(a1);
        
        //CREAR LAPTOP
        Laptop laptop1;
        laptop1 = new Laptop ("HP", "14-dq1004la", "GRIS", 256, 5, carga, usb, auricular,'N');
        
        //MOSTRAR LOS DATOS PARA VERIFICAR QUE SE GRABARON CORRECTAMENTE
        laptop1.mostrar();
    }
}
