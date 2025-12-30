# OCP - Open/Closed Principle

OCP dice que una entidad debe estar abierta para extensión,
pero cerrada para modificación. Es decir: agregar funcionalidad
sin tocar el código existente.

analogía: una toma de corriente permite conectar nuevos aparatos
sin reescribir la instalación eléctrica.

## Señales de violación
- if/else o switch por tipo en muchos lugares.
- Cada nuevo caso obliga a modificar la clase central.
- Los cambios se dispersan en archivos muy usados.

## Checklist rápido
- Para agregar un nuevo caso, tengo que editar una clase central?
- Puedo agregar comportamiento creando una nueva clase?
- El flujo principal depende de una interfaz?

## Ejemplos
- Bad 01: `ocp/bad/ejemplo01/README.md`
- Good 01: `ocp/good/ejemplo01/README.md`
- Bad 02: `ocp/bad/ejemplo02/README.md`
- Good 02: `ocp/good/ejemplo02/README.md`
- Bad 03: `ocp/bad/ejemplo03/README.md`
- Good 03: `ocp/good/ejemplo03/README.md`



