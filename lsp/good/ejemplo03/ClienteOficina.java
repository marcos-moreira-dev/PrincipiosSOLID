/**
 * Cliente que usa impresoras y escaneres.
 */
public class ClienteOficina {
    public void imprimirDocumento(Imprimible impresora) {
        impresora.imprimir("Reporte mensual");
    }

    public void escanearDocumento(Escaneable escaner) {
        escaner.escanear();
    }
}
