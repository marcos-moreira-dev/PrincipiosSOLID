# SRP - Ejemplo 01 (bad) - Factura mezclada

## Escenario (antes del codigo)
Una tienda pequena genera facturas para sus clientes. Al principio es rapido
hacer todo en una sola clase: calcular totales, formatear el texto y guardar.
Con el tiempo, la tienda quiere cambiar el formato del reporte y tambien la forma
de guardar (archivo, base de datos, nube). Esta clase unica se vuelve un cuello de botella.

## Como ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: orquesta el uso del sistema.
- FacturaManager.java: calcula, formatea y guarda (todo mezclado).
- Item.java: representa un item de la factura.

## Despues del codigo (explicacion por bloques)
- FacturaManager mezcla datos (id, cliente, items) con reglas de negocio
  (calcular total) y con infraestructura (guardar).
- generarReporte arma un texto completo, lo cual es formateo.
- guardarEnArchivo simula persistencia y ademas llama a generarReporte,
  mezclando logica de salida con logica de almacenamiento.
- Main solo orquesta, pero depende de una clase enorme y multifuncional.

## Que huele mal
- Una sola clase tiene muchas responsabilidades.
- Cualquier cambio en formato o persistencia obliga a tocar FacturaManager.
- La clase es dificil de probar por partes.

## Que cambiaria si el requisito cambia
- Si cambia el formato (por ejemplo a HTML), FacturaManager cambia.
- Si cambia el almacenamiento (archivo a base de datos), FacturaManager cambia.
- Si cambia la forma de calcular impuestos, FacturaManager cambia.

## Por que este diseno escala mejor
No escala mejor. Escala peor porque cada nuevo requisito agrega mas metodos
a la misma clase y aumenta el riesgo de efectos colaterales.
