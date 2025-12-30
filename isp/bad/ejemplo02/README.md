# ISP - Ejemplo 02 (bad) - Device con print/scan/fax

## Escenario (antes del codigo)
Se define una interfaz Device con imprimir, escanear y fax. Una impresora
simple no soporta escaneo ni fax, pero igual debe implementar los metodos.

## Como ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: orquesta.
- Device.java: interfaz grande.
- ImpresoraSimple.java: implementacion incompleta.
- Multifuncion.java: implementacion completa.

## Despues del codigo (explicacion por bloques)
- ImpresoraSimple llena metodos con mensajes de "no soportado".
- El cliente no puede confiar en que Device haga todo.

## Que huele mal
- Metodos no soportados en tiempo de ejecucion.
- Interfaz demasiado amplia para algunos dispositivos.

## Que cambiaria si el requisito cambia
- Nuevo metodo en Device obliga a todas las clases.
- Mas tipos de dispositivos generan mas excepciones.

## Por que este diseno escala mejor
No escala mejor. La interfaz crece y cada implementacion sufre.
