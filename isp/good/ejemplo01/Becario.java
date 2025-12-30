/**
 * Trabajador en entrenamiento.
 */
public class Becario implements Trabajador, Comedor, Reportable {
    public void trabajar() {
        System.out.println("Becario haciendo tareas simples");
    }

    public void comer() {
        System.out.println("Becario comiendo");
    }

    public void reportar() {
        System.out.println("Becario reporta a su tutor");
    }
}
