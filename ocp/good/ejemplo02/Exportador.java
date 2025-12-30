import java.util.List;

/**
 * Contrato para exportar datos a un formato.
 */
public interface Exportador {
    String exportar(List<String> datos);
}
