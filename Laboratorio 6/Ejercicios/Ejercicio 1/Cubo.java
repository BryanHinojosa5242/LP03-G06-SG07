package testfigura;

public class Cubo extends FiguraTridimensional{
    private double lArista;
    public Cubo(double l) {
        this.lArista = l;
    }
    
    public double obtenerArea() {
        return 6 * lArista * lArista;
    }
    
    public double obtenerVolumen() {
        return  Math.pow(lArista, 3);
    }
    
    @Override
    public String toString() {
        String s = "Cubo: "
                + "\nLongitud de la arista: " + lArista;
        return s;
    }
}