package week6.task2;

/**
 * Створіть застосування, що буде декодувати рядки отримані в завданні з кодуванням рядків.
 * Наприклад:
 * Hh9h3e4l2o5
 * Потрібно перетворити на:
 * Hhhhhhhhhhhhhheeeellooooo
 *
 * Дані для декодування будуть надходити як аргументи командного рядка (лише один рядок).
 * Зверніть увагу на перевірку вхідних даних: на вході НЕ може бути null але може бути пустий рядок.
 * У випадку пустого рядку на вході Ваше застосування повинно вивести на екран пустий рядок.
 * Також на вході можуть бути завідомо некоректні рядки.
 * Наприклад:
 * Hh90helo
 * В даному випадку кількість повторів 90, що не допустимо за умовами задачі кодування.
 * В такому випадку виведіть на екран порожній рядок.
 *
 * В кодованому рядку не повинно бути символів, що повторюються.
 * Наприклад:
 * Hhhhhhhhhhhhhheeeellooooo
 * В такому випадку виведіть пустий рядок
 */
public class Application {
    public static void main(String[] args) {
        StringBuilder string = new StringBuilder("9f4t5");
        StringBuilder result = new StringBuilder();

        try {
            if (string != null || !(Character.isDigit(string.charAt(0)))) {
                    result.append(string.charAt(0));
                    for (int i = 1; i < string.length(); i++) {
                        if (string.charAt(i) != string.charAt(i - 1)) {

                            if (Character.isDigit(string.charAt(i))) {
                                if (!Character.isDigit(string.charAt(i - 1))) {
                                    for (int j = 0; j < Character.getNumericValue(string.charAt(i)) - 1; j++) {
                                        result.append(string.charAt(i - 1));
                                    }
                                } else {
                                    throw new Exception();
                                }
                            } else {
                                result.append(string.charAt(i));
                            }
                        } else {
                            throw new Exception();
                        }
                    }
                    System.out.println(result);

            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("");
        }
    }
}
