# OCP - Ejemplo 02 (good) - Exportadores separados

## Escenario (antes del codigo)
En lugar de condicionales, cada formato se implementa como una clase
que cumple una interfaz comun. La clase principal solo conoce el contrato.

## Como ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: orquesta.
- Exportador.java: contrato.
- ExportadorCSV/JSON/XML: implementaciones.
- ServicioExportacion.java: usa el contrato.

## Despues del codigo (explicacion por bloques)
- Exportador define la operacion exportar.
- Cada clase concreta implementa su propio formato.
- ServicioExportacion es estable y no cambia ante nuevos formatos.
- Main decide que exportador usar, sin tocar el servicio.

## Que huele mal
- No hay olor fuerte; el flujo esta abierto a extension.

## Que cambiaria si el requisito cambia
- Nuevo formato YAML: crear ExportadorYAML.
- Cambio en JSON: solo editar ExportadorJSON.

## Por que este diseno escala mejor
Escala mejor porque el servicio central no se modifica, solo se extiende.
