# DIP - Ejemplo 01 (bad) - Servicio crea el DAO concreto

## Escenario (antes del código)
Un servicio de usuarios instancia directamente un DAO concreto.
Si se cambia de base de datos, el servicio debe modificarse.

## Cómo ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: orquesta.
- ServicioUsuarios.java: depende de clase concreta.
- MySqlUsuarioDao.java: implementación concreta.

## Después del código (explicación por bloques)
- ServicioUsuarios crea MySqlUsuarioDao con new.
- El servicio queda atado a una tecnologia especifica.
- Main no puede cambiar esa dependencia sin editar el servicio.

## Qué huele mal
- Dependencia directa de bajo nivel.
- difícil de probar y de reemplazar.

## Qué cambiaria si el requisito cambia
- Cambio a PostgreSQL: cambiar ServicioUsuarios.
- Cambios de almacenamiento: tocar varios servicios.

## Por qué este diseño escala mejor
No escala mejor. El alto nivel queda atado a decisiones de bajo nivel.



