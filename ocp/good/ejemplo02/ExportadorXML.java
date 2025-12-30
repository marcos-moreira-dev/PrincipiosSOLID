import java.util.List;

/**
 * Exporta datos a formato XML.
 */
public class ExportadorXML implements Exportador {
    public String exportar(List<String> datos) {
        return "<datos>" + String.join("", datos) + "</datos>";
    }
}
