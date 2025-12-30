# LSP - Liskov Substitution Principle

LSP dice que los objetos de una subclase deben poder reemplazar
a los de su clase base sin romper el comportamiento esperado.

Analogia: si una pieza dice "puede ser reemplazada por otra compatible",
la nueva pieza debe respetar el mismo contrato.

## Senales de violacion
- Subclases que lanzan excepciones inesperadas.
- Metodos que cambian el significado del contrato base.
- Clientes que hacen "if (instanceof)" para evitar subclases.

## Checklist rapido
- Puedo usar la subclase donde se espera la clase base?
- El contrato (pre/post condiciones) se mantiene?
- No aparecen comportamientos sorpresivos?

## Ejemplos
- Bad 01: `lsp/bad/ejemplo01/README.md`
- Good 01: `lsp/good/ejemplo01/README.md`
- Bad 02: `lsp/bad/ejemplo02/README.md`
- Good 02: `lsp/good/ejemplo02/README.md`
- Bad 03: `lsp/bad/ejemplo03/README.md`
- Good 03: `lsp/good/ejemplo03/README.md`
