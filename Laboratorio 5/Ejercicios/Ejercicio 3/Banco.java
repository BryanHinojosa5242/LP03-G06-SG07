package testasociacion;

import java.util.Arrays;

public class Banco {
    private String nombre;
    private Persona clientes[];
    
    public Banco(String nombre) {
        this(nombre,20);
    }
    public Banco(String nombre, int numCli) {
        this.nombre = nombre;
        this.clientes = new Persona[numCli];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona[] getClientes() {
        return clientes;
    }

    public void setClientes(Persona[] clientes) {
        this.clientes = clientes;
    }
    
    public void agregarCliente(Persona persona) {
        int numClientes = 0;
        boolean encontrado = false;
        
        for(Persona i : clientes) { // halla la cantidad actual de clientes
            if (i != null) {
                numClientes++;
            }
        }
        
        for(int i = 0; i < numClientes; i++) {
            if (clientes[i] == persona) {  // compara el cliente actual en "i" con la persona que se quiere agregar
                encontrado = true;
                break;
            }
        }
        
        if (encontrado == false) {   // añade al cliente si no existe
            clientes[numClientes] = persona;
        }
        else {
            System.out.println("El cliente ya existe en el banco");
        }
    }
    
    public Persona darDeBajaCliente(Persona cliente) {
        int numClientes = 0;
        boolean encontrado = false;
        for (Persona i : clientes) {  // halla la cantidad de clientes actual
            if(i == null) {
                break;
            }
            numClientes++;
        }
        for (int i = 0; i < numClientes; i++) {
            if (clientes[i].equals(cliente)) {  
                Persona clienteDadoDeBaja = clientes[i];
                clientes[i] = null;
                for(int j = i ; j < clientes.length-1; j++) { // desplaza los clientes restantes despues de que se haya dado de baja
                    clientes[j] = clientes[j+1];
                }
                return clienteDadoDeBaja;
            }
        }
        
        return null;
    }
    
    public boolean buscarCliente(Persona persona) {
        for(Persona i : clientes) {
            if(i == null) { // si el objeto actual es null, se detiene el bucle for
                break;
            }
            if(i.equals(persona)) { // retorna true si se encontro el cliente
                return true;
            }
        }
        return false;
    }
    
    public void clientesTipo(char tipo) {
        int numClientes = 0;
        for (Persona i : clientes) {
            if(i == null) {
                break;
            }
            numClientes++;
        }
        System.out.println("Clientes de tipo '" + tipo + "' en " + nombre + ": ");
        for (int i = 0; i < numClientes; i++) {
            if (clientes[i].getTipo() == tipo) {
                System.out.println(clientes[i]);
            }
        }
    }

    @Override
    public String toString() {
        String s = "";
        int numClientes = 0;
        for(Persona i : clientes) { // halla la cantidad de clientes actual
            if(i != null) {
                numClientes++;
            }
        }
        for(int i = 0; i < numClientes; i++) {
            s += "Cliente " + String.valueOf(i+1);
            s += "\nID: " + String.valueOf(clientes[i].getId());
            s += "\nNombre: " + clientes[i].getNombre();
            s += "\nApellido: " + clientes[i].getApellido() + "\n\n";
        }
        return s;
    }
    
    
}