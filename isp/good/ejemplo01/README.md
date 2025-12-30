# ISP - Ejemplo 01 (good) - Interfaces pequeñas para roles

## Escenario (antes del código)
Se separan interfaces por tipo de tarea: trabajar, reportar, mantener, etc.
Cada rol implementa solo lo que necesita.

## Cómo ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: orquesta.
- Trabajador/Comedor/Reportable/Mantenible: contratos pequeños.
- Desarrollador.java y Becario.java: implementan lo necesario.

## Después del código (explicación por bloques)
- Becario no implementa Mantenible porque no repara maquinas.
- Desarrollador implementa los contratos que necesita.
- Main usa interfaces concretas segun el contexto.

## Qué huele mal
- No hay olor fuerte. Las interfaces son específicas.

## Qué cambiaria si el requisito cambia
- Nuevo rol: implementa solo las interfaces que necesita.
- Nueva tarea: nueva interfaz sin afectar a todos.

## Por qué este diseño escala mejor
Escala mejor porque cada clase depende solo de lo que usa.



