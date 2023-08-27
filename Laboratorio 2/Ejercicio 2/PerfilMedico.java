package perfil;

public class PerfilMedico {
    // atributos
    private String nombre;
    private String apellido;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anioNacimiento;
    private double altura;
    private double peso;
    
    // constructor
    public PerfilMedico(String nombre, String apellido, int dia, int mes, int anio, double altura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.diaNacimiento = dia;
        this.mesNacimiento = mes;
        this.anioNacimiento = anio;
        this.altura = altura;
        this.peso = peso;
    }
    
    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setDia(int dia) {
        this.diaNacimiento = dia;
    }
    public void setMes(int mes) {
        this.mesNacimiento = mes;
    }
    public void setAnio(int anio) {
        this.anioNacimiento = anio;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    //getters
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getDia() {
        return diaNacimiento;
    }
    public int getMes() {
        return mesNacimiento;
    }
    public int getAnio() {
        return anioNacimiento;
    }
    public double getAltura() {
        return altura;
    }
    public double getPeso() {
        return peso;
    }
    
    public int obtenerEdad() {
        int edad = 2023 - anioNacimiento;
        return edad;
    }
    public double calcularFCM() {
        double FCM = 208 - (0.7 * obtenerEdad());
        return FCM;
    }
    public double calcularIMC() {
        double IMC = peso/altura;
        return IMC;
    }

    @Override
    public String toString() {
        return "\nPrimer nombre: " + nombre + "\nApellido: " + apellido + "\nDia de nacimiento: " + diaNacimiento + "\nMes de nacimiento: " + mesNacimiento +
        "\nAño de nacimiento: " + anioNacimiento + "\nAltura: " + altura + "\nPeso: " + peso;
    }
}
