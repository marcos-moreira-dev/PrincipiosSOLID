import java.util.List;

/**
 * Suma el area de multiples formas.
 */
public class CalculadoraAreas {
    public double areaTotal(List<Forma> formas) {
        double total = 0.0;
        for (Forma f : formas) {
            total += f.area();
        }
        return total;
    }
}
