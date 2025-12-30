# LSP - Ejemplo 02 (good) - Contrato coherente en cuentas

## Escenario (antes del codigo)
El contrato ahora define que retirar devuelve boolean y nunca lanza excepciones.
La cuenta limitada aplica su regla, pero respeta el contrato.

## Como ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: orquesta.
- CuentaRetirable.java: contrato estable.
- CuentaBancaria.java: implementacion base.
- CuentaLimitada.java: implementacion con limites.
- ProcesadorPago.java: cliente estable.

## Despues del codigo (explicacion por bloques)
- CuentaRetirable define retirar como boolean sin excepciones inesperadas.
- CuentaLimitada devuelve false si no puede retirar.
- ProcesadorPago maneja el resultado sin conocer la clase concreta.

## Que huele mal
- No hay olor fuerte; el contrato es consistente.

## Que cambiaria si el requisito cambia
- Nuevo tipo de cuenta: implementar la interfaz.
- Nuevo limite: solo cambia CuentaLimitada.

## Por que este diseno escala mejor
Escala mejor porque los clientes no necesitan conocer detalles internos.
