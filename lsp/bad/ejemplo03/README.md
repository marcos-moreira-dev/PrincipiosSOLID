# LSP - Ejemplo 03 (bad) - Impresora basica hereda multifuncion

## Escenario (antes del codigo)
Una oficina usa una clase base "ImpresoraMultifuncion" con imprimir y escanear.
Para una impresora basica, alguien hereda y lanza excepcion en escanear.
El cliente cree que siempre puede escanear y falla.

## Como ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: prueba ambas impresoras.
- ImpresoraMultifuncion.java: contrato base.
- ImpresoraBasica.java: rompe el contrato.
- ClienteOficina.java: usa el contrato base.

## Despues del codigo (explicacion por bloques)
- El cliente depende de la clase base y llama escanear sin dudar.
- ImpresoraBasica no cumple el contrato y lanza excepcion.
- La sustitucion falla en tiempo de ejecucion.

## Que huele mal
- Subclase que "no puede" hacer lo que la base promete.
- Cliente debe conocer el tipo real para evitar fallos.

## Que cambiaria si el requisito cambia
- Nuevas impresoras simples agregan mas excepciones.
- El cliente se llena de if/else por tipo.

## Por que este diseno escala mejor
No escala mejor. El contrato base es demasiado fuerte y la herencia es inapropiada.
