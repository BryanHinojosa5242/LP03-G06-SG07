package rectangulo;

public class Rectangulo {
    private Coordenada esquina1;
    private Coordenada esquina2;
    private String color;
    static int nRectangulos;
    
    public Rectangulo(Coordenada esquina1, Coordenada esquina2) {
        this.esquina1 = esquina1;
        this.esquina2 = esquina2;
        switch(nRectangulos % 3) {
            case 0:
                this.color = "verde";
                break;
            case 1:
                this.color = "amarillo";
                break;
            case 2:
                this.color = "rojo";
                break;
        }
        nRectangulos++;
    }

    public Rectangulo(int x, int y) {
        this.esquina1 = new Coordenada(0, 0);
        this.esquina2 = new Coordenada(x, y);
        switch(nRectangulos % 3) {
            case 0:
                this.color = "verde";
                break;
            case 1:
                this.color = "amarillo";
                break;
            case 2:
                this.color = "rojo";
                break;
        }
        nRectangulos++;
    }

    public Coordenada getEsquina1() {
        return esquina1;
    }

    public void setEsquina1(Coordenada esquina1) {
        this.esquina1 = esquina1;
    }

    public Coordenada getEsquina2() {
        return esquina2;
    }

    public void setEsquina2(Coordenada esquina2) {
        this.esquina2 = esquina2;
    }
    
    public int getEsquina1X() {
        return esquina1.getX();
    }
    
    public int getEsquina1Y() {
        return esquina1.getY();
    }
    
    public int getEsquina2X() {
        return esquina2.getX();
    }
    
    public int getEsquina2Y() {
        return esquina2.getY();
    }
    
    public String getColor() {
        return color;
    }
    @Override
    public String toString() {
        return "Rectangulo{" + "esquina1=" + esquina1 + ", esquina2=" + esquina2 + '}';
    }
    
}