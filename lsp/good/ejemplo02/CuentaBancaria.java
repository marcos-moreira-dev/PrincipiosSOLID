/**
 * Cuenta con saldo y operaciones de retiro.
 */
public class CuentaBancaria implements CuentaRetirable {
    protected double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public boolean retirar(double monto) {
        if (monto > saldo) {
            return false;
        }
        saldo -= monto;
        return true;
    }
}
