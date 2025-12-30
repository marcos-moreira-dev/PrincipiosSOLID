# DIP - Ejemplo 01 (good) - Servicio depende de interfaz DAO

## Escenario (antes del código)
El servicio de usuarios depende de la abstraccion UsuarioDao.
La implementación concreta se inyecta desde afuera, lo que facilita cambios.

## Cómo ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: orquesta e inyecta la dependencia.
- UsuarioDao.java: interfaz.
- MySqlUsuarioDao.java: implementación concreta.
- ServicioUsuarios.java: depende de la interfaz.

## Después del código (explicación por bloques)
- ServicioUsuarios recibe UsuarioDao por constructor.
- Main decide que implementación usar.
- El servicio no cambia si cambia la base de datos.

## Qué huele mal
- No hay olor fuerte. La dependencia apunta a una abstraccion.

## Qué cambiaria si el requisito cambia
- Nueva base de datos: crear otro UsuarioDao.
- Pruebas: usar un fake sin tocar el servicio.

## Por qué este diseño escala mejor
Escala mejor porque el alto nivel no se acopla a detalles de bajo nivel.



