import java.util.List;

/**
 * Exporta datos a formato CSV.
 */
public class ExportadorCSV implements Exportador {
    public String exportar(List<String> datos) {
        return String.join(",", datos);
    }
}
