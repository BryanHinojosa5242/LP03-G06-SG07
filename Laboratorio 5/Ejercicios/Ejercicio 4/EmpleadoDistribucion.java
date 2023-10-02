package testherencia;

public class EmpleadoDistribucion extends Asalariado {
    private String region;

    public EmpleadoDistribucion(String nombre, long dni, int diasVacaciones, double salarioBase, String region) {
        super(nombre, dni, diasVacaciones, salarioBase);
        this.region = region;
    }

    public String getRegion() {
        return this.region;
    }

    public void setRegion(String nueva_region) {
        this.region = nueva_region;
    }
    
    public double calcularNomica() {
        // Aplicar el incremento del 10% para empleados de distribución
        double salarioBase = super.calcularNomica();
        return salarioBase + (salarioBase * 0.10);
    }
    
    @Override
    public String toString() {
        return "Empleado de Distribucion" + "\n" +
               "Dni        : " + getDni() + "\n" +
               "Nombre     : " + getNombre() + "\n" +
               "Vacaciones : " + getDiasVacaciones() + " dias       Zona  : " + region + "\n" +
               "Salario    : " + calcularNomica();
    }
}
