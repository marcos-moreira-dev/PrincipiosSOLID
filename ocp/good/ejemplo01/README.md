# OCP - Ejemplo 01 (good) - Descuentos con estrategias

## Escenario (antes del codigo)
La tienda define descuentos como politicas separadas. Para agregar un nuevo
tipo de cliente, se crea una nueva clase que implementa la interfaz.

## Como ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: orquesta.
- PoliticaDescuento.java: contrato.
- DescuentoClienteNuevo/VIP/Regular: implementaciones.
- CalculadoraDescuento.java: usa la interfaz.

## Despues del codigo (explicacion por bloques)
- PoliticaDescuento define el comportamiento esperado.
- Cada politica encapsula su propia regla.
- CalculadoraDescuento no cambia cuando aparece una politica nueva.
- Main elige la politica adecuada, sin tocar la calculadora.

## Que huele mal
- No hay olor fuerte. El comportamiento se extiende con nuevas clases.

## Que cambiaria si el requisito cambia
- Nuevo tipo de cliente: se agrega una nueva clase.
- Cambio de regla VIP: se edita solo esa politica.

## Por que este diseno escala mejor
Escala mejor porque el codigo central no se modifica cuando el negocio crece.
