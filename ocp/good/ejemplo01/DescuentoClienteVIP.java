/**
 * Politica de descuento para clientes VIP.
 */
public class DescuentoClienteVIP implements PoliticaDescuento {
    public double aplicar(double monto) {
        return monto * 0.80;
    }

    public String nombre() {
        return "Cliente VIP";
    }
}
