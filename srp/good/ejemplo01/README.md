# SRP - Ejemplo 01 (good) - Factura separada por responsabilidades

## Escenario (antes del código)
La misma tienda ahora separa el calculo, el formateo y el guardado.
Cada parte cambia por motivos distintos: reglas de negocio, presentacion
y persistencia. Separarlas evita que un cambio arrastre a los demás.

## Cómo ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: orquesta el flujo.
- Factura.java y Item.java: datos puros.
- CalculadoraFactura.java: reglas de negocio (total).
- FormateadorFactura.java: salida en texto.
- RepositorioFactura.java: persistencia simulada.

## Después del código (explicación por bloques)
- Factura solo mantiene datos y permite agregar items.
- CalculadoraFactura solo calcula totales, sin saber nada de archivos.
- FormateadorFactura genera texto y no conoce el almacenamiento.
- RepositorioFactura guarda un string ya listo.
- Main orquesta, pero cada clase tiene un rol claro y reemplazable.

## Qué huele mal
- No hay olor fuerte; las responsabilidades están separadas.
- Si apareciera un olor, seria porque una clase nueva empieza a mezclar tareas.

## Qué cambiaria si el requisito cambia
- Si cambia el formato, solo cambia FormateadorFactura.
- Si cambia el almacenamiento, solo cambia RepositorioFactura.
- Si cambian los impuestos, solo cambia CalculadoraFactura.

## Por qué este diseño escala mejor
Escala mejor porque cada responsabilidad crece en su propio módulo,
y los cambios no se propagan a las otras partes.



