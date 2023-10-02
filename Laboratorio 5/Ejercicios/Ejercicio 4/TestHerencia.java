package testherencia;

public class TestHerencia {

    public static void main(String[] args) {
        // creamos objetos
        Asalariado empleadoAsalariado = new Asalariado("Juan Perez", 123456789, 20, 3500.0);
        EmpleadoProduccion empleadoProduccion = new EmpleadoProduccion("Maria Rodriguez", 987654321, 18, 4000.0, "Tarde");
        EmpleadoDistribucion empleadoDistribucion = new EmpleadoDistribucion("Carlos Gomez", 456789123, 22, 3800.0, "Centro");

      
        System.out.println(empleadoAsalariado.toString());
        System.out.println(empleadoProduccion.toString());
        System.out.println(empleadoDistribucion.toString());
    }
    
}

