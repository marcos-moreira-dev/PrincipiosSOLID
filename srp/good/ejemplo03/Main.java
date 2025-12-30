/**
 * Punto de entrada del ejemplo y orquestador del flujo.
 */
public class Main {
    /**
 * Punto de entrada del ejemplo.
 * @param args argumentos de linea de comandos
 */
public static void main(String[] args) {
        LoggerSimple logger = new LoggerSimple();
        SerializadorSimple serializador = new SerializadorSimple();
        ClienteRed clienteRed = new ClienteRed();

        RegistroAuditoria registro = new RegistroAuditoria(logger, serializador, clienteRed);
        Evento evento = new Evento("LOGIN", "maria");

        registro.registrarEvento(evento);
    }
}
