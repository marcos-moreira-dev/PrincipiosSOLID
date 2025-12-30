public class Main {
    public static void main(String[] args) {
        ClienteOficina cliente = new ClienteOficina();

        ImpresoraMultifuncion multi = new ImpresoraMultifuncion();
        cliente.procesarDocumento(multi);

        ImpresoraMultifuncion basica = new ImpresoraBasica();
        cliente.procesarDocumento(basica);
    }
}
