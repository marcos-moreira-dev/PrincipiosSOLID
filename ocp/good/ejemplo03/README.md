# OCP - Ejemplo 03 (good) - Areas con polimorfismo

## Escenario (antes del código)
Cada figura sabe calcular su propia área. La calculadora solo agrega
resultados y no necesita conocer tipos concretos.

## Cómo ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: orquesta.
- Forma.java: contrato de área.
- Circulo/Rectangulo/Triangulo: implementaciones.
- CalculadoraAreas.java: suma areas.

## Después del código (explicación por bloques)
- Forma define el método área.
- Cada figura concreta implementa su fórmula.
- CalculadoraAreas itera y suma, sin if/else.
- Main puede agregar nuevas figuras sin tocar la calculadora.

## Qué huele mal
- No hay olor fuerte. El comportamiento se extiende con nuevas clases.

## Qué cambiaria si el requisito cambia
- Nueva figura: agregar una clase que implemente Forma.
- Cambios en fórmula: modificar solo la clase correspondiente.

## Por qué este diseño escala mejor
Escala mejor porque la extensión ocurre sin modificar el código existente.



