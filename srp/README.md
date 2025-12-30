# SRP - Single Responsibility Principle

SRP dice que una clase debe tener una sola razón para cambiar.
En otras palabras: un módulo debe tener una única responsabilidad clara.

analogía simple: en una cocina, quien cocina no debería también llevar la contabilidad.
Si mezclas responsabilidades, cualquier cambio en una obliga a cambiar la otra.

## Señales de violación
- La clase hace "de todo": calcula, formatea, guarda, envía.
- Tiene muchas dependencias y muchos métodos heterogéneos.
- Cambios de formatos o de reglas de negocio impactan la misma clase.

## Checklist rápido
- Esta clase tiene una responsabilidad única y clara?
- Puedo describirla con una frase corta sin usar "y"?
- Si cambia el formato de salida, toco esta clase?
- Si cambia la persistencia, toco esta clase?

## Ejemplos
- Bad 01: `srp/bad/ejemplo01/README.md`
- Good 01: `srp/good/ejemplo01/README.md`
- Bad 02: `srp/bad/ejemplo02/README.md`
- Good 02: `srp/good/ejemplo02/README.md`
- Bad 03: `srp/bad/ejemplo03/README.md`
- Good 03: `srp/good/ejemplo03/README.md`



