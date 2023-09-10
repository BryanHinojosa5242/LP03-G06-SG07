package ventas;

public class Ventas {

    public static void main(String[] args) {
        int[][] ventas = new int[5][5]; // 5 filas para productos y 5 columnas para proveedores. Tarea LP3 Sesion 4 Ramses Flores

        // leer informacion de ventas del último mes
        // supongamos que la informacion de ventas se almacena en una matriz 2D llamada "notas"
        // cada fila en "notas" representa una nota de un vendedor
        // cada nota contiene tres valores: número de vendedor, número de producto y valor total
        int[][] notas = {
            {1, 1, 10}, // Nota de ejemplo: el vendedor 1 vendio el producto 1 con un valor total de 10
            {1, 2, 20}, // el vendedor 1 vendio el producto 2 con un valor total de 20
            {2, 1, 15}, // ...mas notas
        };

        // aqui proceso toda la informacion
        for (int[] nota : notas) {
            int vendedor = nota[0];
            int producto = nota[1];
            int valor = nota[2];
            ventas[producto - 1][vendedor - 1] += valor; // incrementar el valor de ventas del producto y vendedor correspondiente.
        }

        // imprimimos el resumen de ventas en formato tabular
        System.out.print("Producto\\Vendedor\t");
        for (int vendedor = 1; vendedor <= 4; vendedor++) {
            System.out.print("V" + vendedor + "\t");
        }
        System.out.println("Total");

        for (int producto = 1; producto <= 5; producto++) {
            System.out.print("P" + producto + "\t\t\t");
            int productoTotal = 0;
            for (int vendedor = 1; vendedor <= 4; vendedor++) {
                int valorVentas = ventas[producto - 1][vendedor - 1];
                System.out.print(valorVentas + "\t");
                productoTotal += valorVentas;
            }
            System.out.println(productoTotal);
        }

        System.out.print("Total\t\t\t");
        int vendedorTotal = 0;
        for (int vendedor = 1; vendedor <= 4; vendedor++) {
            int valorVentaTotal = 0;
            for (int producto = 1; producto <= 5; producto++) {
                valorVentaTotal += ventas[producto - 1][vendedor - 1];
            }
            System.out.print(valorVentaTotal + "\t");
            vendedorTotal += valorVentaTotal;
        }
        System.out.println(vendedorTotal);
    }
}
