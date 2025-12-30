public interface Repositorio {
    void guardar(String dato);
    void borrar(int id);
    String obtener(int id);
    void buscarPorTexto(String texto);
    void exportar();
}
