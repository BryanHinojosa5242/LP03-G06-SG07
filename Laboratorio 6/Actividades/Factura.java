package pruebainterfazporpagar;

public class Factura implements PorPagar{
    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;

    public Factura(String numeroPieza, String descripcionPieza, int cuenta, double precio) {
        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;
        establecerCantidad(cuenta);
        establecerPrecioPorArticulo(precio);
    }
    
    public void establecerCantidad(int cuenta) {
        if(cuenta < 0) {
            this.cantidad = 0;
        }
        else {
            this.cantidad = cuenta;
        }
    }
    
    public void establecerPrecioPorArticulo(double precio) {
        if(precio < 0) {
            this.precioPorArticulo = 0;
        }
        else {
            this.precioPorArticulo = precio;
        }
    }
    
    public int obtenerCantidad() {
        return cantidad;
    }
    
    public double obtenerPrecioPorArticulo() {
        return precioPorArticulo;
    }
    
    @Override
    public double obtenerMontoPago() {
        return obtenerCantidad() * obtenerPrecioPorArticulo();
    }

    @Override
    public String toString() {
        String s = "factura:"
                + "\nnumero de pieza: " + numeroPieza + " ("+ descripcionPieza + ")"
                + "\ncantidad: " + cantidad
                + "\nprecio por articulo: $" + precioPorArticulo;
        return s;
    }
    
    
}