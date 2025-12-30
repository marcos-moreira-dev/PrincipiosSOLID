# SRP - Ejemplo 03 (good) - Auditoria separada

## Escenario (antes del código)
El sistema de auditoria ahora separa serializacion, logging y envio.
Cada responsabilidad es independiente y se puede cambiar sin afectar a las otras.

## Cómo ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: orquesta.
- Evento.java: datos.
- LoggerSimple.java: logging.
- SerializadorSimple.java: serializacion.
- ClienteRed.java: envio.
- RegistroAuditoria.java: coordina dependencias.

## Después del código (explicación por bloques)
- SerializadorSimple solo construye el texto del evento.
- LoggerSimple solo escribe en consola.
- ClienteRed solo "envía" un texto.
- RegistroAuditoria coordina, pero no hace el trabajo concreto.
- Main une las piezas, manteniendo el flujo claro.

## Qué huele mal
- No hay olor fuerte. La clase coordinadora no hace trabajo pesado.
- El acoplamiento es bajo y cada clase tiene un solo motivo de cambio.

## Qué cambiaria si el requisito cambia
- Nuevo formato de serializacion: cambia SerializadorSimple.
- Nuevo protocolo: cambia ClienteRed.
- Nuevo destino de logs: cambia LoggerSimple.

## Por qué este diseño escala mejor
Escala mejor porque cada cambio se localiza y las piezas se reemplazan
sin tocar el resto del sistema.



