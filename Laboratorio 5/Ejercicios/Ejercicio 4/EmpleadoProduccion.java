package testherencia;

public class EmpleadoProduccion extends Asalariado {
    private String turno;

    public EmpleadoProduccion(String nombre, long dni, int diasVacaciones,  double salarioBase, String turno) {
        super(nombre, dni, diasVacaciones, salarioBase);
        this.turno = turno;
    }

    public String getTurno() {
        return this.turno;
    }

    public void setTurno(String nuevo_turno) {
        this.turno = nuevo_turno;
    }
    
    @Override
    public double calcularNomica() {
        // Aplicar el incremento del 15% para empleados de producción
        double salarioBase = super.calcularNomica();
        return salarioBase + (salarioBase * 0.15);
    }
    
    @Override
    public String toString() {
        return "Empleado de Produccion" + "\n" +
               "Dni        : " + getDni() + "\n" +
               "Nombre     : " + getNombre() + "\n" +
               "Vacaciones : " + getDiasVacaciones() + " dias       Turno  : " + turno + "\n" +
               "Salario    : " + calcularNomica();
    }
}
