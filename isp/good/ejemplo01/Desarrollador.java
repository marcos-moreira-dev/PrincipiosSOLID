/**
 * Trabajador con tareas de desarrollo.
 */
public class Desarrollador implements Trabajador, Comedor, Reportable, Mantenible {
    public void trabajar() {
        System.out.println("Desarrollador programando");
    }

    public void comer() {
        System.out.println("Desarrollador comiendo");
    }

    public void reportar() {
        System.out.println("Desarrollador reportando progreso");
    }

    public void repararMaquina() {
        System.out.println("Desarrollador repara su equipo");
    }
}
