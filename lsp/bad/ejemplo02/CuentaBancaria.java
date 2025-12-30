public class CuentaBancaria {
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
