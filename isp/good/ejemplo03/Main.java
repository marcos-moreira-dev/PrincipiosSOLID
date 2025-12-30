/**
 * Punto de entrada del ejemplo y orquestador del flujo.
 */
public class Main {
    /**
 * Punto de entrada del ejemplo.
 * @param args argumentos de linea de comandos
 */
public static void main(String[] args) {
        RepositorioLectura repo = new ReporteSoloLectura();
        System.out.println(repo.obtener(1));
    }
}
