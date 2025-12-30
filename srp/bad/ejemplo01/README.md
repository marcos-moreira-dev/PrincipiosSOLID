# SRP - Ejemplo 01 (bad) - Factura mezclada

## Escenario (antes del código)
Una tienda pequeña genera facturas para sus clientes. Al principio es rápido
hacer todo en una sola clase: calcular totales, formatear el texto y guardar.
Con el tiempo, la tienda quiere cambiar el formato del reporte y también la forma
de guardar (archivo, base de datos, nube). Esta clase única se vuelve un cuello de botella.

## Cómo ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: orquesta el uso del sistema.
- FacturaManager.java: calcula, formatea y guarda (todo mezclado).
- Item.java: representa un item de la factura.

## Después del código (explicación por bloques)
- FacturaManager mezcla datos (id, cliente, items) con reglas de negocio
  (calcular total) y con infraestructura (guardar).
- generarReporte arma un texto completo, lo cual es formateo.
- guardarEnArchivo simula persistencia y además llama a generarReporte,
  mezclando lógica de salida con lógica de almacenamiento.
- Main solo orquesta, pero depende de una clase enorme y multifuncional.

## Qué huele mal
- Una sola clase tiene muchas responsabilidades.
- Cualquier cambio en formato o persistencia obliga a tocar FacturaManager.
- La clase es difícil de probar por partes.

## Qué cambiaria si el requisito cambia
- Si cambia el formato (por ejemplo a HTML), FacturaManager cambia.
- Si cambia el almacenamiento (archivo a base de datos), FacturaManager cambia.
- Si cambia la forma de calcular impuestos, FacturaManager cambia.

## Por qué este diseño escala mejor
No escala mejor. Escala peor porque cada nuevo requisito agrega más métodos
a la misma clase y aumenta el riesgo de efectos colaterales.



