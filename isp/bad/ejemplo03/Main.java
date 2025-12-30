public class Main {
    public static void main(String[] args) {
        Repositorio repo = new ReporteSoloLectura();
        System.out.println(repo.obtener(1));
        repo.exportar();
    }
}
