/**
 * Forma circular con calculo de area.
 */
public class Circulo implements Forma {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double area() {
        return Math.PI * radio * radio;
    }
}
