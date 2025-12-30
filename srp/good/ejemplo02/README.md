# SRP - Ejemplo 02 (good) - Usuario con responsabilidades separadas

## Escenario (antes del codigo)
El registro de usuarios ahora tiene piezas independientes: validar, formatear
y notificar. Cada pieza tiene su propio motivo de cambio. Esto evita que
una modificacion de formato afecte la logica de validacion.

## Como ejecutar
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

## Despues del codigo (explicacion por bloques)
- ValidadorUsuario se concentra en reglas; no sabe nada de emails.
- FormateadorUsuario produce un mensaje, sin conocer a quien se envia.
- ServicioEmail solo envia lo que recibe, sin logica de negocio.
- Main coordina los pasos, pero no los mezcla.

## Que huele mal
- No hay olor fuerte. Las responsabilidades estan separadas.
- Si aparece acoplamiento, se detecta facilmente porque rompe la separacion.

## Que cambiaria si el requisito cambia
- Nueva validacion: cambia ValidadorUsuario.
- Nuevo formato: cambia FormateadorUsuario.
- Nuevo canal: aparece un nuevo servicio, sin tocar los otros.

## Por que este diseno escala mejor
Escala mejor porque cada cambio se limita a una clase y los tests se pueden
escribir en unidades pequenas y aisladas.
