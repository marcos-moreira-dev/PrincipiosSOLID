/**
 * Punto de entrada del ejemplo y orquestador del flujo.
 */
public class Main {
    /**
 * Punto de entrada del ejemplo.
 * @param args argumentos de linea de comandos
 */
public static void main(String[] args) {
        CanalNotificacion canal = new EmailCanal();
        Notificador notificador = new Notificador(canal);

        notificador.enviar("ana@email.com", "Bienvenida");
    }
}
