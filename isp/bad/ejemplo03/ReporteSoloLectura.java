public class ReporteSoloLectura implements Repositorio {
    public void guardar(String dato) {
        System.out.println("No aplica guardar");
    }

    public void borrar(int id) {
        System.out.println("No aplica borrar");
    }

    public String obtener(int id) {
        return "Reporte " + id;
    }

    public void buscarPorTexto(String texto) {
        System.out.println("No aplica busqueda");
    }

    public void exportar() {
        System.out.println("No aplica exportar");
    }
}
