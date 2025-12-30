/**
 * Representa un item de factura con cantidad y precio.
 */
public class Item {
    private String nombre;
    private int cantidad;
    private double precioUnitario;

    public Item(String nombre, int cantidad, double precioUnitario) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getSubtotal() {
        return cantidad * precioUnitario;
    }
}
