/**
 * Impresora que solo imprime.
 */
public class ImpresoraBasica implements Imprimible {
    public void imprimir(String texto) {
        System.out.println("Imprimiendo: " + texto);
    }
}
