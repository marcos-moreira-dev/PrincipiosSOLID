public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaLimitada(1000, 200);
        ProcesadorPago procesador = new ProcesadorPago();

        try {
            procesador.cobrar(cuenta, 300);
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }
}
