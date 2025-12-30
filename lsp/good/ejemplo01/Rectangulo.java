/**
 * Forma rectangular con calculo de area.
 */
public class Rectangulo implements Forma {
    private int ancho;
    private int alto;

    public Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public int area() {
        return ancho * alto;
    }
}
