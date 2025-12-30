/**
 * Cliente simulado para pagos con tarjeta.
 */
public class TarjetaApi implements PasarelaPago {
    public void pagar(double monto) {
        System.out.println("Pagando con tarjeta: " + monto);
    }
}
