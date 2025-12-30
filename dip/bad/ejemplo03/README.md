# DIP - Ejemplo 03 (bad) - Pagos acoplados a PayPal

## Escenario (antes del codigo)
Un procesador de pagos crea un cliente PayPal concreto. Si hay un nuevo
proveedor o se cambia el proveedor, hay que editar el procesador.

## Como ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: orquesta.
- ProcesadorPago.java: depende de PayPalApi.
- PayPalApi.java: implementacion concreta.

## Despues del codigo (explicacion por bloques)
- ProcesadorPago instancia PayPalApi.
- La logica de alto nivel queda acoplada a una API concreta.

## Que huele mal
- Dependencia fuerte en proveedor.
- Dificil cambiar o testear con fakes.

## Que cambiaria si el requisito cambia
- Agregar otro proveedor: toca ProcesadorPago.
- Cambiar PayPal: toca ProcesadorPago.

## Por que este diseno escala mejor
No escala mejor. El alto nivel no puede evolucionar sin cambiarse.
