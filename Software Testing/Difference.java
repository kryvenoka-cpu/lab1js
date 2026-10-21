package ua.edu.kibit;

public class Difference {

    /**
     * LeetCode 1281 — Subtract the Product and Sum of Digits of an Integer.
     *
     * По заданию практической:
     *  - если number < 1 или number > 100000 -> вернуть -1 (число вне допустимого диапазона)
     *  - иначе вернуть (произведение цифр числа) - (сумма цифр числа)
     *
     * Примеры:
     *  number = 1    -> product = 1,  sum = 1  -> 0
     *  number = 234  -> product = 24, sum = 9  -> 15
     *  number = 4421 -> product = 32, sum = 11 -> 21
     */
    public int subtractProductAndSum(int number) {
        // Проверка границ по условию задания
        if (number < 1 || number > 100000) {
            return -1;
        }

        int sum = 0;
        int product = 1;

        // Разбираем число по цифрам справа налево:
        // number % 10 — последняя цифра, number / 10 — отбрасываем её
        while (number > 0) {
            int digit = number % 10;
            number /= 10;

            sum += digit;
            product *= digit;
        }

        return product - sum;
    }
}
