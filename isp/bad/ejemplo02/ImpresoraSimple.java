public class ImpresoraSimple implements Device {
    public void imprimir(String texto) {
        System.out.println("Imprimiendo: " + texto);
    }

    public void escanear() {
        System.out.println("No soporta escaneo");
    }

    public void fax() {
        System.out.println("No soporta fax");
    }
}
