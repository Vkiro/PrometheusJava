package week2.task2;

/**
 * Використовуючи цикл for виведіть на екран матрицю. Зверніть увагу на форматування (відступи):
 * *  2  3  4  *
 * 6  *  8  * 10
 * 11 12  * 14 15
 * 16  * 18  * 20
 * * 22 23 24  *
 */
public class MatrixPrint {
    public static final int N = 5;

    public static void main(String args[]) {
        //PUT YOUR CODE HERE
        //PUT YOUR CODE HERE
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if ((i == j) || (i + j == N - 1)) {
                    System.out.print(" * ");
                } else {
                    int accum = i * N + j + 1;
                    if (accum < 10) {
                        System.out.print(" " + accum + " ");
                    } else {
                        System.out.print(accum + " ");
                    }
                }
            }
            if (i < N - 1)
                System.out.println();
        }
    }
}
