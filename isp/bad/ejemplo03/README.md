# ISP - Ejemplo 03 (bad) - Repositorio con demasiados metodos

## Escenario (antes del codigo)
Un modulo de reportes solo necesita leer datos. Sin embargo, la interfaz
Repositorio incluye guardar, borrar, buscar y exportar. La clase de lectura
debe implementar metodos que no usa.

## Como ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: orquesta.
- Repositorio.java: interfaz grande.
- ReporteSoloLectura.java: implementacion incompleta.

## Despues del codigo (explicacion por bloques)
- ReporteSoloLectura tiene metodos que no usa y devuelve mensajes vacios.
- El cliente queda atado a una interfaz que no necesita.

## Que huele mal
- Implementaciones con "no soportado".
- Interfaz no alineada con las necesidades reales.

## Que cambiaria si el requisito cambia
- Agregar un nuevo metodo obliga a todas las clases.
- Los clientes deben ignorar metodos innecesarios.

## Por que este diseno escala mejor
No escala mejor. Los contratos inflados generan acoplamiento y ruido.
