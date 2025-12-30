# OCP - Ejemplo 03 (bad) - área con tipos y condicionales

## Escenario (antes del código)
Una app calcula areas de figuras. Se usa un objeto con tipo y parametros.
Para cada nueva figura, hay que modificar la calculadora.

## Cómo ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: orquesta.
- AreaCalculator.java: switch por tipo.
- FormaSimple.java: datos genéricos.

## Después del código (explicación por bloques)
- AreaCalculator inspecciona tipo y calcula con if/else.
- Cada nueva figura obliga a modificar AreaCalculator.
- FormaSimple usa campos genéricos, lo que abre la puerta a errores.

## Qué huele mal
- Switch por tipo.
- Clase central conoce todos los casos.
- Datos genéricos sin tipo fuerte.

## Qué cambiaria si el requisito cambia
- Nueva figura "Hexagono": toca AreaCalculator.
- Nueva fórmula: toca AreaCalculator.

## Por qué este diseño escala mejor
No escala mejor. Los cambios se acumulan en la misma clase.



