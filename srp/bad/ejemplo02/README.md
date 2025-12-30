# SRP - Ejemplo 02 (bad) - Usuario con validacion, formateo y email

## Escenario (antes del codigo)
Un sistema de registro de usuarios crece rapido. Alguien decide poner
validacion, formateo del mensaje y envio de email en la misma clase.
Funciona para el primer mes, pero luego llegan nuevos requisitos: otra politica
de validacion, email con plantilla, y un nuevo canal de notificacion.

## Como ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: orquesta el registro.
- UsuarioManager.java: valida, formatea y envia email.
- Usuario.java: datos basicos del usuario.

## Despues del codigo (explicacion por bloques)
- UsuarioManager tiene tres responsabilidades distintas:
  validacion (reglas de negocio), presentacion (formato del mensaje)
  e infraestructura (envio de email).
- registrar combina todo en un solo flujo rigido.
- Main solo delega, pero queda acoplado a una clase "Dios".

## Que huele mal
- Muchas razones de cambio en una sola clase.
- Dificil reutilizar solo la validacion o solo el formateo.
- Tests unitarios mezclan reglas con efectos secundarios (email).

## Que cambiaria si el requisito cambia
- Si cambia la politica de validacion, cambia UsuarioManager.
- Si el formato del email pasa a HTML, cambia UsuarioManager.
- Si se agrega SMS, cambia UsuarioManager.

## Por que este diseno escala mejor
No escala mejor. Cada nueva regla o canal agrega codigo en la misma clase,
creando un punto unico de fallo y mantenimiento.
