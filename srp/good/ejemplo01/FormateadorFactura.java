/**
 * Genera una representacion en texto de una factura.
 */
public class FormateadorFactura {
    public String generarTexto(Factura factura, double total) {
        StringBuilder sb = new StringBuilder();
        sb.append("Factura: ").append(factura.getId()).append("\n");
        sb.append("Cliente: ").append(factura.getCliente()).append("\n");
        sb.append("Items:\n");
        for (Item item : factura.getItems()) {
            sb.append("- ").append(item.getNombre())
              .append(" x").append(item.getCantidad())
              .append(" = ").append(item.getSubtotal()).append("\n");
        }
        sb.append("Total: ").append(total).append("\n");
        return sb.toString();
    }
}
