package lab07;

public class Ejercicio4 {
    public static void main(String[] args) {
        try {
            int[] numeros = new int[5];
            numeros[7] = 10;
            int resultado = 10 / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Excepcion de indice fuera de rango: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Excepcion aritmética: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Excepcion genérica: " + e.getMessage());
        }
    }
}
