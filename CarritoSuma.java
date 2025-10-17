import java.util.Locale;

public class CarritoSuma {

    /**
     * Representa un producto del catálogo.
     */
    static class Producto {
        private final String nombre;
        private final double precio;

        public Producto(String nombre, double precio) {
            this.nombre = nombre;
            this.precio = precio;

        }

        public String getNombre() {
            return nombre;
        }

        public double getPrecio() {
            return precio;
        }

        public String toString() {
            return String.format("%s - %.2f €", nombre, precio);
        }
    }

    public static double totalCarrito(Producto[] carrito) {
        double total = 0.0;
        // 2) for-each sobre carrito → acumula p.getPrecio()
        // 3) return total;
        for (Producto producto : carrito) {
            total += producto.getPrecio();
        }
        return total;
    }

    /**
     * Crea un producto con nombre y precio base.
     * 
     * @param nombre nombre comercial
     * @param precio precio en euros (>= 0)
     */
    public static void main(String[] args) {
        Producto[] carrito = {
                new Producto("Ratón", 24.99),
                new Producto("Ordenador", 250.99),
                new Producto("Teclado", 35.70),
        };
        carrito[1] = new Producto("Ordenador", 30);

    }

}

/** @return nombre del producto */

/** @return precio del producto */

/**
 * Suma los precios de todos los productos del carrito.
 * 
 * @param carrito array de productos (no nulo)
 * @return suma total en euros
 */

// TODO (opción fija):
// Producto[] carrito = {
// new Producto("Teclado", 24.99),
// new Producto("Ratón", 15.50),
// new Producto("Auriculares", 39.90)
// };
// Opcion 2
// Scanner sc = new Scanner(System.in);
// TODO (opción teclado): pedir N, crear array, leer nombre y precio por cada
// producto.

// TODO: llamar a totalCarrito(carrito) y mostrar con printf "Total: %.2f €"
