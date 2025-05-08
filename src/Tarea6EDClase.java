
public class Tarea6EDClase {
    //Constantes definidas
    private static final double DESCUENTO_5_PORCIENTO = 0.95;
    private static final double DESCUENTO_20_PORCIENTO = 0.8;
    private static final int DESCUENTO_5_UNIDADES = 5;

    public void aplicarDescuento(double precioProducto, int numProductos) {
        double totalPagar = calcularDescuento(precioProducto, numProductos);
        System.out.println("El total a pagar es: " + totalPagar);
        System.out.println("Enviado");
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
