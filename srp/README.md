# SRP - Single Responsibility Principle

SRP dice que una clase debe tener una sola razon para cambiar.
En otras palabras: un modulo debe tener una unica responsabilidad clara.

Analogia simple: en una cocina, quien cocina no deberia tambien llevar la contabilidad.
Si mezclas responsabilidades, cualquier cambio en una obliga a cambiar la otra.

## Senales de violacion
- La clase hace "de todo": calcula, formatea, guarda, envia.
- Tiene muchas dependencias y muchos metodos heterogeneos.
- Cambios de formatos o de reglas de negocio impactan la misma clase.

## Checklist rapido
- Esta clase tiene una responsabilidad unica y clara?
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
