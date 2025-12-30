# LSP - Ejemplo 03 (good) - Contratos separados en impresoras

## Escenario (antes del código)
En lugar de heredar una clase que promete escaneo, se separa el contrato.
La impresora básica solo implementa imprimir y no finge escanear.

## Cómo ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: orquesta.
- Imprimible.java y Escaneable.java: contratos separados.
- ImpresoraBasica.java: solo imprime.
- ImpresoraMultifuncion.java: imprime y escanea.
- ClienteOficina.java: usa el contrato correcto.

## Después del código (explicación por bloques)
- ClienteOficina recibe un Imprimible para imprimir.
- Si necesita escanear, recibe un Escaneable adicional.
- Ninguna clase rompe el contrato ni lanza excepciones inesperadas.

## Qué huele mal
- No hay olor fuerte. No se fuerza herencia peligrosa.

## Qué cambiaria si el requisito cambia
- Nueva impresora con fax: se agregan interfaces y clases sin romper clientes.
- Cambios en escaneo: afectan solo a los escaneables.

## Por qué este diseño escala mejor
Escala mejor porque los contratos son precisos y las sustituciones son seguras.



