/**
 * Punto de entrada del ejemplo y orquestador del flujo.
 */
public class Main {
    /**
 * Punto de entrada del ejemplo.
 * @param args argumentos de linea de comandos
 */
public static void main(String[] args) {
        PasarelaPago pasarela = new PayPalApi();
        ProcesadorPago procesador = new ProcesadorPago(pasarela);

        procesador.pagar(50.0);
    }
}
