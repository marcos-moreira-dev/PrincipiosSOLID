/**
 * Punto de entrada del ejemplo y orquestador del flujo.
 */
public class Main {
    /**
 * Punto de entrada del ejemplo.
 * @param args argumentos de linea de comandos
 */
public static void main(String[] args) {
        Usuario usuario = new Usuario("Ana Gomez", "ana@email.com", 19);

        ValidadorUsuario validador = new ValidadorUsuario();
        FormateadorUsuario formateador = new FormateadorUsuario();
        ServicioEmail email = new ServicioEmail();

        if (validador.esValido(usuario)) {
            String mensaje = formateador.crearMensaje(usuario);
            email.enviar(usuario.getEmail(), mensaje);
        } else {
            System.out.println("Usuario invalido. No se registra.");
        }
    }
}
