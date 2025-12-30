import java.util.List;

/**
 * Exporta datos a formato JSON.
 */
public class ExportadorJSON implements Exportador {
    public String exportar(List<String> datos) {
        return "{datos:[" + String.join(",", datos) + "]}";
    }
}
