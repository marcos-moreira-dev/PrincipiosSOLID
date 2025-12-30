public class Main {
    public static void main(String[] args) {
        CalculadoraDescuento calc = new CalculadoraDescuento();
        double monto = 100.0;

        double total = calc.calcular("VIP", monto);
        System.out.println("Total con descuento: " + total);
    }
}
