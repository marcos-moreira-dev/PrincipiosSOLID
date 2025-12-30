# ISP - Ejemplo 01 (bad) - Interfaz Worker gigante

## Escenario (antes del codigo)
Una empresa define una interfaz Worker con tareas de todo tipo.
Un becario no puede reparar maquinas, pero aun asi debe implementar el metodo.
Esto genera codigo vacio y confuso.

## Como ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: orquesta.
- Worker.java: interfaz grande.
- Desarrollador.java y Becario.java: implementaciones.

## Despues del codigo (explicacion por bloques)
- Worker obliga a implementar tareas no relacionadas.
- Becario imprime "no aplica", que es una senal de mal diseno.
- Main depende de una interfaz inflada.

## Que huele mal
- Metodos vacios o sin sentido.
- Clientes forzados a depender de metodos innecesarios.

## Que cambiaria si el requisito cambia
- Nuevo rol agrega mas metodos en Worker.
- Cada clase tiene que implementar metodos que no necesita.

## Por que este diseno escala mejor
No escala mejor. La interfaz crece y todas las implementaciones sufren.
