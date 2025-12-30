# DIP - Ejemplo 03 (good) - Pasarela de pago abstracta

## Escenario (antes del codigo)
El procesador de pagos depende de una pasarela abstracta.
PayPal, tarjeta o cualquier otro proveedor son intercambiables.

## Como ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: orquesta.
- PasarelaPago.java: interfaz.
- PayPalApi.java y TarjetaApi.java: implementaciones.
- ProcesadorPago.java: depende de la interfaz.

## Despues del codigo (explicacion por bloques)
- ProcesadorPago recibe PasarelaPago por constructor.
- El proveedor concreto se elige en Main.
- Cambios de proveedor no tocan el procesador.

## Que huele mal
- No hay olor fuerte; la dependencia es invertida.

## Que cambiaria si el requisito cambia
- Nuevo proveedor: nueva clase que implementa PasarelaPago.
- Cambios en PayPal: solo esa clase.

## Por que este diseno escala mejor
Escala mejor porque el alto nivel no depende de detalles de bajo nivel.
