# OCP - Ejemplo 01 (bad) - Descuentos con if/switch

## Escenario (antes del código)
Una tienda ofrece descuentos segun el tipo de cliente: nuevo, regular, VIP.
El primer enfoque fue simple: un método con if/else. El problema es que
cada nuevo tipo de cliente obliga a modificar esa clase.

## Cómo ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: orquesta el uso.
- CalculadoraDescuento.java: usa if/else con tipos.

## Después del código (explicación por bloques)
- calcular decide el descuento con if/else.
- Para agregar un nuevo tipo, hay que editar el método.
- Main queda acoplado a la lógica interna de tipos.

## Qué huele mal
- Cadena de if/else creciendo.
- Clase central conoce todos los tipos posibles.
- difícil probar nuevos tipos sin tocar la clase.

## Qué cambiaria si el requisito cambia
- Nuevo tipo "EMPRESA": hay que modificar CalculadoraDescuento.
- Reglas distintas por país: hay que reescribir el if.

## Por qué este diseño escala mejor
No escala mejor. Cada nuevo descuento es una modificación peligrosa
en un punto central, lo que aumenta el riesgo de errores.



