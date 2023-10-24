package testimpactoecologico;

public class Auto implements ImpactoEcologico {
    private double emisionesCO2;

    public Auto(double emisionesCO2) {
        this.emisionesCO2 = emisionesCO2;
    }

    @Override
    public double obtenerImpactoEcologico() {
        // DATO_ACTIVIDAD = (emisionesDeCO2 / 100) * 5
        double datoActividad = (emisionesCO2 / 10) * 5;
        double factorDeEmision = 0.3;

        return datoActividad * factorDeEmision;
    }
    
    @Override
    public String toString() {
        return "Tipo: Auto\nEmisiones de CO2: " + emisionesCO2 + " kg por año";
    }
}