package week2.task5;

/**
 * Напишіть застосування, що виконує пошук заданого числа у відсортованому масиві — бінарний пошук
 *
 * У випадку коли число знайдено виведіть на екран його позицію в масиві (позиції нумеруємо з нуля) або -1 в іншому випадку
 */
public class BinarySearch {
    public static void main(String[] args) {

        int data[] = {3, 6, 7, 10, 34, 56, 60};
        int numberToFind = 10;

        // PUT YOUR CODE HERE
        int lower = 0;
        int upper = data.length - 1;

        while (lower <= upper) {

            int middle = (upper + lower) / 2;

            if (data[middle] == numberToFind) {
                System.out.println(middle);
                break;
            } else if (data[middle] < numberToFind) {
                lower = middle + 1;
            } else if (data[middle] > numberToFind) {
                upper = middle - 1;
            }
        }
        // PUT YOUR CODE HERE
        if (lower > upper) {
            System.out.println(-1);
        }
    }
}
