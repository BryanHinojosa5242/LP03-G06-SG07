package rectangulo;

public class Principal {
    
    public static void main(String[] args) { 
        Coordenada coordenada1 = new Coordenada();
        Coordenada coordenada2 = new Coordenada(3,10);
        Rectangulo rectangulo1 = new Rectangulo(coordenada1,coordenada2);
        Manejador manejador = new Manejador();
        Rectangulo rectangulo2 = new Rectangulo(coordenada1,coordenada2);
        Rectangulo rectangulo3 = new Rectangulo(coordenada1,coordenada2);
        Rectangulo rectangulo4 = new Rectangulo(coordenada1,coordenada2);
        Rectangulo rectangulo5 = new Rectangulo(coordenada1,coordenada2);
        
        System.out.println(rectangulo1.getColor());
        System.out.println(rectangulo2.getColor());
        System.out.println(rectangulo3.getColor());
        System.out.println(rectangulo4.getColor());
        System.out.println(rectangulo5.getColor());
        
        System.out.println(rectangulo1);
        rectangulo1 = manejador.moverY(rectangulo1,10);
        System.out.println(rectangulo1);
        
    }
}