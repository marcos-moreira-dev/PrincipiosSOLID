/**
 * Punto de entrada del ejemplo y orquestador del flujo.
 */
public class Main {
    /**
 * Punto de entrada del ejemplo.
 * @param args argumentos de linea de comandos
 */
public static void main(String[] args) {
        CuentaRetirable cuenta = new CuentaLimitada(1000, 200);
        ProcesadorPago procesador = new ProcesadorPago();

        procesador.cobrar(cuenta, 300);
        procesador.cobrar(cuenta, 150);
    }
}
