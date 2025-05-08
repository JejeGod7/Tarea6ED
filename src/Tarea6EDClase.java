/**
 * Clase que representa un carrito de compras con métodos para aplicar descuentos.
 */
public class Tarea6EDClase {
    //Constantes definidas
    private static final double DESCUENTO_5_PORCIENTO = 0.95;
    private static final double DESCUENTO_20_PORCIENTO = 0.8;
    private static final int DESCUENTO_5_UNIDADES = 5;
    /**
     * Aplica un descuento a un producto según la cantidad de productos.
     *
     * @param precioProducto El precio de un solo producto.
     * @param numProductos El número de productos comprados.
     */

    public void aplicarDescuento(double precioProducto, int numProductos) {
        double totalPagar = calcularDescuento(precioProducto, numProductos);
        System.out.println("El total a pagar es: " + totalPagar);
        System.out.println("Enviado");
         /**
     * Calcula el descuento aplicable según el número de productos.
     *
     * @param precioProducto El precio de un solo producto.
     * @param numProductos El número de productos comprados.
     * @return El total a pagar después del descuento.
     */
    }

    private double calcularDescuento(double precioProducto, int numProductos) {
        if (numProductos > 3) {
            precioProducto -= DESCUENTO_5_UNIDADES;
        }
        if (numProductos != 0) {
            return precioProducto * DESCUENTO_20_PORCIENTO;
            
        } else {
            return precioProducto * DESCUENTO_5_PORCIENTO;
    }
  }     
}
