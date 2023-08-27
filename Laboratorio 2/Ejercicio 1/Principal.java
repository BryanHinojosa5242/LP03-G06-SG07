package cuentaBanco;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CuentaBanco cb = new CuentaBanco();
		double cantidad=0.00;
		System.out.println("Ingrese el nombre del titular: ");
		String titular = sc.next();
		cb.setTitular(titular);
		
		
		System.out.println("Desea ingresar una cantidad(si/no): ");
		String rp = sc.next();
		if (rp.equals("si")) {
		    System.out.println("Ingrese la cantidad: ");
		     cantidad = sc.nextDouble();
		    cb.ingresar(cantidad);
		    System.out.println(cb.toString());
		}
		if(rp.equals("no")) {
		    System.out.println(cb.toString());
		}
		Scanner sn = new Scanner(System.in);
	       boolean salir = false;
	       int opcion;
	        
	       while(!salir){
	    	   System.out.println("\n============MENU============");
	           System.out.println("=====1. INGRESAR============");
	           System.out.println("=====2. RETIRAR=============");
	           System.out.println("=====3. MOSTRAR SALDO ======");
	           System.out.println("=====4. Salir===============");
	           System.out.println("\nEscribe una de las opciones: ");
	           opcion = sn.nextInt();
	            
	           switch(opcion){
	               case 1:
	            	   System.out.println("Ingrese la cantidad: ");
	       		     cantidad = sc.nextDouble();
	       		    cb.ingresar(cantidad);
	       		    System.out.println(cb.toString());
	                   break;
	               case 2:
	                   System.out.println("Ingrese la cantidad: ");
	                    cantidad = sc.nextDouble();
		       		   cb.retirar(cantidad);
		       		   System.out.println(cb.toString());
	                   break;
	                case 3:
	                	System.out.println(cb.toString());
	                   break;
	                case 4:
	                   salir=true;
	                   break;
	                default:
	                   System.out.println("Solo números entre 1 y 4");
	           }    
	       }
		
	}

}
