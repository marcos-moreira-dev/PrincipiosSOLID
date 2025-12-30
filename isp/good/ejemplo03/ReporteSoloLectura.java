/**
 * Repositorio que solo permite lectura.
 */
public class ReporteSoloLectura implements RepositorioLectura {
    public String obtener(int id) {
        return "Reporte " + id;
    }
}
