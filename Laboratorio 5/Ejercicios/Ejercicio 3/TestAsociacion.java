package testasociacion;

public class TestAsociacion {

    public static void main(String[] args) {
        Banco bcp = new Banco("BCP");
        Banco bbva = new Banco("BBVA", 30);
        
        Persona persona1 = new Persona(12345,"Pedro", "Gonzales",'D'); // se crean 5 objetos Persona
        Persona persona2 = new Persona(15492,"Luis", "Perez",'C');
        Persona persona3 = new Persona(14378,"Miguel", "Gutierrez",'B');
        
        Persona persona4 = new Persona(11232,"Cristian", "Torres",'E');
        Persona persona5 = new Persona(10389,"Rodrigo", "Rojas",'C');
        
        // se añaden los clientes a los bancos
        bcp.agregarCliente(persona1);
        bcp.agregarCliente(persona2);
        bcp.agregarCliente(persona3);
        
        bbva.agregarCliente(persona4);
        bbva.agregarCliente(persona5);
        
        System.out.println(bcp);
        System.out.println("-------------------\n");
        System.out.println("Dando de baja a la persona2: (Luis Perez)");
        bcp.darDeBajaCliente(persona2); // se da de baja persona2 en bcp
        System.out.println(bcp);
        
        bbva.clientesTipo('C'); // muestra los clientes con cuenta de tipo "C" en BBVA
    }
    
}
