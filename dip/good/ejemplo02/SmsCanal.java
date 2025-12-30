/**
 * Canal de notificacion por SMS.
 */
public class SmsCanal implements CanalNotificacion {
    public void enviar(String destino, String mensaje) {
        System.out.println("SMS a " + destino + ": " + mensaje);
    }
}
