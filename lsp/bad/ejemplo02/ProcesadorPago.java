public class ProcesadorPago {
    public void cobrar(CuentaBancaria cuenta, double monto) {
        boolean ok = cuenta.retirar(monto);
        if (ok) {
            System.out.println("Pago realizado");
        } else {
            System.out.println("Pago rechazado");
        }
    }
}
