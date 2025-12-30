import java.util.List;

public class ExportadorDatos {
    public String exportar(List<String> datos, String formato) {
        if ("CSV".equals(formato)) {
            return String.join(",", datos);
        } else if ("JSON".equals(formato)) {
            return "{datos:[" + String.join(",", datos) + "]}";
        } else if ("XML".equals(formato)) {
            return "<datos>" + String.join("", datos) + "</datos>";
        } else {
            return "Formato no soportado";
        }
    }
}
