package com.mycompany.cola2estudiante_6_9_22;
import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Cola2Estudiante_6_9_22 {

    public static void main(String[] args) {
        Queue<Estudiante> cola_estudiante = new LinkedList<Estudiante>();
        menuPrincipal(cola_estudiante);
    }
    
    public static void menuPrincipal(Queue<Estudiante> cola_est){
        int opcion; Scanner entrada = new Scanner(System.in);
        System.out.println("\nMENU PRINCIPAL");
        System.out.println("1. INGRESAR ESTUDIANTES");
        System.out.println("2. MOSTRAR ESTUDIANTES");
        System.out.println("3. CONSULTAR ESTUDIANTE EN COLA");
        System.out.println("4. ATENDER A TODOS LOS ESTUDIANTES");
        System.out.println("5. SALA DE ESPERA");
        System.out.println("6. SALIR");
        System.out.print("DIGITE UNA OPCION: ");
        opcion = entrada.nextInt();
        switch(opcion){
            case 1:
                ingresarEstudiantesEnCola(cola_est); menuPrincipal(cola_est); break;
            case 2: 
                mostrarEstudiantesEnCola(cola_est); menuPrincipal(cola_est); break;
            case 3: 
                System.out.println("EL ESTUDIANTE QUE SERA ATENDIDO ES: " + consultarPrimerElemento(cola_est));
                menuPrincipal(cola_est);break;
            case 4:
                vaciarCola(cola_est );menuPrincipal(cola_est); break;
            case 5:
                salaDeEspera(cola_est); menuPrincipal(cola_est); break;
        }
    }
    
    public static void ingresarEstudiantesEnCola(Queue<Estudiante> cola_est){
        Scanner entrada = new Scanner(System.in);
        String cedula,nombre; short edad; Date fecha; char estado; int opcion = 1;
        while(opcion == 1){ //agregar más estudiantes
            System.out.print("INGRESE CEDULA:  ");
            cedula = entrada.next();
            System.out.print("INGRESE NOMBRE:  ");
            nombre = entrada.next();
            System.out.print("INGRESE EDAD  :  ");
            edad = entrada.nextShort();
            fecha = new Date();
            estado = 'A';
            Estudiante estud = new Estudiante(cedula, nombre, edad, fecha, estado); // se crea un objeto para añadir los datos ingresados a la cola a traves de la clase estudiante
            cola_est.add(estud); //se añade un elemento de tipo estudiante a la cola 
            do{ //se ingresa estudiantes mientras el usuario lo desee
                System.out.print("\nDESEA INGRESAR OTRO ESTUDIANTE 1-SI, 2-NO:  ");
                opcion = entrada.nextInt();
                if (opcion != 1 && opcion != 2)
                    System.out.println("\nERROR, DIGITE 1 PARA CONTINUAR O DIGITE 2 PARA SALIR...\n");
            }while(opcion != 1 && opcion !=2);
        }
    }
    
    public static Estudiante consultarPrimerElemento(Queue<Estudiante> cola_est){
        return cola_est.peek(); //de vuelve un objeto de tipo estudiante
    }
    
    public static void mostrarEstudiantesEnCola(Queue<Estudiante> cola_est){
        if (!cola_est.isEmpty()){ 
            System.out.println("\nPRESENTANDO LOS ESTUDIANTES EN COLA DE ESPERA...\n");
            for(Estudiante persona: cola_est){ //mostrar sin sacarlo de la cola
                System.out.println(persona);
            }
        }else{
            System.out.println("\nNO HAY ESTUDIANTES EN COLA DE ATENCIÓN...\n");
        }
        
    }
    
    public static void vaciarCola(Queue<Estudiante> cola_est){
        System.out.println("\nVACIANDO TODOS LOS ESTUDIANTES EN LA COLA DE ESPERA...\n");
        while (!cola_est.isEmpty()){
            cola_est.poll(); //saca elementos de la cola
            
        }
        System.out.println("TOTAL DE ELEMENTOS EN COLA: " + cola_est.size()); //size es 0 
    }
    
    public static void salaDeEspera(Queue<Estudiante> cola_est){
        Queue<Estudiante> cola_salaE = new LinkedList<Estudiante>();
        if (!cola_est.isEmpty()){ 
            System.out.println("\nREDIRIGIENDO A LOS ESTUDIANTES A LA SALA DE ESPERA PARA SER "
                    + "ATENDIDO POR UN FUNCIONARIO ESTUDIANTIL...\n");
            for(Estudiante persona: cola_est){
                cola_salaE.add(persona); 
                System.out.println(persona);
            }
        }
         System.out.println("TOTAL DE ELEMENTOS EN LA COLA  : " + cola_salaE.size());
    }
}
