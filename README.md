# Principios SOLID (Java desnudo)

Este repo es un recordatorio educativo: ejemplos pequenos, ejecutables y en Java puro.
No hay frameworks, no hay Maven/Gradle. Solo `javac` y `java`.

## Indice
- SRP (Single Responsibility Principle): `srp/README.md`
- OCP (Open/Closed Principle): `ocp/README.md`
- LSP (Liskov Substitution Principle): `lsp/README.md`
- ISP (Interface Segregation Principle): `isp/README.md`
- DIP (Dependency Inversion Principle): `dip/README.md`

## Como ejecutar un ejemplo
Entra a cualquier ejemplo y compila:

```bash
cd srp/bad/ejemplo01
javac Main.java
java Main
```

## Como compilar cualquier ejemplo (copiar y pegar)
Reemplaza la ruta por el ejemplo que quieras:

```bash
cd "<PRINCIPIO>/<bad|good>/ejemploXX"
javac Main.java
java Main
```

Ejemplos listos para copiar:

```bash
cd "srp/good/ejemplo02"
javac Main.java
java Main
```

```bash
cd "ocp/bad/ejemplo03"
javac Main.java
java Main
```

## Como generar Javadoc (copiar y pegar)
Desde la raiz del repo:

```powershell
Get-ChildItem -Recurse -Filter *.java | ForEach-Object { $_.FullName } | Set-Content sources.txt
javadoc -d docs -encoding UTF-8 -charset UTF-8 "@sources.txt"
```

Salida: `docs/index.html`

Cada ejemplo es autocontenido: todas las clases estan en el mismo directorio
y sin packages, para que la compilacion sea simple.

## Filosofia del repo
- Primero ves el "bad": muestra el problema de diseno.
- Luego ves el "good": muestra el refactor que aplica el principio.
- Cada ejemplo imprime en consola para evidenciar el problema o la mejora.

## Tips para estudiar SOLID
- Lee el README del principio antes de leer el codigo.
- Ejecuta el ejemplo bad y observa la salida.
- Ejecuta el ejemplo good y compara el flujo.
- Modifica un requisito y mira cuantas clases tocas: eso revela acoplamiento.
- Usa los ejemplos como plantillas para pensar problemas reales.
