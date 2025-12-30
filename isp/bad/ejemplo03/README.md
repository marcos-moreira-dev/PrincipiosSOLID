# ISP - Ejemplo 03 (bad) - Repositorio con demasiados métodos

## Escenario (antes del código)
Un módulo de reportes solo necesita leer datos. Sin embargo, la interfaz
Repositorio incluye guardar, borrar, buscar y exportar. La clase de lectura
debe implementar métodos que no usa.

## Cómo ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: orquesta.
- Repositorio.java: interfaz grande.
- ReporteSoloLectura.java: implementación incompleta.

## Después del código (explicación por bloques)
- ReporteSoloLectura tiene métodos que no usa y devuelve mensajes vacíos.
- El cliente queda atado a una interfaz que no necesita.

## Qué huele mal
- Implementaciones con "no soportado".
- Interfaz no alineada con las necesidades reales.

## Qué cambiaria si el requisito cambia
- Agregar un nuevo método obliga a todas las clases.
- Los clientes deben ignorar métodos innecesarios.

## Por qué este diseño escala mejor
No escala mejor. Los contratos inflados generan acoplamiento y ruido.



