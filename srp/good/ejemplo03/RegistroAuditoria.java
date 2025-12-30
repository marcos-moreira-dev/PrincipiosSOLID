/**
 * Coordina serializacion, log y envio de eventos.
 */
public class RegistroAuditoria {
    private LoggerSimple logger;
    private SerializadorSimple serializador;
    private ClienteRed clienteRed;

    public RegistroAuditoria(LoggerSimple logger, SerializadorSimple serializador, ClienteRed clienteRed) {
        this.logger = logger;
        this.serializador = serializador;
        this.clienteRed = clienteRed;
    }

    public void registrarEvento(Evento evento) {
        String texto = serializador.serializar(evento);
        logger.log(texto);
        clienteRed.enviar(texto);
    }
}
