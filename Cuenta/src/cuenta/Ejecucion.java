package cuenta;
import java.util.Scanner;
public class Ejecucion {
    public static int posicion = 0;
    
    public static void crearCuentaAhorro(Scanner entrada, Cuenta []cta){
        int dc = -1; int num_cta; String titular_cta; float saldo_actual; float ah_meta; char estado;
        int ind = 0;
        do{    
            System.out.println("\nCREACION DE CUENTAS DE AHORRO");
            System.out.println("*****************************");
            System.out.print("INGRESE NUMERO CUENTA : ");
            num_cta = entrada.nextInt();
            System.out.print("INGRESE TITULAR CUENTA: ");
            titular_cta = entrada.next();
            System.out.print("INGRESE SALDO ACTUAL  : ");
            saldo_actual = entrada.nextFloat();
            System.out.print("INGRESE AHORRO META   : ");
            ah_meta = entrada.nextFloat();
            estado = 'A';
            cta[ind] = new Ahorro(num_cta,titular_cta,saldo_actual,estado,ah_meta);
            ind++;
            System.out.println("DATOS GRABADOS CORRECTAMENTE...");
            System.out.print("DIGITE [1] CONTINUAR - DIGITE [2] SALIR AL MENU : ");
            dc = entrada.nextInt();
            System.out.println(dc);
        }while (dc == 1);
    }
    
    public static void crearCuentaCorriente(Scanner entrada, Cuenta []cta){
        int dc = -1; int num_cta; String titular_cta; float saldo_actual; float ah_meta; char estado; String of_cred;
        int ind = 0;
        do{    
            System.out.println("CREACION DE CUENTAS CORRIENTES");
            System.out.println("******************************");
            System.out.print("INGRESE NUMERO CUENTA     : ");
            num_cta = entrada.nextInt();
            System.out.print("INGRESE TITULAR CUENTA    : ");
            titular_cta = entrada.next();
            System.out.print("INGRESE SALDO ACTUAL      :");
            saldo_actual = entrada.nextFloat();
            System.out.print("INGRESE OFICIAL DE CREDITO:");
            of_cred = entrada.next();
            estado = 'A';
            cta[ind] = new Corriente(num_cta,titular_cta,saldo_actual,estado,of_cred);
            ind++;
            System.out.println("DATOS GRABADOS CORRECTAMENTE...");
            System.out.print("DIGITE [1] CONTINUAR - DIGITE [2] SALIR AL MENU : ");
            dc = entrada.nextInt();
        }while (dc == 1);
    }    
    
    public static void consultarSaldos(Cuenta []cta){
        System.out.println("\nCONSULTANDO DATOS DE LAS CUENTAS...");
        for (int i = 0; i < cta.length; i++){
            System.out.println("TIPO CUENTA: " + cta[i].getClass() + " TITULAR: " + cta[i].getTitular() + "  SALDO ACTUAL: " + cta[i].getSaldo_actual());
        }
    }    
    
    public static void generarInteres(Cuenta []cta){
        System.out.println("\nGENERANDO INTERES DE LAS CUENTAS...");
        for (int i = 0; i < cta.length; i++){
            System.out.println("TITULAR: " + cta[i].getTitular() + "  INTERES : " + cta[i].generarInteres());
            cta[i].setSaldo_actual(cta[i].getSaldo_actual() + cta[i].generarInteres());
            System.out.println("SALDO ACTUAL ACTUALIZADO: " + cta[i].getSaldo_actual());
        }        
    }    
    
    public static void depositarAhorro(Cuenta []cta){
        Scanner entrada = new Scanner(System.in); float valor_deposito;
        int numero_cuenta, indice = 0, posicion = -1; boolean encontrado = false; 
        System.out.println("DEPOSITO DE AHORRO");
        System.out.println("******************");
        System.out.print("INGRESAR NUMERO DE CUENTA: ");
        numero_cuenta = entrada.nextInt();
        while(indice < cta.length && encontrado == false){
            if (cta[indice].getNumero() == numero_cuenta){
                posicion = indice;
                encontrado = true;
            }
            indice++;
        }
        if (encontrado == true){
            System.out.println("TITULAR: " + cta[posicion].getTitular());
            System.out.print("INGRESAR VALOR DEL DEPOSITO: ");
            valor_deposito = entrada.nextFloat();
            cta[posicion].setSaldo_actual(valor_deposito + cta[posicion].getSaldo_actual());
            System.out.println("SALDO ACTUAL: " + cta[posicion].getSaldo_actual());
            System.out.println("\nDEPOSITO REALIZADO CON EXITO...\n");
        }
        else{
            System.out.println("\nCUENTA NO EXISTE...\n");
        }
    }
    
    public static void menuPrincipal(Scanner entrada, Cuenta []cta){
        System.out.println("      MENU PRINCIPAL");
        System.out.println("******************************");
        System.out.println("1. APERTURAR CUENTA AHORRO");
        System.out.println("2. APERTURAR CUENTA CORRIENTE");
        System.out.println("3. DEPOSITO EN CUENTA DE AHORRO");
        System.out.println("4. DEPOSITO EN CUENTA CORRIENTE");
        System.out.println("5. CONSULTAR SALDOS DE CUENTAS");
        System.out.println("6. GENERAR INTERES");
        System.out.println("7. SALIR");
        System.out.print("DIGITE UNA OPCION: ");
        int opcion = entrada.nextInt();
        switch(opcion){
            case 1:crearCuentaAhorro(entrada,cta);menuPrincipal(entrada,cta);break;
            case 2:crearCuentaCorriente(entrada,cta);menuPrincipal(entrada,cta);break;
            case 3:depositarAhorro(cta);menuPrincipal(entrada,cta);break;
            //case 4:depositarCorriente(cta);menuPrincipal(entrada,cta);break;
            case 5:consultarSaldos(cta);menuPrincipal(entrada,cta);break;
            case 6:generarInteres(cta);menuPrincipal(entrada,cta);break;
            
       }
    }
    
    public static void main(String arg[]){
        Scanner entrada = new Scanner(System.in);
        final int MAX = 2;
        Cuenta [] cta = new Cuenta[MAX];        
        menuPrincipal(entrada,cta);
        
        /*Ahorro ah     = new Ahorro(1010,"JOSE GARCIA",100.0f,'A',5000.0f);
        Corriente cte = new Corriente(2010,"SONIA ABAD",1200.0f,'A',"Joel Briones");
        
        final int MAX = 2;
        Cuenta [] cta = new Cuenta[MAX];
        
        cta[0] = ah;
        cta[1] = cte;
        
        for (int i = 0; i < cta.length; i++){
            System.out.println("INTERES : " + cta[i].generarInteres());
            cta[i].setSaldo_actual(cta[i].getSaldo_actual()+cta[i].generarInteres());
            System.out.println("SALDO ACTUAL: " + cta[i].getSaldo_actual());
        }
        */
        
        
    }
}
