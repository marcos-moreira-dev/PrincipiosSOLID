public class Main {
    public static void main(String[] args) {
        FacturaManager factura = new FacturaManager("FAC-001", "Cliente Perez");
        factura.agregarItem(new Item("Teclado", 2, 30.0));
        factura.agregarItem(new Item("Mouse", 1, 15.0));

        String reporte = factura.generarReporte();
        System.out.println(reporte);

        factura.guardarEnArchivo("factura_FAC-001.txt");
    }
}
