/**
 * Calcula el total de una factura.
 */
public class CalculadoraFactura {
    public double calcularTotal(Factura factura) {
        double total = 0.0;
        for (Item item : factura.getItems()) {
            total += item.getSubtotal();
        }
        return total;
    }
}
