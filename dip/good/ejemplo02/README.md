# DIP - Ejemplo 02 (good) - Notificaciones por canal abstracto

## Escenario (antes del código)
El notificador trabaja con una interfaz CanalNotificacion.
Email o SMS son implementaciones intercambiables.

## Cómo ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: orquesta e inyecta canal.
- CanalNotificacion.java: interfaz.
- EmailCanal.java y SmsCanal.java: implementaciones.
- Notificador.java: depende de la interfaz.

## Después del código (explicación por bloques)
- Notificador solo conoce el contrato enviar.
- Main elige el canal concreto.
- Cambiar de canal no requiere modificar Notificador.

## Qué huele mal
- No hay olor fuerte; el acoplamiento es bajo.

## Qué cambiaria si el requisito cambia
- Nuevo canal (WhatsApp): nueva clase.
- Cambio en email: solo EmailCanal.

## Por qué este diseño escala mejor
Escala mejor porque el alto nivel solo depende de abstracciones.



