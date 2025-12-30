# OCP - Ejemplo 01 (bad) - Descuentos con if/switch

## Escenario (antes del codigo)
Una tienda ofrece descuentos segun el tipo de cliente: nuevo, regular, VIP.
El primer enfoque fue simple: un metodo con if/else. El problema es que
cada nuevo tipo de cliente obliga a modificar esa clase.

## Como ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: orquesta el uso.
- CalculadoraDescuento.java: usa if/else con tipos.

## Despues del codigo (explicacion por bloques)
- calcular decide el descuento con if/else.
- Para agregar un nuevo tipo, hay que editar el metodo.
- Main queda acoplado a la logica interna de tipos.

## Que huele mal
- Cadena de if/else creciendo.
- Clase central conoce todos los tipos posibles.
- Dificil probar nuevos tipos sin tocar la clase.

## Que cambiaria si el requisito cambia
- Nuevo tipo "EMPRESA": hay que modificar CalculadoraDescuento.
- Reglas distintas por pais: hay que reescribir el if.

## Por que este diseno escala mejor
No escala mejor. Cada nuevo descuento es una modificacion peligrosa
en un punto central, lo que aumenta el riesgo de errores.
