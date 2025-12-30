# OCP - Ejemplo 02 (good) - Exportadores separados

## Escenario (antes del código)
En lugar de condicionales, cada formato se implementa como una clase
que cumple una interfaz común. La clase principal solo conoce el contrato.

## Cómo ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: orquesta.
- Exportador.java: contrato.
- ExportadorCSV/JSON/XML: implementaciones.
- ServicioExportacion.java: usa el contrato.

## Después del código (explicación por bloques)
- Exportador define la operacion exportar.
- Cada clase concreta implementa su propio formato.
- ServicioExportacion es estable y no cambia ante nuevos formatos.
- Main decide que exportador usar, sin tocar el servicio.

## Qué huele mal
- No hay olor fuerte; el flujo está abierto a extensión.

## Qué cambiaria si el requisito cambia
- Nuevo formato YAML: crear ExportadorYAML.
- Cambio en JSON: solo editar ExportadorJSON.

## Por qué este diseño escala mejor
Escala mejor porque el servicio central no se modifica, solo se extiende.



