package lab07;

public class ProductoElectronico {

    private String nombre;
    private double precio;
    private int stockDisponible;

    public ProductoElectronico(String nombre, double precio, int stockDisponible) {
        this.nombre = nombre;

        // Verificar que el precio y el stock sean valores válidos
        assert precio <= 0 : "El precio debe ser mayor que 0";
        assert stockDisponible < 0 : "El stock no puede ser negativo";

        this.precio = precio;
        this.stockDisponible = stockDisponible;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStockDisponible() {
        return stockDisponible;
    }

    public void vender(int cantidad) {
        // Verificar que haya suficiente stock antes de vender
        assert cantidad > 0 : "La cantidad a vender debe ser mayor que 0";
        assert cantidad > stockDisponible : "No hay suficiente stock para la venta";

        stockDisponible -= cantidad;
    }
}
