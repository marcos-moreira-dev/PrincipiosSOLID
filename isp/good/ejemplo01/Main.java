/**
 * Punto de entrada del ejemplo y orquestador del flujo.
 */
public class Main {
    /**
 * Punto de entrada del ejemplo.
 * @param args argumentos de linea de comandos
 */
public static void main(String[] args) {
        Trabajador dev = new Desarrollador();
        Reportable rep = new Desarrollador();

        Trabajador bec = new Becario();
        Reportable repBec = new Becario();

        dev.trabajar();
        rep.reportar();

        bec.trabajar();
        repBec.reportar();
    }
}
