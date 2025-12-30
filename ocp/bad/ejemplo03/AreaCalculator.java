import java.util.List;

public class AreaCalculator {
    public double areaTotal(List<FormaSimple> formas) {
        double total = 0.0;
        for (FormaSimple f : formas) {
            if ("CIRCULO".equals(f.getTipo())) {
                total += Math.PI * f.getA() * f.getA();
            } else if ("RECTANGULO".equals(f.getTipo())) {
                total += f.getA() * f.getB();
            } else if ("TRIANGULO".equals(f.getTipo())) {
                total += (f.getA() * f.getB()) / 2.0;
            }
        }
        return total;
    }
}
