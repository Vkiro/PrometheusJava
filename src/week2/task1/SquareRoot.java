package week2.task1;

/**
 * Створіть застосування що знаходить корені квадратного рівняння. Коефіцієнти задаються через змінні:
 * double a;
 * double b;
 * double c;
 * Примітка: для обрахування квадратного кореня використовуйте конструкцію Math.sqrt(). Наприклад:
 * <p>
 * double x = Math.sqrt(4);
 * після виконання х буде рівним 2
 * <p>
 * Результат повинен мати наступний формат (за умови що корені, наприклад, 2 та 3):
 * x1=2
 * x2=3
 * <p>
 * Якщо корінь один (наприклад 5)
 * x1=5
 * x2=5
 * <p>
 * Якщо корені відсутні
 * x1=
 * x2=
 */
public class SquareRoot {

    public static void main(String[] args) {
        double a = 3;
        double b = 2.5;
        double c = -0.5;
        double x1, x2;
        //PUT YOUR CODE HERE
        if (a == 0 && b == 0) {
            System.out.println("x1=" + '\n' + "x2=");
            return;
        } else if (a == 0 && b != 0 && c == 0) {
            x1 = x2 = 0;
        } else if (a == 0 && b != 0 && c != 0) {
            x1 = x2 = -c / b;
        } else if (a != 0 && b == 0 && c == 0) {
            x1 = x2 = 0;
        } else if (a != 0 && b != 0 && c == 0) {
            x1 = 0;
            x2 = -b / a;
        } else if (a != 0 && b == 0 && c != 0) {
            if (-c / a > 0) {
                x1 = Math.sqrt(-c / a);
                x2 = -Math.sqrt(-c / a);
            } else {
                System.out.println("x1=" + '\n' + "x2=");
                return;
            }
        } else {
            double discriminant = Math.pow(b, 2) - 4 * a * c;
            //PUT YOUR CODE HERE
            if (discriminant > 0) {
                x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            } else if (discriminant == 0) {
                x1 = x2 = -b / (2 * a);
            } else {
                System.out.println("x1=" + '\n' + "x2=");
                return;
            }
        }

        System.out.println("x1=" + x1 + '\n' + "x2=" + x2);
    }

}
