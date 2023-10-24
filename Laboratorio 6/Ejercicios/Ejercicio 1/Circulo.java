package testfigura;

public class Circulo extends FiguraBidimensional{
    private double radio;
    private final String color = "Rojo";
    
    public Circulo(double r) {
        this.radio = r;
    }
    
    public double obtenerArea() {
        return Math.PI * radio * radio;
    }
    
    public String obtenerColor() {
    	return color;
    }
    
    @Override
    public String toString() {
        String s = "Circulo: "
                + "\nRadio: " + radio;
        return s;
    }
}