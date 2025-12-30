public class ProcesadorPago {
    private PayPalApi payPal;

    public ProcesadorPago() {
        this.payPal = new PayPalApi();
    }

    public void pagar(double monto) {
        payPal.pagar(monto);
        System.out.println("Pago procesado");
    }
}
