/**
 * Crea mensajes de bienvenida para usuarios.
 */
public class FormateadorUsuario {
    public String crearMensaje(Usuario usuario) {
        return "Bienvenido, " + usuario.getNombre().toUpperCase() + "!";
    }
}
