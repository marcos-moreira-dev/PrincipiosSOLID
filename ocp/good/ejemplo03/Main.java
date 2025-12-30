import java.util.Arrays;
import java.util.List;

/**
 * Punto de entrada del ejemplo y orquestador del flujo.
 */
public class Main {
    /**
 * Punto de entrada del ejemplo.
 * @param args argumentos de linea de comandos
 */
public static void main(String[] args) {
        List<Forma> formas = Arrays.asList(
            new Circulo(3),
            new Rectangulo(4, 5),
            new Triangulo(3, 6)
        );

        CalculadoraAreas calc = new CalculadoraAreas();
        double total = calc.areaTotal(formas);

        System.out.println("Area total: " + total);
    }
}
