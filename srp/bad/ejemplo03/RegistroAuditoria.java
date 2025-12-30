public class RegistroAuditoria {
    public void registrarEvento(Evento evento) {
        String texto = serializar(evento);
        log(texto);
        enviar(texto);
    }

    private String serializar(Evento evento) {
        return "{tipo:" + evento.getTipo() + ", usuario:" + evento.getUsuario() + "}";
    }

    private void log(String texto) {
        System.out.println("LOG: " + texto);
    }

    private void enviar(String texto) {
        System.out.println("Enviando por red: " + texto);
    }
}
