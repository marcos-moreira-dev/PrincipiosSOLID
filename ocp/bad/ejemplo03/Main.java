import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FormaSimple> formas = Arrays.asList(
            new FormaSimple("CIRCULO", 3, 0),
            new FormaSimple("RECTANGULO", 4, 5),
            new FormaSimple("TRIANGULO", 3, 6)
        );

        AreaCalculator calc = new AreaCalculator();
        double total = calc.areaTotal(formas);

        System.out.println("Area total: " + total);
    }
}
