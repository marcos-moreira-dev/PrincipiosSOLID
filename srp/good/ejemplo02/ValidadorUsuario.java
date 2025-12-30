/**
 * Valida reglas basicas de un usuario.
 */
public class ValidadorUsuario {
    public boolean esValido(Usuario usuario) {
        if (usuario.getNombre() == null || usuario.getNombre().isEmpty()) {
            return false;
        }
        if (usuario.getEmail() == null || !usuario.getEmail().contains("@")) {
            return false;
        }
        return usuario.getEdad() >= 18;
    }
}
