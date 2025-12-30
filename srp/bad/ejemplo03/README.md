# SRP - Ejemplo 03 (bad) - Logger, serializacion y networking juntos

## Escenario (antes del codigo)
Un sistema de auditoria registra eventos sensibles. Para "ganar tiempo",
se crea una clase unica que arma un texto, lo imprime y lo envia por red.
Cuando llega un nuevo requisito (cambiar el formato o el protocolo),
toda la clase debe modificarse.

## Como ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: orquesta el registro.
- RegistroAuditoria.java: serializa, loguea y envia.
- Evento.java: representa el evento.

## Despues del codigo (explicacion por bloques)
- RegistroAuditoria hace tres tareas tecnicamente distintas:
  serializacion, logging y comunicacion.
- registrarEvento llama a metodos privados que no deberian vivir juntos.
- Main depende de un "todo en uno", lo que dificulta cambios aislados.

## Que huele mal
- Responsabilidades mezcladas: salida local y envio remoto.
- Cambios en el formato rompen el envio.
- Dificil probar serializacion sin activar la red.

## Que cambiaria si el requisito cambia
- Si el log cambia a formato JSON, cambia RegistroAuditoria.
- Si el envio pasa de HTTP a otro protocolo, cambia RegistroAuditoria.
- Si se requiere desactivar logs en consola, cambia RegistroAuditoria.

## Por que este diseno escala mejor
No escala mejor. El crecimiento agrega mas logica a la misma clase
y aumenta el acoplamiento entre decisiones independientes.
