# DIP - Ejemplo 02 (bad) - Notificador acoplado a Email

## Escenario (antes del código)
Un notificador crea directamente un EmailSender. Cuando el negocio pide SMS,
el notificador debe modificarse.

## Cómo ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: orquesta.
- Notificador.java: depende de EmailSender concreto.
- EmailSender.java: implementación concreta.

## Después del código (explicación por bloques)
- Notificador instancia EmailSender.
- No hay abstraccion para otros canales.
- El cambio de canal obliga a modificar Notificador.

## Qué huele mal
- Dependencia directa en una clase concreta.
- Bajo nivel controla al alto nivel.

## Qué cambiaria si el requisito cambia
- Agregar SMS: toca Notificador.
- Cambiar API de email: toca Notificador.

## Por qué este diseño escala mejor
No escala mejor. El servicio de alto nivel se vuelve rígido.



