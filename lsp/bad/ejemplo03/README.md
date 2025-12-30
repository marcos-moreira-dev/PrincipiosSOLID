# LSP - Ejemplo 03 (bad) - Impresora básica hereda multifuncion

## Escenario (antes del código)
Una oficina usa una clase base "ImpresoraMultifuncion" con imprimir y escanear.
Para una impresora básica, alguien hereda y lanza excepción en escanear.
El cliente cree que siempre puede escanear y falla.

## Cómo ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: prueba ambas impresoras.
- ImpresoraMultifuncion.java: contrato base.
- ImpresoraBasica.java: rompe el contrato.
- ClienteOficina.java: usa el contrato base.

## Después del código (explicación por bloques)
- El cliente depende de la clase base y llama escanear sin dudar.
- ImpresoraBasica no cumple el contrato y lanza excepción.
- La sustitucion falla en tiempo de ejecucion.

## Qué huele mal
- Subclase que "no puede" hacer lo que la base promete.
- Cliente debe conocer el tipo real para evitar fallos.

## Qué cambiaria si el requisito cambia
- Nuevas impresoras simples agregan más excepciones.
- El cliente se llena de if/else por tipo.

## Por qué este diseño escala mejor
No escala mejor. El contrato base es demasiado fuerte y la herencia es inapropiada.



