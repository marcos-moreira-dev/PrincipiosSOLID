# ISP - Interface Segregation Principle

ISP dice que no se debe obligar a un cliente a depender de metodos
que no usa. Es mejor tener interfaces pequenas y especificas.

Analogia: un control remoto enorme con botones que nunca usas es peor
que un control pequeno con lo esencial para ti.

## Senales de violacion
- Interfaces gigantes con muchos metodos.
- Implementaciones vacias o que lanzan excepciones.
- Clases que "fingen" soportar funciones.

## Checklist rapido
- Esta interfaz tiene metodos no usados por algun cliente?
- Podria dividirse en contratos mas pequenos?
- Implementaciones que devuelven "no aplica"?

## Ejemplos
- Bad 01: `isp/bad/ejemplo01/README.md`
- Good 01: `isp/good/ejemplo01/README.md`
- Bad 02: `isp/bad/ejemplo02/README.md`
- Good 02: `isp/good/ejemplo02/README.md`
- Bad 03: `isp/bad/ejemplo03/README.md`
- Good 03: `isp/good/ejemplo03/README.md`
