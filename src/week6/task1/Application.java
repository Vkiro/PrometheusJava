package week6.task1;

/**
 * Створити застосування, що упакуковуватиме рядки за допомогою алгоритму RLE.
 * У випадку Вашого застосування потрібно замінити послідовніть однакових букв
 * на букву за якою буде слідувати цифра від 2 до 9, що вкаже на кількість повтору символів.
 * Якщо символ зустрівся лише 1 раз то заміну робити не потрібно.
 * Регістр символів при заміні враховується.
 * Наприклад, рядок:
 * Hhhhhhhhhhhhhheeeellooooo
 * <p>
 * Буде перетворено на:
 * Hh9h3e4l2o5
 * <p>
 * Зверніть увагу: якщо кількість повторів більше 9 то потрібно розбити закодовану інформацію на дві групи.
 * Наприклад:
 * hhhhhhhhhhhh
 * буде замінено на:
 * h9h3
 * <p>
 * Дані для кодування будуть надходити як аргументи командного рядка (лише один рядок).
 * Зверніть увагу на перевірку вхідних даних: на вході НЕ може бути null але може бути пустий рядок.
 * У випадку пустого рядку на вході Ваше застосування повинно вивести на екран пустий рядок.
 */
public class Application {
    public static void main(String[] args) {
        StringBuilder string = new StringBuilder(args[0]);
        int i = 0, j = 0;
        int counter = 1;
        String resultText = "";

        if (string != null) {
            for (i = 0; i < string.length(); ) {
                char accumChar = string.charAt(i);
                counter = 1;
                for (j = i + 1; j < string.length(); j++) {
                    if (accumChar == string.charAt(j)) {
                        if (counter != 9) {
                            counter++;
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (counter != 1) {
                    resultText += accumChar + "" + counter;
                } else {
                    resultText += accumChar;
                }
                i = j;
            }
            System.out.println(resultText);
        } else {
            System.out.println("");
        }
    }
}
