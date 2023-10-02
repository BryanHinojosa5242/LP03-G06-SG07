package testcomposicion;

import java.util.ArrayList;
import java.util.Scanner;

public class TestComposicion {
    public static void main(String[] args) {
        int id, op;
        String nombre, apellido;
        char tipoCliente;
        int cantidad;
        
        ArrayList<Persona> personas = new ArrayList<Persona>();
        Scanner entrada = new Scanner(System.in);
        
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Agregar persona");
            System.out.println("2. Retirar");
            System.out.println("3. Depositar");
            System.out.println("4. Mostrar persona");
            System.out.print("Ingrese una opcion: ");
            op = entrada.nextInt();
            switch(op) {
                case 1:
                    System.out.print("Ingrese id: ");
                    id = entrada.nextInt();
                    System.out.print("Ingrese nombre: ");
                    nombre = entrada.next();
                    System.out.print("Ingrese apellido: ");
                    apellido = entrada.next();
                    System.out.println("Ingrese tipo de cliente: ");
                    System.out.print("C, B o E: ");
                    tipoCliente = entrada.next().charAt(0);
                    Persona perObj = new Persona(id, nombre, apellido, tipoCliente);
                    agregarPersonas(personas, perObj);
                    break;
                case 2:
                    if (!personas.isEmpty()) {
                        mostrarPersonas(personas);
                        System.out.print("Ingrese el nombre de la persona: ");
                        nombre = entrada.next();
                        System.out.print("Ingrese la cantidad a retirar: ");
                        cantidad = entrada.nextInt();
                        if(retirar(personas, nombre, cantidad)) {
                            System.out.println("Cantidad retirada exitosamente");
                        }
                        else {
                            System.out.println("No se encontro a una persona con el nombre '" + nombre + "'");
                        }
                    }
                    else {
                        System.out.println("\nAgrege personas\n");
                    }
                    break;
                case 3:
                    if (!personas.isEmpty()) {
                        mostrarPersonas(personas);
                        System.out.print("Ingrese el nombre de la persona: ");
                        nombre = entrada.next();
                        System.out.print("Ingrese la cantidad a depositar: ");
                        cantidad = entrada.nextInt();
                        if(depositar(personas, nombre, cantidad)) {
                            System.out.println("Cantidad depositada exitosamente");
                        }
                        else {
                            System.out.println("No se encontro a una persona con el nombre '" + nombre + "'");
                        }
                    }
                    else {
                        System.out.println("\nAgrege personas\n");
                    }
                    break;
                case 4:
                    mostrarPersonas(personas);
                    break;
            }
        } while(op != 5);
        
    }
    
    public static void agregarPersonas(ArrayList<Persona> personas, Persona perObj) {
        if (!personas.contains(perObj)) {
            personas.add(perObj);
        }
        else{
            System.out.println("Ya existe esta persona");
        }
    }
    
    public static void mostrarPersonas(ArrayList<Persona> personas) {
        for(Persona i : personas) {
            System.out.println(i);
        }
    }
    public static boolean retirar(ArrayList<Persona> personas, String nombre, int cantidad) {
        boolean encontrado = false;
        for(Persona i : personas) {
            if (i.getNombre().equals(nombre)) {
                i.retirar(cantidad);
                encontrado = true;
            }
        }
        return encontrado;
    }
    public static boolean depositar(ArrayList<Persona> personas, String nombre, int cantidad) {
        boolean encontrado = false;
        for(Persona i : personas) {
            if (i.getNombre().equals(nombre)) {
                i.depositar(cantidad);
                encontrado = true;
            }
        }
        return encontrado;
    }
    
}
    
