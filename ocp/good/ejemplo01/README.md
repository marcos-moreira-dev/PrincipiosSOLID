# OCP - Ejemplo 01 (good) - Descuentos con estrategias

## Escenario (antes del código)
La tienda define descuentos como políticas separadas. Para agregar un nuevo
tipo de cliente, se crea una nueva clase que implementa la interfaz.

## Cómo ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: orquesta.
- PoliticaDescuento.java: contrato.
- DescuentoClienteNuevo/VIP/Regular: implementaciones.
- CalculadoraDescuento.java: usa la interfaz.

## Después del código (explicación por bloques)
- PoliticaDescuento define el comportamiento esperado.
- Cada política encapsula su propia regla.
- CalculadoraDescuento no cambia cuando aparece una política nueva.
- Main elige la política adecuada, sin tocar la calculadora.

## Qué huele mal
- No hay olor fuerte. El comportamiento se extiende con nuevas clases.

## Qué cambiaria si el requisito cambia
- Nuevo tipo de cliente: se agrega una nueva clase.
- Cambio de regla VIP: se edita solo esa política.

## Por qué este diseño escala mejor
Escala mejor porque el código central no se modifica cuando el negocio crece.



