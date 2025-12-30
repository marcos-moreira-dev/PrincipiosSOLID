# ISP - Ejemplo 01 (good) - Interfaces pequenas para roles

## Escenario (antes del codigo)
Se separan interfaces por tipo de tarea: trabajar, reportar, mantener, etc.
Cada rol implementa solo lo que necesita.

## Como ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: orquesta.
- Trabajador/Comedor/Reportable/Mantenible: contratos pequenos.
- Desarrollador.java y Becario.java: implementan lo necesario.

## Despues del codigo (explicacion por bloques)
- Becario no implementa Mantenible porque no repara maquinas.
- Desarrollador implementa los contratos que necesita.
- Main usa interfaces concretas segun el contexto.

## Que huele mal
- No hay olor fuerte. Las interfaces son especificas.

## Que cambiaria si el requisito cambia
- Nuevo rol: implementa solo las interfaces que necesita.
- Nueva tarea: nueva interfaz sin afectar a todos.

## Por que este diseno escala mejor
Escala mejor porque cada clase depende solo de lo que usa.
