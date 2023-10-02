package testcomposicion;

public class Cuenta {

    // -------------- atributos -------------------
    private String numero;
    private double saldo;

    // -------------- Constructor -------------------

    public Cuenta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public Cuenta(String numero) {
        this(numero, 50);
    }

    // -------------- gets y sets -------------------

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void  setNumero(String numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
        validar();
    }
    public void validar() {
        if (saldo < 50) {
            saldo = 50;
        }
    }
    
    // -------------- método String -------------------

    @Override
    public String toString() {
        return "\nNo. Cuenta: " + numero + "\tSaldo: " + saldo;
    }

}