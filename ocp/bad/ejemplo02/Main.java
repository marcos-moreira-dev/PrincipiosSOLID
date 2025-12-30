import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ExportadorDatos exportador = new ExportadorDatos();
        List<String> datos = Arrays.asList("A", "B", "C");

        String salida = exportador.exportar(datos, "JSON");
        System.out.println(salida);
    }
}
