public class Main {
    public static void main(String[] args) {
        Worker dev = new Desarrollador();
        Worker becario = new Becario();

        dev.trabajar();
        dev.repararMaquina();

        becario.trabajar();
        becario.repararMaquina();
    }
}
