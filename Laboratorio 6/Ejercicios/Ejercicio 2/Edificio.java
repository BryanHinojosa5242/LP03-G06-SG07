package testimpactoecologico;

public class Edificio implements ImpactoEcologico {
    private double consumoDeCombustible;

    public Edificio(double consumoDeCombustible) {
        this.consumoDeCombustible = consumoDeCombustible;
    }

    @Override
    public double obtenerImpactoEcologico() {
        // DATO_ACTIVIDAD = (2 * consumoDeCombustible) * 10
        double datoActividad = (2 * consumoDeCombustible) * 10;
        double factorDeEmision = 0.5;

        return datoActividad * factorDeEmision;
    }
    
    @Override
    public String toString() {
        return "Tipo: Edificio\nConsumo de Combustible: " + consumoDeCombustible + " litros por año";
    }
}
