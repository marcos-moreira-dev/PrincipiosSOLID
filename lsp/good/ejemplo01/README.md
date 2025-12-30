# LSP - Ejemplo 01 (good) - Rectangulo y Cuadrado sin herencia incorrecta

## Escenario (antes del codigo)
En lugar de heredar, Rectangulo y Cuadrado comparten un contrato comun:
calcular area. No se fuerza una relacion padre-hijo que rompa expectativas.

## Como ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: orquesta.
- Forma.java: contrato.
- Rectangulo.java y Cuadrado.java: implementaciones independientes.

## Despues del codigo (explicacion por bloques)
- Forma define area, sin suposiciones de setters.
- Rectangulo y Cuadrado implementan su formula sin heredar comportamientos.
- Main usa Forma y nunca sufre efectos inesperados.

## Que huele mal
- No hay olor fuerte; no existe herencia peligrosa.

## Que cambiaria si el requisito cambia
- Si aparece un Rombo, se agrega otra clase con area.
- Si cambia la formula, solo cambia su clase.

## Por que este diseno escala mejor
Escala mejor porque se evita una jerarquia equivocada y el contrato se respeta.
