/**
 * Impresora que imprime y escanea.
 */
public class ImpresoraMultifuncion implements Imprimible, Escaneable {
    public void imprimir(String texto) {
        System.out.println("Imprimiendo: " + texto);
    }

    public void escanear() {
        System.out.println("Escaneando documento...");
    }
}
