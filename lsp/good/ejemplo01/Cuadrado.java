/**
 * Forma cuadrada con calculo de area.
 */
public class Cuadrado implements Forma {
    private int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    public int area() {
        return lado * lado;
    }
}
