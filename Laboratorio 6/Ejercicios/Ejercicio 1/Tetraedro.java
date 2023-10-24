package testfigura;

public class Tetraedro extends FiguraTridimensional{
    private double lArista;
    private final String aplicacion = "Egipto";
    
    public Tetraedro(double l) {
        this.lArista = l;
    }
    
    public double obtenerArea() {
        return Math.sqrt(3) * lArista * lArista;
    }
    
    public double obtenerVolumen() {
        return (Math.sqrt(2) * Math.pow(lArista, 3))/12;
    }
    
    public String obtenerAplicacion() {
    	return aplicacion;
    }
    
    @Override
    public String toString() {
        String s = "Tetraedro: "
                + "\nLongitud de la arista: " + lArista;
        return s;
    }
}