# ISP - Ejemplo 03 (good) - Repositorios por capacidades

## Escenario (antes del codigo)
El modulo de reportes solo necesita lectura, asi que se le entrega
una interfaz pequena. Otras partes pueden usar interfaces de escritura o busqueda.

## Como ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: orquesta.
- RepositorioLectura/Escritura/Busqueda/Exportacion: contratos.
- ReporteSoloLectura.java: implementacion concreta de lectura.

## Despues del codigo (explicacion por bloques)
- ReporteSoloLectura solo implementa lo que realmente necesita.
- El cliente de lectura no depende de guardar, borrar o exportar.
- Se reduce el acoplamiento y los metodos innecesarios.

## Que huele mal
- No hay olor fuerte; el contrato es especifico y claro.

## Que cambiaria si el requisito cambia
- Nueva capacidad: nueva interfaz para quien la necesite.
- Cambios en lectura: afectan solo a la interfaz de lectura.

## Por que este diseno escala mejor
Escala mejor porque cada cliente depende solo de lo que usa.
