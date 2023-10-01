package testasociacion;

public class TestAsociacion {

    public static void main(String[] args) {
        Banco bcp = new Banco("BCP");
        Banco bbva = new Banco("BBVA", 30);
        
        Persona persona1 = new Persona(12345,"Pedro", "Gonzales"); // se crean 5 objetos Persona
        Persona persona2 = new Persona(15492,"Luis", "Perez");
        Persona persona3 = new Persona(14378,"Miguel", "Gutierrez");
        Persona persona4 = new Persona(11232,"Cristian", "Torres");
        Persona persona5 = new Persona(10389,"Rodrigo", "Rojas");
        
        // se añaden los clientes a los bancos
        bcp.agregarCliente(persona1);
        bcp.agregarCliente(persona2);
        bcp.agregarCliente(persona3);
        bbva.agregarCliente(persona4);
        bbva.agregarCliente(persona5);
        
        // agrega cliente que ya existe
        bbva.agregarCliente(persona4);
        System.out.println("---------------------------");
        
        // muestra clientes actuales de bcp
        System.out.println(bcp);
        
        // buscar clientes
        boolean buscarCliente = bbva.buscarCliente(persona5); // buscar a cliente en banco bbva
        
        if (buscarCliente) {
            System.out.println("Se ha encontrado el cliente");
        }
        else {
            System.out.println("No se pudo encontrar el cliente");
        }
    }
    
}
