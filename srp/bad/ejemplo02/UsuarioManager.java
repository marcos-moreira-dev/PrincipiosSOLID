public class UsuarioManager {
    public void registrar(Usuario usuario) {
        if (!validar(usuario)) {
            System.out.println("Usuario invalido. No se registra.");
            return;
        }

        String mensaje = formatear(usuario);
        enviarEmail(usuario.getEmail(), mensaje);
    }

    private boolean validar(Usuario usuario) {
        if (usuario.getNombre() == null || usuario.getNombre().isEmpty()) {
            return false;
        }
        if (usuario.getEmail() == null || !usuario.getEmail().contains("@")) {
            return false;
        }
        if (usuario.getEdad() < 18) {
            return false;
        }
        return true;
    }

    private String formatear(Usuario usuario) {
        return "Bienvenido, " + usuario.getNombre().toUpperCase() + "!";
    }

    private void enviarEmail(String email, String mensaje) {
        System.out.println("Enviando email a: " + email);
        System.out.println("Mensaje: " + mensaje);
    }
}
