# LSP - Ejemplo 02 (bad) - Cuenta limitada que rompe contrato

## Escenario (antes del código)
Una cuenta bancaria permite retirar hasta el saldo. Una subclase agrega
un límite diario, pero en lugar de devolver "false", lanza una excepción.
El cliente espera un contrato simple y ahora debe manejar casos inesperados.

## Cómo ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: ejecuta el pago.
- CuentaBancaria.java: contrato base (boolean).
- CuentaLimitada.java: rompe el contrato con excepción.
- ProcesadorPago.java: cliente que asume el contrato.

## Después del código (explicación por bloques)
- CuentaBancaria.retirar devuelve boolean.
- CuentaLimitada.retirar ahora lanza excepción si supera límite.
- ProcesadorPago no espera excepciones y falla.

## Qué huele mal
- Subclase introduce un nuevo comportamiento no previsto.
- Cliente debe conocer detalles de la subclase.

## Qué cambiaria si el requisito cambia
- Si aparecen más limites, el cliente debe manejar más excepciones.
- Si el contrato cambia, hay que tocar varios clientes.

## Por qué este diseño escala mejor
No escala mejor. La herencia introduce sorpresas y rompe la substitucion.



