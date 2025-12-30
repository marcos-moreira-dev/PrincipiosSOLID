# ISP - Ejemplo 01 (bad) - Interfaz Worker gigante

## Escenario (antes del código)
Una empresa define una interfaz Worker con tareas de todo tipo.
Un becario no puede reparar maquinas, pero aun así debe implementar el método.
Esto genera código vacio y confuso.

## Cómo ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: orquesta.
- Worker.java: interfaz grande.
- Desarrollador.java y Becario.java: implementaciones.

## Después del código (explicación por bloques)
- Worker obliga a implementar tareas no relacionadas.
- Becario imprime "no aplica", que es una Señal de mal diseño.
- Main depende de una interfaz inflada.

## Qué huele mal
- métodos vacíos o sin sentido.
- Clientes forzados a depender de métodos innecesarios.

## Qué cambiaria si el requisito cambia
- Nuevo rol agrega más métodos en Worker.
- Cada clase tiene que implementar métodos que no necesita.

## Por qué este diseño escala mejor
No escala mejor. La interfaz crece y todas las implementaciones sufren.



