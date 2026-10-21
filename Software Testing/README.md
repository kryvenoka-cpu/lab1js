# Практическая №1 — JUnit (Difference / LeetCode 1281)

## Куда положить файлы (обычный Maven-проект)

```
src/main/java/ua/edu/kibit/Difference.java      <- Difference.java
src/test/java/ua/edu/kibit/DifferenceTest.java  <- DifferenceTest.java
src/test/resources/difference.csv               <- difference.csv
```

Важно: csv-файл должен лежать именно в `src/test/resources`,
потому что `@CsvFileSource(resources = "/difference.csv")` ищет его в classpath.

## Зависимость в pom.xml (JUnit 5)

```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.10.2</version>
    <scope>test</scope>
</dependency>
```

## Запуск тестов

```
mvn test
```

или зелёной стрелкой возле класса DifferenceTest в IntelliJ IDEA.

## Что покрывают тесты (строки из difference.csv)

| number | expected | почему                                    |
|--------|----------|-------------------------------------------|
| 0      | -1       | number < 1 — вне диапазона                |
| -5     | -1       | number < 1 — вне диапазона                |
| 100001 | -1       | number > 100000 — вне диапазона           |
| 1      | 0        | product 1, sum 1 -> 1 - 1 = 0             |
| 234    | 15       | product 2*3*4=24, sum 2+3+4=9 -> 24-9=15  |
| 4421   | 21       | product 4*4*2*1=32, sum 4+4+2+1=11 -> 21  |

После того как тесты проходят — закоммитить в папку `testing`
своего kibit-репозитория и приложить ссылку при сдаче.
