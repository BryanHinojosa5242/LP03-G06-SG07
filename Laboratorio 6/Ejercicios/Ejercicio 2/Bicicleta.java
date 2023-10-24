package testimpactoecologico;

public class Bicicleta implements ImpactoEcologico {
    private double kmRecorridos;

    public Bicicleta(double kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    @Override
    public double obtenerImpactoEcologico() {
        // DATO_ACTIVIDAD = (kilometrosRecorridos / 100) * 2
        double datoActividad = (kmRecorridos / 100) * 2;
        double factorDeEmision = 0.05;

        return datoActividad * factorDeEmision;
    }

    @Override
    public String toString() {
        return "Tipo: Bicicleta\nKilometros recorridos: " + kmRecorridos + " por año";
    }
}