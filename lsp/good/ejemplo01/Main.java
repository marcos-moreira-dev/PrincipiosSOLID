/**
 * Punto de entrada del ejemplo y orquestador del flujo.
 */
public class Main {
    /**
 * Punto de entrada del ejemplo.
 * @param args argumentos de linea de comandos
 */
public static void main(String[] args) {
        Forma r = new Rectangulo(5, 4);
        Forma c = new Cuadrado(4);

        System.out.println("Area rectangulo: " + r.area());
        System.out.println("Area cuadrado: " + c.area());
    }
}
