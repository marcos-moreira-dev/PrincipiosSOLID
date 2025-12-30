# DIP - Dependency Inversion Principle

DIP dice que los modulos de alto nivel no deben depender de
modulos de bajo nivel, sino de abstracciones.

Analogia: un enchufe no depende de una marca de electrodomestico,
depende de un estandar de conexion.

## Senales de violacion
- new de clases concretas dentro de servicios de alto nivel.
- Dificil cambiar implementaciones sin editar el servicio.
- Tests complicados por dependencias rigidas.

## Checklist rapido
- El servicio depende de una interfaz?
- Puedo cambiar la implementacion sin modificar el servicio?
- Puedo hacer un fake o mock sin tocar el codigo?

## Ejemplos
- Bad 01: `dip/bad/ejemplo01/README.md`
- Good 01: `dip/good/ejemplo01/README.md`
- Bad 02: `dip/bad/ejemplo02/README.md`
- Good 02: `dip/good/ejemplo02/README.md`
- Bad 03: `dip/bad/ejemplo03/README.md`
- Good 03: `dip/good/ejemplo03/README.md`
