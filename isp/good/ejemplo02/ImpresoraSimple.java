/**
 * Impresora con capacidad basica.
 */
public class ImpresoraSimple implements Imprimible {
    public void imprimir(String texto) {
        System.out.println("Imprimiendo: " + texto);
    }
}
