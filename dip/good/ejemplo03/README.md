# DIP - Ejemplo 03 (good) - Pasarela de pago abstracta

## Escenario (antes del código)
El procesador de pagos depende de una pasarela abstracta.
PayPal, tarjeta o cualquier otro proveedor son intercambiables.

## Cómo ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: orquesta.
- PasarelaPago.java: interfaz.
- PayPalApi.java y TarjetaApi.java: implementaciones.
- ProcesadorPago.java: depende de la interfaz.

## Después del código (explicación por bloques)
- ProcesadorPago recibe PasarelaPago por constructor.
- El proveedor concreto se elige en Main.
- Cambios de proveedor no tocan el procesador.

## Qué huele mal
- No hay olor fuerte; la dependencia es invertida.

## Qué cambiaria si el requisito cambia
- Nuevo proveedor: nueva clase que implementa PasarelaPago.
- Cambios en PayPal: solo esa clase.

## Por qué este diseño escala mejor
Escala mejor porque el alto nivel no depende de detalles de bajo nivel.



