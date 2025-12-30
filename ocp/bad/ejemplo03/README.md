# OCP - Ejemplo 03 (bad) - Area con tipos y condicionales

## Escenario (antes del codigo)
Una app calcula areas de figuras. Se usa un objeto con tipo y parametros.
Para cada nueva figura, hay que modificar la calculadora.

## Como ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: orquesta.
- AreaCalculator.java: switch por tipo.
- FormaSimple.java: datos genericos.

## Despues del codigo (explicacion por bloques)
- AreaCalculator inspecciona tipo y calcula con if/else.
- Cada nueva figura obliga a modificar AreaCalculator.
- FormaSimple usa campos genericos, lo que abre la puerta a errores.

## Que huele mal
- Switch por tipo.
- Clase central conoce todos los casos.
- Datos genericos sin tipo fuerte.

## Que cambiaria si el requisito cambia
- Nueva figura "Hexagono": toca AreaCalculator.
- Nueva formula: toca AreaCalculator.

## Por que este diseno escala mejor
No escala mejor. Los cambios se acumulan en la misma clase.
