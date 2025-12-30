/**
 * Politica de descuento para clientes nuevos.
 */
public class DescuentoClienteNuevo implements PoliticaDescuento {
    public double aplicar(double monto) {
        return monto * 0.90;
    }

    public String nombre() {
        return "Cliente Nuevo";
    }
}
