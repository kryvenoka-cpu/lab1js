package ua.edu.kibit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DifferenceTest {

    private final Difference difference = new Difference();

    /**
     * Параметризованный тест: каждая строка из файла difference.csv
     * (лежит в src/test/resources) подставляется в метод как пара
     * (number, expected).
     *
     * Имя теста в стиле when/then + name = "...": в отчёте JUnit
     * каждая строка csv отобразится как "number = X -> expected Y".
     */
    @ParameterizedTest(name = "number = {0} -> expected {1}")
    @CsvFileSource(resources = "/difference.csv", numLinesToSkip = 1)
    void givenNumber_whenSubtractProductAndSum_thenReturnExpected(int number, int expected) {
        assertEquals(expected, difference.subtractProductAndSum(number));
    }
}
