/**
 * Coordina el cobro o pago contra una fuente de fondos.
 */
public class ProcesadorPago {
    public void cobrar(CuentaRetirable cuenta, double monto) {
        boolean ok = cuenta.retirar(monto);
        if (ok) {
            System.out.println("Pago realizado");
        } else {
            System.out.println("Pago rechazado");
        }
    }
}
