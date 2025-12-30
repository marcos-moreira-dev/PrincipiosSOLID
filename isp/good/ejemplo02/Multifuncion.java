/**
 * Dispositivo con multiples capacidades.
 */
public class Multifuncion implements Imprimible, Escaneable, Faxable {
    public void imprimir(String texto) {
        System.out.println("Imprimiendo: " + texto);
    }

    public void escanear() {
        System.out.println("Escaneando documento");
    }

    public void fax() {
        System.out.println("Enviando fax");
    }
}
