# DIP - Ejemplo 03 (bad) - Pagos acoplados a PayPal

## Escenario (antes del código)
Un procesador de pagos crea un cliente PayPal concreto. Si hay un nuevo
proveedor o se cambia el proveedor, hay que editar el procesador.

## Cómo ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: orquesta.
- ProcesadorPago.java: depende de PayPalApi.
- PayPalApi.java: implementación concreta.

## Después del código (explicación por bloques)
- ProcesadorPago instancia PayPalApi.
- La lógica de alto nivel queda acoplada a una API concreta.

## Qué huele mal
- Dependencia fuerte en proveedor.
- difícil cambiar o testear con fakes.

## Qué cambiaria si el requisito cambia
- Agregar otro proveedor: toca ProcesadorPago.
- Cambiar PayPal: toca ProcesadorPago.

## Por qué este diseño escala mejor
No escala mejor. El alto nivel no puede evolucionar sin cambiarse.



