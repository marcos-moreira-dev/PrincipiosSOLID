# OCP - Ejemplo 03 (good) - Areas con polimorfismo

## Escenario (antes del codigo)
Cada figura sabe calcular su propia area. La calculadora solo agrega
resultados y no necesita conocer tipos concretos.

## Como ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: orquesta.
- Forma.java: contrato de area.
- Circulo/Rectangulo/Triangulo: implementaciones.
- CalculadoraAreas.java: suma areas.

## Despues del codigo (explicacion por bloques)
- Forma define el metodo area.
- Cada figura concreta implementa su formula.
- CalculadoraAreas itera y suma, sin if/else.
- Main puede agregar nuevas figuras sin tocar la calculadora.

## Que huele mal
- No hay olor fuerte. El comportamiento se extiende con nuevas clases.

## Que cambiaria si el requisito cambia
- Nueva figura: agregar una clase que implemente Forma.
- Cambios en formula: modificar solo la clase correspondiente.

## Por que este diseno escala mejor
Escala mejor porque la extension ocurre sin modificar el codigo existente.
