# SRP - Ejemplo 01 (good) - Factura separada por responsabilidades

## Escenario (antes del codigo)
La misma tienda ahora separa el calculo, el formateo y el guardado.
Cada parte cambia por motivos distintos: reglas de negocio, presentacion
y persistencia. Separarlas evita que un cambio arrastre a los demas.

## Como ejecutar
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

## Despues del codigo (explicacion por bloques)
- Factura solo mantiene datos y permite agregar items.
- CalculadoraFactura solo calcula totales, sin saber nada de archivos.
- FormateadorFactura genera texto y no conoce el almacenamiento.
- RepositorioFactura guarda un string ya listo.
- Main orquesta, pero cada clase tiene un rol claro y reemplazable.

## Que huele mal
- No hay olor fuerte; las responsabilidades estan separadas.
- Si apareciera un olor, seria porque una clase nueva empieza a mezclar tareas.

## Que cambiaria si el requisito cambia
- Si cambia el formato, solo cambia FormateadorFactura.
- Si cambia el almacenamiento, solo cambia RepositorioFactura.
- Si cambian los impuestos, solo cambia CalculadoraFactura.

## Por que este diseno escala mejor
Escala mejor porque cada responsabilidad crece en su propio modulo,
y los cambios no se propagan a las otras partes.
