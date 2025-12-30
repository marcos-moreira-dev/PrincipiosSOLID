/**
 * Cliente simulado para pagos PayPal.
 */
public class PayPalApi implements PasarelaPago {
    public void pagar(double monto) {
        System.out.println("Pagando con PayPal: " + monto);
    }
}
