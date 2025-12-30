/**
 * Representa un evento de auditoria.
 */
public class Evento {
    private String tipo;
    private String usuario;

    public Evento(String tipo, String usuario) {
        this.tipo = tipo;
        this.usuario = usuario;
    }

    public String getTipo() {
        return tipo;
    }

    public String getUsuario() {
        return usuario;
    }
}
