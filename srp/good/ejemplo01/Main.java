/**
 * Punto de entrada del ejemplo y orquestador del flujo.
 */
public class Main {
    /**
 * Punto de entrada del ejemplo.
 * @param args argumentos de linea de comandos
 */
public static void main(String[] args) {
        Factura factura = new Factura("FAC-001", "Cliente Perez");
        factura.agregarItem(new Item("Teclado", 2, 30.0));
        factura.agregarItem(new Item("Mouse", 1, 15.0));

        CalculadoraFactura calculadora = new CalculadoraFactura();
        double total = calculadora.calcularTotal(factura);

        FormateadorFactura formateador = new FormateadorFactura();
        String reporte = formateador.generarTexto(factura, total);

        RepositorioFactura repo = new RepositorioFactura();
        repo.guardar("factura_FAC-001.txt", reporte);
    }
}
