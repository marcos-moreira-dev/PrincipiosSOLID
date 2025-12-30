# DIP - Ejemplo 01 (good) - Servicio depende de interfaz DAO

## Escenario (antes del codigo)
El servicio de usuarios depende de la abstraccion UsuarioDao.
La implementacion concreta se inyecta desde afuera, lo que facilita cambios.

## Como ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: orquesta e inyecta la dependencia.
- UsuarioDao.java: interfaz.
- MySqlUsuarioDao.java: implementacion concreta.
- ServicioUsuarios.java: depende de la interfaz.

## Despues del codigo (explicacion por bloques)
- ServicioUsuarios recibe UsuarioDao por constructor.
- Main decide que implementacion usar.
- El servicio no cambia si cambia la base de datos.

## Que huele mal
- No hay olor fuerte. La dependencia apunta a una abstraccion.

## Que cambiaria si el requisito cambia
- Nueva base de datos: crear otro UsuarioDao.
- Pruebas: usar un fake sin tocar el servicio.

## Por que este diseno escala mejor
Escala mejor porque el alto nivel no se acopla a detalles de bajo nivel.
