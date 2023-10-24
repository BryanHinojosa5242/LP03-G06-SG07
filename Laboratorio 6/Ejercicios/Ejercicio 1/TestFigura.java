package testfigura;

public class TestFigura {

    public static void main(String[] args) {
        Figura[] figuras = new Figura[6];
        figuras[0] = new Circulo(3);
        figuras[1] = new Cuadrado(2);
        figuras[2] = new Triangulo(4,3);
        figuras[3] = new Esfera(5);
        figuras[4] = new Cubo(2);
        figuras[5] = new Tetraedro(6);
        
        for(Figura objFigura : figuras) {
            System.out.printf("\n%s \n%s%,.2f\n",objFigura.toString(),"Area: ",objFigura.obtenerArea());
            if (objFigura.getClass().getSimpleName().equals("Circulo")) {
            	Circulo objCirculo;
                objCirculo = (Circulo) objFigura;
            	System.out.println("Color: " + objCirculo.obtenerColor());
            }
            
            if (objFigura instanceof FiguraTridimensional) {
                FiguraTridimensional objFiguraTridimensional;
                objFiguraTridimensional = (FiguraTridimensional) objFigura;
                System.out.printf("%s%,.2f\n","Volumen: ",objFiguraTridimensional.obtenerVolumen());
            }
            
            if (objFigura.getClass().getSimpleName().equals("Tetraedro")) {
            	Tetraedro objTetraedro;
                objTetraedro = (Tetraedro) objFigura;
            	System.out.println("Aplicacion: " + objTetraedro.obtenerAplicacion());
            }
        }
    }
}