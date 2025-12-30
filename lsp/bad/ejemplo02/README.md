# LSP - Ejemplo 02 (bad) - Cuenta limitada que rompe contrato

## Escenario (antes del codigo)
Una cuenta bancaria permite retirar hasta el saldo. Una subclase agrega
un limite diario, pero en lugar de devolver "false", lanza una excepcion.
El cliente espera un contrato simple y ahora debe manejar casos inesperados.

## Como ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: ejecuta el pago.
- CuentaBancaria.java: contrato base (boolean).
- CuentaLimitada.java: rompe el contrato con excepcion.
- ProcesadorPago.java: cliente que asume el contrato.

## Despues del codigo (explicacion por bloques)
- CuentaBancaria.retirar devuelve boolean.
- CuentaLimitada.retirar ahora lanza excepcion si supera limite.
- ProcesadorPago no espera excepciones y falla.

## Que huele mal
- Subclase introduce un nuevo comportamiento no previsto.
- Cliente debe conocer detalles de la subclase.

## Que cambiaria si el requisito cambia
- Si aparecen mas limites, el cliente debe manejar mas excepciones.
- Si el contrato cambia, hay que tocar varios clientes.

## Por que este diseno escala mejor
No escala mejor. La herencia introduce sorpresas y rompe la substitucion.
