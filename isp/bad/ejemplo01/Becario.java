public class Becario implements Worker {
    public void trabajar() {
        System.out.println("Becario haciendo tareas simples");
    }

    public void comer() {
        System.out.println("Becario comiendo");
    }

    public void reportar() {
        System.out.println("Becario reporta a su tutor");
    }

    public void repararMaquina() {
        System.out.println("No aplica: becario no repara maquinas");
    }
}
