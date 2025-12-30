/**
 * Politica de descuento para clientes regulares.
 */
public class DescuentoClienteRegular implements PoliticaDescuento {
    public double aplicar(double monto) {
        return monto;
    }

    public String nombre() {
        return "Cliente Regular";
    }
}
