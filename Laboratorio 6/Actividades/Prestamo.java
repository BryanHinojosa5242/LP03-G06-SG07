package pruebainterfazporpagar;

public class Prestamo implements PorPagar{
    private int numeroDeCuotas;
    private double montoDeCuota;

    public Prestamo(int numeroDeCuotas, double montoDeCuota) {
        this.numeroDeCuotas = numeroDeCuotas;
        this.montoDeCuota = montoDeCuota;
    }

    public int getNumeroDeCuotas() {
        return numeroDeCuotas;
    }

    public void setNumeroDeCuotas(int numeroDeCuotas) {
        this.numeroDeCuotas = numeroDeCuotas;
    }

    public double getMontoDeCuota() {
        return montoDeCuota;
    }

    public void setMontoDeCuota(double montoDeCuota) {
        this.montoDeCuota = montoDeCuota;
    }
    
    @Override
    public double obtenerMontoPago() {
        return getNumeroDeCuotas() * getMontoDeCuota();
    }
    
    @Override
    public String toString() {
        String s = "prestamo: "
                + "\nnumero de cuotas: " + numeroDeCuotas
                + "\nmonto de cuota: " + montoDeCuota;
        return s;
    }
}