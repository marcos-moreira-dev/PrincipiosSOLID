/**
 * Punto de entrada del ejemplo y orquestador del flujo.
 */
public class Main {
    /**
 * Punto de entrada del ejemplo.
 * @param args argumentos de linea de comandos
 */
public static void main(String[] args) {
        double monto = 100.0;

        PoliticaDescuento politica = new DescuentoClienteVIP();
        CalculadoraDescuento calc = new CalculadoraDescuento();

        double total = calc.calcular(monto, politica);
        System.out.println("Politica: " + politica.nombre());
        System.out.println("Total con descuento: " + total);
    }
}
