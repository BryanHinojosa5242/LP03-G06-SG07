package agendacontacto;

import java.util.ArrayList;
import java.util.Scanner;

public class AgendaContacto {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Contacto> contactos = new ArrayList<Contacto>();
        String nombre, telefono;
        boolean encontrado;
        int op = 0;
        do {
            System.out.println("\nMenu");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Modificar contacto");
            System.out.println("4. Borrar contacto");
            System.out.println("5. Eliminar contactos");
            System.out.println("6. Mostrar contactos");
            System.out.println("7. Salir");
            System.out.print("Ingrese una opcion: ");
            op = entrada.nextInt();
            switch(op) {
                case 1:
                    aniadirContacto(entrada, contactos);
                    break;
                case 2:
                    System.out.println("Buscar por:");
                    System.out.println("1. Nombre");
                    System.out.println("2. Numero de telefono");
                    System.out.print("Ingrese: ");
                    op = entrada.nextInt();
                    switch(op) {
                        case 1:
                            System.out.print("Ingrese el nombre del contacto: ");
                            nombre = entrada.next();
                            encontrado = buscarContacto(contactos, nombre);
                            if (!encontrado) {
                                System.out.println("No se han encontrado contactos con el nombre '" + nombre + "'");
                            }
                            break;
                        case 2:
                            System.out.print("Ingrese el numero de telefono del contacto: ");
                            telefono = entrada.next();
                            encontrado = buscarContacto(contactos, telefono);
                            if (!encontrado) {
                                System.out.println("\nNo se han encontrado contactos con el nombre '" + telefono + "'");
                            }
                            break;
                    }
                    break;
                case 3:
                    mostrarContacto(contactos);
                    System.out.print("Ingrese el nombre del contacto a modificar: ");
                    nombre = entrada.next();
                    encontrado = modificarContacto(entrada, contactos, nombre);
                    if (!encontrado) {
                        System.out.println("\nNo se han encontrado contactos con el nombre'" + nombre + "'");
                    }
                    break;
                case 4:
                    mostrarContacto(contactos);
                    System.out.print("\nIngrese el nombre del contacto que desea borrar: ");
                    nombre = entrada.next();
                    encontrado = borrarContacto(contactos, nombre);
                    if (!encontrado) {
                        System.out.println("\nNo se han encontrado contactos con el nombre '" + nombre + "'");
                    }
                    break;
                case 5:
                    System.out.println("\n¿Esta seguro que quiere eliminar todos los contactos?");
                    System.out.println("1. Si");
                    System.out.println("2. No");
                    System.out.print("Ingrese: ");
                    op = entrada.nextInt();
                    switch(op) {
                        case 1:
                            contactos.clear();
                            System.out.println("\nContactos eliminados exitosamente");
                            break;
                        case 2:
                            break;
                        default:
                            System.out.println("\nNo se ha ingresado una opcion valida. No se han eliminado los contactos");
                            break;
                    }
                    break;
                case 6:
                    if (!contactos.isEmpty()) {
                        mostrarContacto(contactos);
                    }
                    else {
                        System.out.println("\nTiene 0 contactos actualmente");
                    }
                    break;
                case 7:
                    System.out.println("\nSaliendo del programa...");
                    break;
                default:
                    System.out.println("\nIngrese una de las anteriores opciones ");
                    break;
            }
        } while (op!=7);
    }
    public static void aniadirContacto(Scanner entrada, ArrayList<Contacto> contactos) {
        String nombre, telefono, direccion;
        System.out.print("\nIngrese el nombre del contacto: ");
        nombre = entrada.next();
        System.out.print("Ingrese el numero de telefono del contacto: ");
        telefono = entrada.next();
        System.out.print("Ingrese la direccion del contacto: ");
        direccion = entrada.next();
        Contacto obj = new Contacto(nombre,telefono,direccion);
        contactos.add(obj);
    }
    public static boolean buscarContacto(ArrayList<Contacto> contactos, String dato) {
        boolean encontrado = false;
        for(Contacto i : contactos) {
            if(i.getNombre().equalsIgnoreCase(dato) || i.getTelefono().equalsIgnoreCase(dato)) {
                System.out.println("\nNombre: " + i.getNombre());
                System.out.println("Numero de telefono: " + i.getTelefono());
                System.out.println("Direccion: " + i.getDireccion());
                encontrado = true;
            }
        }
        return encontrado;
    }
    public static boolean modificarContacto(Scanner entrada, ArrayList<Contacto> contactos, String nombre) {
        String nuevoNombre, nuevaDireccion;
        boolean encontrado = false;
        for (Contacto i : contactos) {
            if(i.getNombre().equals(nombre)) {
                System.out.print("Ingrese el nuevo nombre para el contacto: ");
                nuevoNombre = entrada.next();
                System.out.print("Ingrese la nueva direccion para el contacto: ");
                nuevaDireccion = entrada.next();
                i.setNombre(nuevoNombre);
                i.setDireccion(nuevaDireccion);
                System.out.println("\nContacto modificado exitosamente");
                encontrado = true;
                return encontrado;
            }
        }
        return encontrado;
    }
    public static boolean borrarContacto(ArrayList<Contacto> contactos, String nombre) {
        boolean encontrado = false;
        for (int i=0; i<contactos.size(); i++) {
            if(contactos.get(i).getNombre().equals(nombre)) {
                contactos.remove(i);
                System.out.println("\nContacto eliminado exitosamente");
                encontrado = true;
                return encontrado;
            }
        }
        return encontrado;
    }
    public static void mostrarContacto(ArrayList<Contacto> contactos) {
        for(int i=0; i<contactos.size(); i++) {
            System.out.println("\nContacto " + (i+1));
            System.out.println("Nombre: " + contactos.get(i).getNombre());
            System.out.println("Telefono: " + contactos.get(i).getTelefono());
            System.out.println("Direccion: " + contactos.get(i).getDireccion());
        }
    }
}