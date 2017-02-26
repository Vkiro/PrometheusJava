package week2.task4;

/**
 * Напишіть застосування для сортування масиву методом сортування Шелла (ShellSort). Завдання додаткове!
 */
public class ShellSort {

    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;

        //PUT YOUR CODE HERE
        for (int i = length / 2; i >= 1; i /= 2) {
            for (int j = i; j < length; j++) {
                for (int k = j; k >= i && array[k-i] > array[k] ; k -= i) {
                    int tmp = array[k];
                    array[k] = array[k-i];
                    array[k-i] = tmp;
                }
            }
        }
        //PUT YOUR CODE HERE

        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
