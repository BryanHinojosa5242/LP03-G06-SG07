package rectangulo;

public class Manejador {
    public double area(Rectangulo recta) {
        double base = recta.getEsquina2X() - recta.getEsquina1X();
        double altura = recta.getEsquina2Y() - recta.getEsquina1Y();
        return base * altura;
    }
    
    public double perimetro(Rectangulo recta) {
        double base = recta.getEsquina2X() - recta.getEsquina1X();
        double altura = recta.getEsquina2Y() - recta.getEsquina1Y();
        return 2 * (base+altura);
    }
    public Rectangulo moverX(Rectangulo recta,int x) {
        Coordenada nuevaEsquina1 = new Coordenada(recta.getEsquina1X()+x,recta.getEsquina1Y());
        Coordenada nuevaEsquina2 = new Coordenada(recta.getEsquina2X()+x,recta.getEsquina2Y());
        Rectangulo nuevoRectangulo = new Rectangulo(nuevaEsquina1, nuevaEsquina2);
        return nuevoRectangulo;
    }
    public Rectangulo moverY(Rectangulo recta, int y) {
        Coordenada nuevaEsquina1 = new Coordenada(recta.getEsquina1X(),recta.getEsquina1Y()+y);
        Coordenada nuevaEsquina2 = new Coordenada(recta.getEsquina2X(),recta.getEsquina2Y()+y);
        Rectangulo nuevoRectangulo = new Rectangulo(nuevaEsquina1, nuevaEsquina2);
        return nuevoRectangulo;
    }
}