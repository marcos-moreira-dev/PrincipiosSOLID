# SRP - Ejemplo 02 (good) - Usuario con responsabilidades separadas

## Escenario (antes del código)
El registro de usuarios ahora tiene piezas independientes: validar, formatear
y notificar. Cada pieza tiene su propio motivo de cambio. Esto evita que
una modificación de formato afecte la lógica de validación.

## Cómo ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: orquesta el flujo.
- Usuario.java: datos.
- ValidadorUsuario.java: reglas de negocio.
- FormateadorUsuario.java: presentacion.
- ServicioEmail.java: envio.

## Después del código (explicación por bloques)
- ValidadorUsuario se concentra en reglas; no sabe nada de emails.
- FormateadorUsuario produce un mensaje, sin conocer a quien se envía.
- ServicioEmail solo envía lo que recibe, sin lógica de negocio.
- Main coordina los pasos, pero no los mezcla.

## Qué huele mal
- No hay olor fuerte. Las responsabilidades están separadas.
- Si aparece acoplamiento, se detecta facilmente porque rompe la separacion.

## Qué cambiaria si el requisito cambia
- Nueva validación: cambia ValidadorUsuario.
- Nuevo formato: cambia FormateadorUsuario.
- Nuevo canal: aparece un nuevo servicio, sin tocar los otros.

## Por qué este diseño escala mejor
Escala mejor porque cada cambio se limita a una clase y los tests se pueden
escribir en unidades pequeñas y aisladas.



