# OCP - Ejemplo 02 (bad) - Exportar con if

## Escenario (antes del código)
Un reporte se debe exportar a CSV, JSON o XML. Se crea un método con if/else.
Funciona, pero cada nuevo formato obliga a tocar el mismo código central.

## Cómo ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: orquesta.
- ExportadorDatos.java: elige formato con if/else.

## Después del código (explicación por bloques)
- exportar recibe un string de formato y elige con if/else.
- Cada nuevo formato fuerza modificar el mismo método.
- Main no puede extender el comportamiento sin cambios internos.

## Qué huele mal
- Condicionales por tipo.
- código central conoce todos los formatos.
- difícil reutilizar exportacion en otros contextos.

## Qué cambiaria si el requisito cambia
- Nuevo formato YAML: cambia ExportadorDatos.
- Cambios en XML: cambia ExportadorDatos.

## Por qué este diseño escala mejor
No escala mejor. La clase central crece y se vuelve fragil.



