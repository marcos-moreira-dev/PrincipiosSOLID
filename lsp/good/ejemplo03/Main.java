/**
 * Punto de entrada del ejemplo y orquestador del flujo.
 */
public class Main {
    /**
 * Punto de entrada del ejemplo.
 * @param args argumentos de linea de comandos
 */
public static void main(String[] args) {
        ClienteOficina cliente = new ClienteOficina();

        Imprimible basica = new ImpresoraBasica();
        cliente.imprimirDocumento(basica);

        ImpresoraMultifuncion multi = new ImpresoraMultifuncion();
        cliente.imprimirDocumento(multi);
        cliente.escanearDocumento(multi);
    }
}
