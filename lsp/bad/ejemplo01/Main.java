public class Main {
    public static void main(String[] args) {
        Rectangulo r = new Rectangulo();
        probarRectangulo(r);

        Rectangulo c = new Cuadrado();
        probarRectangulo(c);
    }

    private static void probarRectangulo(Rectangulo r) {
        r.setAncho(5);
        r.setAlto(4);
        System.out.println("Area esperada 20, area real: " + r.area());
    }
}
