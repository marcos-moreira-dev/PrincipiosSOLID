/**
 * Punto de entrada del ejemplo y orquestador del flujo.
 */
public class Main {
    /**
 * Punto de entrada del ejemplo.
 * @param args argumentos de linea de comandos
 */
public static void main(String[] args) {
        UsuarioDao dao = new MySqlUsuarioDao();
        ServicioUsuarios servicio = new ServicioUsuarios(dao);

        servicio.registrar("Carlos");
    }
}
