# DIP - Ejemplo 02 (good) - Notificaciones por canal abstracto

## Escenario (antes del codigo)
El notificador trabaja con una interfaz CanalNotificacion.
Email o SMS son implementaciones intercambiables.

## Como ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: orquesta e inyecta canal.
- CanalNotificacion.java: interfaz.
- EmailCanal.java y SmsCanal.java: implementaciones.
- Notificador.java: depende de la interfaz.

## Despues del codigo (explicacion por bloques)
- Notificador solo conoce el contrato enviar.
- Main elige el canal concreto.
- Cambiar de canal no requiere modificar Notificador.

## Que huele mal
- No hay olor fuerte; el acoplamiento es bajo.

## Que cambiaria si el requisito cambia
- Nuevo canal (WhatsApp): nueva clase.
- Cambio en email: solo EmailCanal.

## Por que este diseno escala mejor
Escala mejor porque el alto nivel solo depende de abstracciones.
