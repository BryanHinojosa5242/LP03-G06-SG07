package lab07;

public class Ejercicio5 {

    public static void main(String[] args) {
        ProductoElectronico laptop = new ProductoElectronico("Laptop", 1000.0, 10);
        ProductoElectronico smartphone = new ProductoElectronico("Smartphone", 500.0, -5);  //Intencionadamente con stock negativo
        // Intentar vender productos
        laptop.vender(3);
        smartphone.vender(2); // Esto debería generar una aserción porque el stock es negativo
        System.out.println("Producto: " + laptop.getNombre());
        System.out.println("Precio: $" + laptop.getPrecio());
        System.out.println("Stock Disponible: " + laptop.getStockDisponible());
        System.out.println("Producto: " + smartphone.getNombre());
        System.out.println("Precio: $" + smartphone.getPrecio());
        System.out.println("Stock Disponible: " + smartphone.getStockDisponible());
    }

}
