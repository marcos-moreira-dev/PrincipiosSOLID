# ISP - Ejemplo 02 (good) - Dispositivos con contratos separados

## Escenario (antes del codigo)
Se separan las capacidades de imprimir, escanear y fax. Cada dispositivo
implementa solo lo que realmente soporta.

## Como ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: orquesta.
- Imprimible/Escaneable/Faxable: contratos pequenos.
- ImpresoraSimple.java: solo imprime.
- Multifuncion.java: imprime, escanea y envia fax.

## Despues del codigo (explicacion por bloques)
- ImpresoraSimple no tiene metodos que no usa.
- Multifuncion implementa todos los contratos.
- Main utiliza interfaces adecuadas segun la necesidad.

## Que huele mal
- No hay olor fuerte; no hay metodos "no soportados".

## Que cambiaria si el requisito cambia
- Nuevo dispositivo solo implementa sus capacidades.
- Nuevo metodo de fax no afecta impresoras simples.

## Por que este diseno escala mejor
Escala mejor porque cada clase depende solo de contratos necesarios.
