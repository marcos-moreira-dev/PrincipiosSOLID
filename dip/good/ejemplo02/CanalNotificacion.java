/**
 * Contrato para enviar notificaciones.
 */
public interface CanalNotificacion {
    void enviar(String destino, String mensaje);
}
