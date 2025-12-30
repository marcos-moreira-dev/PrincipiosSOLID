# LSP - Ejemplo 01 (good) - Rectangulo y Cuadrado sin herencia incorrecta

## Escenario (antes del código)
En lugar de heredar, Rectangulo y Cuadrado comparten un contrato común:
calcular área. No se fuerza una relación padre-hijo que rompa expectativas.

## Cómo ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: orquesta.
- Forma.java: contrato.
- Rectangulo.java y Cuadrado.java: implementaciones independientes.

## Después del código (explicación por bloques)
- Forma define área, sin suposiciones de setters.
- Rectangulo y Cuadrado implementan su fórmula sin heredar comportamientos.
- Main usa Forma y nunca sufre efectos inesperados.

## Qué huele mal
- No hay olor fuerte; no existe herencia peligrosa.

## Qué cambiaria si el requisito cambia
- Si aparece un Rombo, se agrega otra clase con área.
- Si cambia la fórmula, solo cambia su clase.

## Por qué este diseño escala mejor
Escala mejor porque se evita una jerarquia equivocada y el contrato se respeta.



