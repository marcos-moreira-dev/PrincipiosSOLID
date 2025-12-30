# DIP - Dependency Inversion Principle

DIP dice que los módulos de alto nivel no deben depender de
módulos de bajo nivel, sino de abstracciones.

analogía: un enchufe no depende de una marca de electrodoméstico,
depende de un estándar de conexión.

## Señales de violación
- new de clases concretas dentro de servicios de alto nivel.
- difícil cambiar implementaciones sin editar el servicio.
- Tests complicados por dependencias rígidas.

## Checklist rápido
- El servicio depende de una interfaz?
- Puedo cambiar la implementación sin modificar el servicio?
- Puedo hacer un fake o mock sin tocar el código?

## Ejemplos
- Bad 01: `dip/bad/ejemplo01/README.md`
- Good 01: `dip/good/ejemplo01/README.md`
- Bad 02: `dip/bad/ejemplo02/README.md`
- Good 02: `dip/good/ejemplo02/README.md`
- Bad 03: `dip/bad/ejemplo03/README.md`
- Good 03: `dip/good/ejemplo03/README.md`



