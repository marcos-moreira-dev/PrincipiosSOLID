# ISP - Ejemplo 03 (good) - Repositorios por capacidades

## Escenario (antes del código)
El módulo de reportes solo necesita lectura, así que se le entrega
una interfaz pequeña. Otras partes pueden usar interfaces de escritura o busqueda.

## Cómo ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: orquesta.
- RepositorioLectura/Escritura/Busqueda/Exportacion: contratos.
- ReporteSoloLectura.java: implementación concreta de lectura.

## Después del código (explicación por bloques)
- ReporteSoloLectura solo implementa lo que realmente necesita.
- El cliente de lectura no depende de guardar, borrar o exportar.
- Se reduce el acoplamiento y los métodos innecesarios.

## Qué huele mal
- No hay olor fuerte; el contrato es especifico y claro.

## Qué cambiaria si el requisito cambia
- Nueva capacidad: nueva interfaz para quien la necesite.
- Cambios en lectura: afectan solo a la interfaz de lectura.

## Por qué este diseño escala mejor
Escala mejor porque cada cliente depende solo de lo que usa.



