public class Notificador {
    private EmailSender emailSender;

    public Notificador() {
        this.emailSender = new EmailSender();
    }

    public void enviar(String destino, String mensaje) {
        emailSender.enviar(destino, mensaje);
    }
}
