public class CalculadoraDescuento {
    public double calcular(String tipoCliente, double monto) {
        if ("NUEVO".equals(tipoCliente)) {
            return monto * 0.90;
        } else if ("VIP".equals(tipoCliente)) {
            return monto * 0.80;
        } else {
            return monto;
        }
    }
}
