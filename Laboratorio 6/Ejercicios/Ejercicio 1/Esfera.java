package testfigura;

public class Esfera extends FiguraTridimensional{
    private double radio;
    public Esfera(double r) {
        this.radio = r;
    }
    
    public double obtenerArea() {
        return 4 * Math.PI * radio * radio;
    }
    
    public double obtenerVolumen() {
        return (4 * Math.PI * Math.pow(radio, 3)) / 3;
    }
    
    @Override
    public String toString() {
        String s = "Esfera: "
                + "\nRadio: " + radio;
        return s;
    }
}