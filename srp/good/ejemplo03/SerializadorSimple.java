/**
 * Serializa eventos a texto simple.
 */
public class SerializadorSimple {
    public String serializar(Evento evento) {
        return "{tipo:" + evento.getTipo() + ", usuario:" + evento.getUsuario() + "}";
    }
}
