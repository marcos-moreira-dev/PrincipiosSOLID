/**
 * Canal de notificacion por email.
 */
public class EmailCanal implements CanalNotificacion {
    public void enviar(String destino, String mensaje) {
        System.out.println("Email a " + destino + ": " + mensaje);
    }
}
