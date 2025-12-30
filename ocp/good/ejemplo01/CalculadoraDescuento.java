/**
 * Aplica una politica de descuento sobre un monto.
 */
public class CalculadoraDescuento {
    public double calcular(double monto, PoliticaDescuento politica) {
        return politica.aplicar(monto);
    }
}
