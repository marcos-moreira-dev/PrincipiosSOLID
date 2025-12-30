/**
 * Punto de entrada del ejemplo y orquestador del flujo.
 */
public class Main {
    /**
 * Punto de entrada del ejemplo.
 * @param args argumentos de linea de comandos
 */
public static void main(String[] args) {
        Imprimible simple = new ImpresoraSimple();
        simple.imprimir("Factura");

        Multifuncion multi = new Multifuncion();
        multi.imprimir("Contrato");
        multi.escanear();
        multi.fax();
    }
}
