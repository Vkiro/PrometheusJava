package week7;

import sun.applet.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Створити застосування для обрахунку виразів що задано в формі польського інверсного запису
 * (реалізуйте метод parse в класі, що наведено нижче):
 * <p>
 * class Application{
 * public static double parse(String rpnString){
 * }
 * }
 * Для переведення рядків в числа використовуйте класи обгортки.
 * У випадку коли:
 * 1. При обрахунках виразу виникла помилка розбору виразу метод повинен “викинути” RPNParserException
 * public class RPNParserException extends RuntimeException{}
 * 2. У випадку ділення на нуль (коли результат виразу може стати NaN або Infinity) метод повинен
 * викинути ArithmeticException (стандартий клас виключення доступний в пакеті)
 * 3. У виразі можуть зустрічатися виключно операції +, - , * та / (сума, мінус, множення та ділення).
 * Якщо в виразі буде присутній інший оператор Ви повинні викинути RPNParserException
 * <p>
 * Деталі щодо польського інверсного запису Ви зможете знайти за посиланням
 * https://uk.wikipedia.org/wiki/Польський_інверсний_запис
 * Для даного завдання НЕ потрібно перетворювати звичайний запис в бездужковий.
 * На вході методу будуть присутні виключно вирази в польскому інверсному записі.
 * Додаткові класи, що Вам знадобляться: найбільш простим способом вирішення даної задачі буде використання стеку.
 * Стек це структура даних, яка працює за принципом (дисципліною) «останній прийшов — перший пішов»
 * (LIFO, англ. last in, first out).
 * Всі операції (наприклад, видалення елементу) в стеку можна проводити тільки з одним елементом,
 * який знаходиться на верхівці стеку та був введений в стек останнім (https://uk.wikipedia.org/wiki/Стек).
 * В мові програмування Java для роботи з такою структурою даних я пропоную використовувати інтерфейс Deque
 * та його методи push(e), pop() - це, відповідно, додати елемент та вийняти елемент.
 * В якості реалізації Ви можете використати клас LinkedList.
 */
public class Application {

    public static double parse(String rpnString) {
        List<String> list = Arrays.asList(rpnString.split(" "));

        Deque<Double> deque = new LinkedList<>();

        for (String string : list) {
            try {
                double value = Double.parseDouble(string);
                deque.push(value);
            } catch (NumberFormatException nfe) {
                double first;
                double second;
                try {
                    first = deque.pop();
                    second = deque.pop();
                } catch (NoSuchElementException nsee) {
                        throw new RPNParserException();
                    }
                if (first == 0) {
                    throw new ArithmeticException();
                } else {

                        switch (string) {
                            case "+":
                                deque.push(second + first);
                                break;
                            case "-":
                                deque.push(second - first);
                                break;
                            case "*":
                                deque.push(second * first);
                                break;
                            case "/":
                                deque.push(second / first);
                                break;
                            default:
                                throw new RPNParserException();
                        }
                    }
            }
        }

        return deque.pop();
    }

    public static void main(String[] args) throws IOException {
        Application.parse("0 0 /");
    }
}
