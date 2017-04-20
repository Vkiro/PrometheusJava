package week3.task3;

/**
 * Використовуючи рекурсію, виведіть на екран задане по порядковому номеру число Фібоначі.
 * Для вирішення завдання використовуйте шаблон:
 * Просимо врахувати деякі особливості перевірки завдань:
 * 1. Декларація package повинна залишатися незмінною (як у шаблоні),
 * зверніть на це увагу вставляючи Ваш код у вікно перевірки.
 * 2. Для перевірки використовуються (беруться до уваги) виключно методи з сигнатурою описаною в шаблоні.
 * 3. Кількість та зміст полів та/або методів відмінних від наведених в шаблоні не обмежена.
 * 4. В кожному класі повинен бути або конструктор за замовчанням або public безаргументний конструктор.
 */
public class Fibonacci {
    //Повертає число Фібоначчі за номером, нумерація почнеться з одиниці
    //якщо число не можливо вирахувати поверніть -1
    public long getNumber(int position) {
        if (position < 0) {
            return -1;
        } else {
            return fibonacciRecursion(position);
        }
    }

    private long fibonacciRecursion(int position) {
        if (position == 0 || position == 1) {
            return position;
        } else {
            return fibonacciRecursion(position - 1) + fibonacciRecursion(position - 2);
        }
    }

    private long fibonacci(int position) {
        if (position <= 0) {
            return -1;
        }
        if (position == 1 || position == 2) {
            return 1;
        }
        int first = 1;
        int second = 1;
        for (int i = 2; i < position; i++) {
            int tmp = first;
            first = second;
            second = tmp + second;
        }
        return second;
    }
}
