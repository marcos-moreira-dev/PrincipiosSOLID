public class ServicioUsuarios {
    private MySqlUsuarioDao dao;

    public ServicioUsuarios() {
        this.dao = new MySqlUsuarioDao();
    }

    public void registrar(String nombre) {
        dao.guardar(nombre);
        System.out.println("Usuario registrado: " + nombre);
    }
}
