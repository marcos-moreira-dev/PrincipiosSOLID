import java.util.List;

/**
 * Coordina la exportacion usando un Exportador.
 */
public class ServicioExportacion {
    private Exportador exportador;

    public ServicioExportacion(Exportador exportador) {
        this.exportador = exportador;
    }

    public String exportar(List<String> datos) {
        return exportador.exportar(datos);
    }
}
