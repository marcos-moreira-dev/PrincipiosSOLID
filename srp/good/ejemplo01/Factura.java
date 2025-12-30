import java.util.ArrayList;
import java.util.List;

/**
 * Representa una factura con su cliente e items.
 */
public class Factura {
    private String id;
    private String cliente;
    private List<Item> items;

    public Factura(String id, String cliente) {
        this.id = id;
        this.cliente = cliente;
        this.items = new ArrayList<>();
    }

    public void agregarItem(Item item) {
        items.add(item);
    }

    public String getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public List<Item> getItems() {
        return items;
    }
}
