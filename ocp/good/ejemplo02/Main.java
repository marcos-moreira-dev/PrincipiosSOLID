import java.util.Arrays;
import java.util.List;

/**
 * Punto de entrada del ejemplo y orquestador del flujo.
 */
public class Main {
    /**
 * Punto de entrada del ejemplo.
 * @param args argumentos de linea de comandos
 */
public static void main(String[] args) {
        List<String> datos = Arrays.asList("A", "B", "C");

        Exportador exportador = new ExportadorJSON();
        ServicioExportacion servicio = new ServicioExportacion(exportador);

        System.out.println(servicio.exportar(datos));
    }
}
