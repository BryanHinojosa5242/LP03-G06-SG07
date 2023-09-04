package rectangulo;

public class Coordenada {
    private int x;
    private int y;

    public Coordenada() {
        this.x = 0;
        this.y = 0;
    }

    public Coordenada(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Coordenada(Coordenada c) {
        this.x = c.x;
        this.y = c.y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distancia(Coordenada c) {
        int x = c.x;
        int y = c.y;
        double res = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        return res;
    }
    
    public static double distancia(Coordenada c1, Coordenada c2) {
        int x = c2.x - c1.x;
        int y = c2.y - c1.y;
        double res = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        return res;
    }
    @Override
    public String toString() {
        return "Coordenada{" + "x=" + x + ", y=" + y + '}';
    }
    
}