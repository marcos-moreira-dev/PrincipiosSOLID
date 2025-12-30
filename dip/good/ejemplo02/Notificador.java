/**
 * Coordina el envio de notificaciones.
 */
public class Notificador {
    private CanalNotificacion canal;

    public Notificador(CanalNotificacion canal) {
        this.canal = canal;
    }

    public void enviar(String destino, String mensaje) {
        canal.enviar(destino, mensaje);
    }
}
