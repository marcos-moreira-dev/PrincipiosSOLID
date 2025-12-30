# LSP - Ejemplo 01 (bad) - Rectangulo y Cuadrado

## Escenario (antes del codigo)
El ejemplo clasico: un Cuadrado hereda de Rectangulo.
La clase base permite setear ancho y alto por separado.
El Cuadrado rompe esa expectativa al obligar ambos valores a ser iguales.

## Como ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: prueba el comportamiento esperado.
- Rectangulo.java: clase base.
- Cuadrado.java: subclase que cambia el contrato.

## Despues del codigo (explicacion por bloques)
- Rectangulo permite setAncho y setAlto independientes.
- Cuadrado sobrescribe y fuerza ambos lados iguales.
- Main espera area = ancho * alto. Con Cuadrado, eso falla.

## Que huele mal
- Subclase cambia el significado de metodos base.
- El cliente obtiene resultados inesperados.

## Que cambiaria si el requisito cambia
- Si agregas validaciones en Rectangulo, el Cuadrado puede romperse mas.
- Si el cliente asume independencia de lados, falla.

## Por que este diseno escala mejor
No escala mejor. La herencia es incorrecta y genera comportamientos sorpresivos.
