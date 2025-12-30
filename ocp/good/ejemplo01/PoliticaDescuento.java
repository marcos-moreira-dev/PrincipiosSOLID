/**
 * Contrato para aplicar un descuento.
 */
public interface PoliticaDescuento {
    double aplicar(double monto);
    String nombre();
}
