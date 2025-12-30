# OCP - Ejemplo 02 (bad) - Exportar con if

## Escenario (antes del codigo)
Un reporte se debe exportar a CSV, JSON o XML. Se crea un metodo con if/else.
Funciona, pero cada nuevo formato obliga a tocar el mismo codigo central.

## Como ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: orquesta.
- ExportadorDatos.java: elige formato con if/else.

## Despues del codigo (explicacion por bloques)
- exportar recibe un string de formato y elige con if/else.
- Cada nuevo formato fuerza modificar el mismo metodo.
- Main no puede extender el comportamiento sin cambios internos.

## Que huele mal
- Condicionales por tipo.
- Codigo central conoce todos los formatos.
- Dificil reutilizar exportacion en otros contextos.

## Que cambiaria si el requisito cambia
- Nuevo formato YAML: cambia ExportadorDatos.
- Cambios en XML: cambia ExportadorDatos.

## Por que este diseno escala mejor
No escala mejor. La clase central crece y se vuelve fragil.
