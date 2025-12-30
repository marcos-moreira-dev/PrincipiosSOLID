/**
 * Coordina el registro de usuarios.
 */
public class ServicioUsuarios {
    private UsuarioDao dao;

    public ServicioUsuarios(UsuarioDao dao) {
        this.dao = dao;
    }

    public void registrar(String nombre) {
        dao.guardar(nombre);
        System.out.println("Usuario registrado: " + nombre);
    }
}
