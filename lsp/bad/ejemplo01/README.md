# LSP - Ejemplo 01 (bad) - Rectangulo y Cuadrado

## Escenario (antes del código)
El ejemplo clásico: un Cuadrado hereda de Rectangulo.
La clase base permite setear ancho y alto por separado.
El Cuadrado rompe esa expectativa al obligar ambos valores a ser iguales.

## Cómo ejecutar
```bash
javac Main.java
java Main
```

## Archivos
- Main.java: prueba el comportamiento esperado.
- Rectangulo.java: clase base.
- Cuadrado.java: subclase que cambia el contrato.

## Después del código (explicación por bloques)
- Rectangulo permite setAncho y setAlto independientes.
- Cuadrado sobrescribe y fuerza ambos lados iguales.
- Main espera área = ancho * alto. Con Cuadrado, eso falla.

## Qué huele mal
- Subclase cambia el significado de métodos base.
- El cliente obtiene resultados inesperados.

## Qué cambiaria si el requisito cambia
- Si agregas validaciones en Rectangulo, el Cuadrado puede romperse más.
- Si el cliente asume independencia de lados, falla.

## Por qué este diseño escala mejor
No escala mejor. La herencia es incorrecta y genera comportamientos sorpresivos.



