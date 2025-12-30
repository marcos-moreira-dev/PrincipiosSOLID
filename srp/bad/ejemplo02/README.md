# SRP - Ejemplo 02 (bad) - Usuario con validación, formateo y email

## Escenario (antes del código)
Un sistema de registro de usuarios crece rápido. Alguien decide poner
validación, formateo del mensaje y envio de email en la misma clase.
Funciona para el primer mes, pero luego llegan nuevos requisitos: otra política
de validación, email con plantilla, y un nuevo canal de notificacion.

## Cómo ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: orquesta el registro.
- UsuarioManager.java: valida, formatea y envía email.
- Usuario.java: datos básicos del usuario.

## Después del código (explicación por bloques)
- UsuarioManager tiene tres responsabilidades distintas:
  validación (reglas de negocio), presentacion (formato del mensaje)
  e infraestructura (envio de email).
- registrar combina todo en un solo flujo rígido.
- Main solo delega, pero queda acoplado a una clase "Dios".

## Qué huele mal
- Muchas razones de cambio en una sola clase.
- difícil reutilizar solo la validación o solo el formateo.
- Tests unitarios mezclan reglas con efectos secundarios (email).

## Qué cambiaria si el requisito cambia
- Si cambia la política de validación, cambia UsuarioManager.
- Si el formato del email pasa a HTML, cambia UsuarioManager.
- Si se agrega SMS, cambia UsuarioManager.

## Por qué este diseño escala mejor
No escala mejor. Cada nueva regla o canal agrega código en la misma clase,
creando un punto único de fallo y mantenimiento.



