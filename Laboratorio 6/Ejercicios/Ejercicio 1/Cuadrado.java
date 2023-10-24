package testfigura;

public class Cuadrado extends FiguraBidimensional{
    private double lado;
    public Cuadrado(double l) {
        this.lado = l;
    }
    
    public double obtenerArea() {
        return lado*lado;
    }
    
    @Override
    public String toString() {
        String s = "Cuadrado: "
                + "\nLado: " + lado;
        return s;
    }
}
