# ISP - Ejemplo 02 (bad) - Device con print/scan/fax

## Escenario (antes del código)
Se define una interfaz Device con imprimir, escanear y fax. Una impresora
simple no soporta escaneo ni fax, pero igual debe implementar los métodos.

## Cómo ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: orquesta.
- Device.java: interfaz grande.
- ImpresoraSimple.java: implementación incompleta.
- Multifuncion.java: implementación completa.

## Después del código (explicación por bloques)
- ImpresoraSimple llena métodos con mensajes de "no soportado".
- El cliente no puede confiar en que Device haga todo.

## Qué huele mal
- métodos no soportados en tiempo de ejecucion.
- Interfaz demasiado amplia para algúnos dispositivos.

## Qué cambiaria si el requisito cambia
- Nuevo método en Device obliga a todas las clases.
- más tipos de dispositivos generan más excepciones.

## Por qué este diseño escala mejor
No escala mejor. La interfaz crece y cada implementación sufre.



