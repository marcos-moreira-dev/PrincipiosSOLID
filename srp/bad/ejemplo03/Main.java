public class Main {
    public static void main(String[] args) {
        RegistroAuditoria registro = new RegistroAuditoria();
        Evento evento = new Evento("LOGIN", "maria");

        registro.registrarEvento(evento);
    }
}
