# SRP - Ejemplo 03 (bad) - Logger, serializacion y networking juntos

## Escenario (antes del código)
Un sistema de auditoria registra eventos sensibles. Para "ganar tiempo",
se crea una clase única que arma un texto, lo imprime y lo envía por red.
Cuando llega un nuevo requisito (cambiar el formato o el protocolo),
toda la clase debe modificarse.

## Cómo ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: orquesta el registro.
- RegistroAuditoria.java: serializa, loguea y envía.
- Evento.java: representa el evento.

## Después del código (explicación por bloques)
- RegistroAuditoria hace tres tareas tecnicamente distintas:
  serializacion, logging y comunicacion.
- registrarEvento llama a métodos privados que no deberían vivir juntos.
- Main depende de un "todo en uno", lo que dificulta cambios aislados.

## Qué huele mal
- Responsabilidades mezcladas: salida local y envio remoto.
- Cambios en el formato rompen el envio.
- difícil probar serializacion sin activar la red.

## Qué cambiaria si el requisito cambia
- Si el log cambia a formato JSON, cambia RegistroAuditoria.
- Si el envio pasa de HTTP a otro protocolo, cambia RegistroAuditoria.
- Si se requiere desactivar logs en consola, cambia RegistroAuditoria.

## Por qué este diseño escala mejor
No escala mejor. El crecimiento agrega más lógica a la misma clase
y aumenta el acoplamiento entre decisiones independientes.



