# ISP - Ejemplo 02 (good) - Dispositivos con contratos separados

## Escenario (antes del código)
Se separan las capacidades de imprimir, escanear y fax. Cada dispositivo
implementa solo lo que realmente soporta.

## Cómo ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: orquesta.
- Imprimible/Escaneable/Faxable: contratos pequeños.
- ImpresoraSimple.java: solo imprime.
- Multifuncion.java: imprime, escanea y envía fax.

## Después del código (explicación por bloques)
- ImpresoraSimple no tiene métodos que no usa.
- Multifuncion implementa todos los contratos.
- Main utiliza interfaces adecuadas segun la necesidad.

## Qué huele mal
- No hay olor fuerte; no hay métodos "no soportados".

## Qué cambiaria si el requisito cambia
- Nuevo dispositivo solo implementa sus capacidades.
- Nuevo método de fax no afecta impresoras simples.

## Por qué este diseño escala mejor
Escala mejor porque cada clase depende solo de contratos necesarios.



