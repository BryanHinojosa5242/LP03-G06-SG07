package testcomposicion;

public class TestComposicion {

    public static void main(String[] args) {
        Persona p1 = new Persona(1234, "Pedro", "Gonzales",2);
        Persona p2 = new Persona(1234, "Luis", "Paredes",5);
        Persona p3 = new Persona(1234, "Miguel", "Hernandez",7);   
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        
    }

}
