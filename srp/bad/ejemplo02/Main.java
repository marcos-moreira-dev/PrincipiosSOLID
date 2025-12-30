public class Main {
    public static void main(String[] args) {
        UsuarioManager manager = new UsuarioManager();
        Usuario usuario = new Usuario("Ana Gomez", "ana@email.com", 17);

        manager.registrar(usuario);
    }
}
