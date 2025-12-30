/**
 * Coordina el cobro o pago contra una fuente de fondos.
 */
public class ProcesadorPago {
    private PasarelaPago pasarela;

    public ProcesadorPago(PasarelaPago pasarela) {
        this.pasarela = pasarela;
    }

    public void pagar(double monto) {
        pasarela.pagar(monto);
        System.out.println("Pago procesado");
    }
}
