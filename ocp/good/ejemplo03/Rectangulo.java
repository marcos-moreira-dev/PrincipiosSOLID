/**
 * Forma rectangular con calculo de area.
 */
public class Rectangulo implements Forma {
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double area() {
        return ancho * alto;
    }
}
