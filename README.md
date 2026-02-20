# Práctica Pilas + Maven

## Como instale la librería en repositorio local

Use este comando en data-structure.stack

```bash
cd umg.edu.gt.data-structure.stack
mvn clean install
```

Esto segun lo que investigue para compilar la librería y la instalara en `~/.m2/repository` como usted comento en la clase, para que `stackHandler` pueda consumirla como dependencia Maven.

<details><summary>Prueba de install</summary>

  ![Prueba de install](Evidencias/Prueba%20de%20install.png)

</details>

---

## Compilar y ejecutar stackHandler

Una vez instale la librería, entra a la carpeta del stackHandler y compile el siguiente comando:

```bash
cd stackHandler
mvn clean package
```

Ejecuta el JAR generado:

```bash
java -jar target/stackHandler-0.0.1-SNAPSHOT-fat.jar
```

Para probar con una expresión personalizada como argumento:

```bash
java -jar target/stackHandler-0.0.1-SNAPSHOT-fat.jar "(a+b)"
```

<details><summary>Prueba de regresion</summary>

  ![Prueba de regresion](Evidencias/Prueba%20de%20regresion.png)

</details>
