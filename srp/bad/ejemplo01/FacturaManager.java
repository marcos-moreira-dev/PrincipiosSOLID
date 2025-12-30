import java.util.ArrayList;
import java.util.List;

public class FacturaManager {
    private String id;
    private String cliente;
    private List<Item> items;

    public FacturaManager(String id, String cliente) {
        this.id = id;
        this.cliente = cliente;
        this.items = new ArrayList<>();
    }

    public void agregarItem(Item item) {
        items.add(item);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Item item : items) {
            total += item.getSubtotal();
        }
        return total;
    }

    public String generarReporte() {
        StringBuilder sb = new StringBuilder();
        sb.append("Factura: ").append(id).append("\n");
        sb.append("Cliente: ").append(cliente).append("\n");
        sb.append("Items:\n");
        for (Item item : items) {
            sb.append("- ").append(item.getNombre())
              .append(" x").append(item.getCantidad())
              .append(" = ").append(item.getSubtotal()).append("\n");
        }
        sb.append("Total: ").append(calcularTotal()).append("\n");
        return sb.toString();
    }

    public void guardarEnArchivo(String nombreArchivo) {
        System.out.println("Guardando en archivo: " + nombreArchivo);
        System.out.println(generarReporte());
    }
}
