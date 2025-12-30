# ISP - Interface Segregation Principle

ISP dice que no se debe obligar a un cliente a depender de métodos
que no usa. Es mejor tener interfaces pequeñas y específicas.

analogía: un control remoto enorme con botones que nunca usas es peor
que un control pequeño con lo esencial para ti.

## Señales de violación
- Interfaces gigantes con muchos métodos.
- Implementaciones vacías o que lanzan excepciones.
- Clases que "fingen" soportar funciones.

## Checklist rápido
- Esta interfaz tiene métodos no usados por algún cliente?
- Podría dividirse en contratos más pequeños?
- Implementaciones que devuelven "no aplica"?

## Ejemplos
- Bad 01: `isp/bad/ejemplo01/README.md`
- Good 01: `isp/good/ejemplo01/README.md`
- Bad 02: `isp/bad/ejemplo02/README.md`
- Good 02: `isp/good/ejemplo02/README.md`
- Bad 03: `isp/bad/ejemplo03/README.md`
- Good 03: `isp/good/ejemplo03/README.md`



