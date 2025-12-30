public class Main {
    public static void main(String[] args) {
        Device simple = new ImpresoraSimple();
        Device multi = new Multifuncion();

        simple.imprimir("Factura");
        simple.escanear();

        multi.imprimir("Contrato");
        multi.fax();
    }
}
