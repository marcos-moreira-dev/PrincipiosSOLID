# LSP - Ejemplo 02 (good) - Contrato coherente en cuentas

## Escenario (antes del código)
El contrato ahora define que retirar devuelve boolean y nunca lanza excepciones.
La cuenta limitada aplica su regla, pero respeta el contrato.

## Cómo ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: orquesta.
- CuentaRetirable.java: contrato estable.
- CuentaBancaria.java: implementación base.
- CuentaLimitada.java: implementación con limites.
- ProcesadorPago.java: cliente estable.

## Después del código (explicación por bloques)
- CuentaRetirable define retirar como boolean sin excepciones inesperadas.
- CuentaLimitada devuelve false si no puede retirar.
- ProcesadorPago maneja el resultado sin conocer la clase concreta.

## Qué huele mal
- No hay olor fuerte; el contrato es consistente.

## Qué cambiaria si el requisito cambia
- Nuevo tipo de cuenta: implementar la interfaz.
- Nuevo límite: solo cambia CuentaLimitada.

## Por qué este diseño escala mejor
Escala mejor porque los clientes no necesitan conocer detalles internos.



