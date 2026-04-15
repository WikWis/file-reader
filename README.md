# File Reading Library
Prosta biblioteka do odczytu, zapisu.

---
## Struktura projektu
- `file.reader`
    - `BasicFileReader` – podstawowy odczyt obiektów
    - `ObjectFileReader` – odczyt obiektów
    - `ObjectReaderException` – wyjątki dla odczytu

- `file.writer`
    - `BasicFileWriter` – podstawowy zapis obiektów
    - `ObjectFileWriter` – zapis obiektów
    - `ObjectWriterException` – wyjątki dla zapisu

- `file.line.serializer`
    - `LineSerializer` – serializacja do formatu liniowego
    - `LineSerializerException` – wyjątki serializacji

- `file.line.deserializer`
    - `LineDeserializer` – deserializacja z formatu liniowego
    - `LineDeserializerException` – wyjątki deserializacji
---

## Użycie

Dla projektów używających Maven:

Do pliku `pom.xml` projektu dodać:

```xml
<repositories>
  <repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
  </repository>
</repositories>
```

```xml
<dependency>
  <groupId>com.github.WikWis</groupId>
  <artifactId>file-reader</artifactId>
  <version>1.0.0</version>
</dependency>
```