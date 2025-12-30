/**
 * Contrato para escritura de datos.
 */
public interface RepositorioEscritura {
    void guardar(String dato);
    void borrar(int id);
}
