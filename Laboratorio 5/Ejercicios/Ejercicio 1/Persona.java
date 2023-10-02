package testcomposicion;

public class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private char tipoCliente;
    private Cuenta cuenta;
    private String numeroCuenta;
    private static int numeroC = 1000;
    private static int numeroB = 5000;
    private static int numeroE = 8000;
    
    public Persona(int id, String nombre, String apellido, char tipoCliente) {
        switch(tipoCliente) {
            case 'B':
                this.numeroCuenta = tipoCliente + String.valueOf(numeroB);
                numeroB++;
                break;
            case 'E':
                this.numeroCuenta = tipoCliente + String.valueOf(numeroE);
                numeroE++;
                break;
            default:
                tipoCliente = 'C';
                this.numeroCuenta = tipoCliente + String.valueOf(numeroC);
                numeroC++;
                break;
        }
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoCliente = tipoCliente;
        this.cuenta = new Cuenta(numeroCuenta);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cuenta getCuenta(){
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public char getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(char tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    
    public void retirar(int cantidad) {
        if (cantidad > 0) {
            double saldo = cuenta.getSaldo();
            saldo -= cantidad;
            cuenta.setSaldo(saldo);
        }
        
    }
    
    public void depositar(int cantidad) {
        if (cantidad > 0) {
            double saldo = cuenta.getSaldo();
            saldo += cantidad;
            cuenta.setSaldo(saldo);
        }
    }

    // -------------- método String -------------------

    @Override
    public String toString() {
        String s = "Cliente: " + id + "\nTipo: " + tipoCliente + "\nNombres: " + nombre + " " + apellido + cuenta;
        return s;
    }

}