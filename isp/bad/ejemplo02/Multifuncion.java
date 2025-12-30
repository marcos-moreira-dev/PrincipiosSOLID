public class Multifuncion implements Device {
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
