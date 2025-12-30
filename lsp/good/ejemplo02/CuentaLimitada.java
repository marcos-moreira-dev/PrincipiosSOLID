/**
 * Cuenta con limite diario de retiro.
 */
public class CuentaLimitada extends CuentaBancaria {
    private double limiteDiario;

    public CuentaLimitada(double saldoInicial, double limiteDiario) {
        super(saldoInicial);
        this.limiteDiario = limiteDiario;
    }

    public boolean retirar(double monto) {
        if (monto > limiteDiario) {
            return false;
        }
        return super.retirar(monto);
    }
}
