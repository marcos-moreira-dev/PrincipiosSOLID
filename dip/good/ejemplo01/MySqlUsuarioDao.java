/**
 * Implementacion de UsuarioDao simulando MySQL.
 */
public class MySqlUsuarioDao implements UsuarioDao {
    public void guardar(String nombre) {
        System.out.println("Guardando en MySQL: " + nombre);
    }
}
