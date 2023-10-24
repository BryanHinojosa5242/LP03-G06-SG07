package pruebainterfazporpagar;

public class EmpleadoAsalariado extends Empleado{
    private double salarioSemanal;
    
    public EmpleadoAsalariado(String nombre, String apellido, String nss, double salario) {
        super(nombre,apellido,nss);
        establecerSalarioSemanal(salario);
    }
    
    public void establecerSalarioSemanal(double salario) {
        if (salario < 0) {
            this.salarioSemanal = 0;
        }
        else {
            this.salarioSemanal = salario;
        }
    }
    
    public double obtenerSalarioSemanal() {
        return salarioSemanal;
    }
    
    @Override
    public double obtenerMontoPago() {
        return obtenerSalarioSemanal();
    }

    @Override
    public String toString() {
        String s = "empleado asalariado: " + getPrimerNombre() + " " + getApellidoPaterno()
                + "\nnumero seguro social: " + getNumeroSeguroSocial()
                + "\nsalario semanal: $" + salarioSemanal;
        return s;
    }
}