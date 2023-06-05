package com.mycompany.poopracticacuenta;

import java.util.Scanner;

public class POOPracticaCuenta {

    public static void retirarDinero (Cuenta cta){
        float retiro; Scanner entrada = new Scanner (System.in);
        do{
            System.out.println("INGRESE EL VALOR QUE DESEA RETIRAR: ");
            retiro = entrada.nextInt();
            if (retiro <= 0)
                System.out.println("ERROR, RETIRO INCORRECTO. DEBE RETIRAR DESDE UN DOLAR EN ADELANTE...");
        } while (retiro <= 0);
        
        do {
            if (retiro >= cta.getSaldo())
                System.out.println("ERROR, SALDO INSUFICIENTE...");
                System.out.println("INGRESE EL VALOR QUE DESEA RETIRAR: ");
                retiro = entrada.nextInt();
        }while (retiro >= cta.getSaldo());
        
        cta.retirar(retiro);
        System.out.println("\n\nRETIRO REALIZADO CON EXITO");
    }
        public static void consultarSaldo (Cuenta cta){
        cta.obtenerSaldo();
        
    }

    
    public static void generarIntereses(Cuenta cta){
        cta.obtenerSaldo();
        
    }
        
    
    public static void depositarAbono (Cuenta cta){
        double abono; Scanner entrada = new Scanner (System.in);
        System.out.println("\n\nDEPOSITANDO ABONO EN LA CUENTA...");
        do{
            System.out.print("INGRESE EL VALOR DEL ABONO: ");
            System.out.println("SU INTERES ES DE: 0.5");
            abono = entrada.nextDouble();
            if (abono <= 0)
                System.out.println("ERROR, ABONO INCORRECTO. DEBE ABONAR DESDE UN DOLAR EN ADELANTE..."); 
        } while (abono <= 0);
        cta.abonar(abono);//actualizando el saldo inicial de la cuenta con el abono
        System.out.println("\nDEPOSITO DE EFECTIVO REALIZADO CORRECTAMENTE\n");
        cta.obtenerSaldo();
    }
    
    public static void crearCuenta (Cuenta cta){
        Scanner entrada = new Scanner (System.in);
        int numero_cta; String titular;
        do{
            System.out.print("INGRESE EL NUMERO DE CUENTA: ");
            numero_cta = entrada.nextInt();
            if (numero_cta <= 9999)
                System.out.println("ERROR, NUMERO DE CUENTA INCORRECTO. DEBE CONTENER MINIMO 5 NUMEROS ENTEROS"); 
        }while (numero_cta <= 9999);
        
        do{
            System.out.print("INGRESE EL TITULAR DE LA CUENTA: ");
            titular = entrada.next();
            if (titular == null)
                System.out.println("ERROR, EL TITUTALR NO DEBE CONTENER NULOS. POR FAVOR INGRESE UN NOMBRE"); 
        }while (titular == null);
        
        cta.setNumero(numero_cta);
        cta.setTitular(titular);
        cta.setSaldo(0);
    }
    
    public static void menu(Cuenta cta){
        //opcion variable1
        //entrada variable para el escaner 
        int opcion; Scanner entrada = new Scanner (System.in);
        System.out.println("\n\nMENU PRINCIPAL");
        System.out.println("1. CREAR CUENTA");
        System.out.println("2. DEPOSITAR");
        System.out.println("3. RETIRAR");
        System.out.println("4. CONSULTAR");
        System.out.println("5. SALIR");
        System.out.println("DIGITE OPCION: ");
        opcion = entrada.nextInt();
        
        switch (opcion){
            case 1: crearCuenta(cta);menu(cta);break;
            case 2: depositarAbono(cta); menu(cta); break;
            case 3: retirarDinero(cta); menu(cta);break;
            case 4: consultarSaldo(cta); menu(cta); break;
        }
    }
    
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta ();
        menu(cuenta1);}
    }
    

