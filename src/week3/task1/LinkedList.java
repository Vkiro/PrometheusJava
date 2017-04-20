package week3.task1;

/**
 * Створіть клас що описує зв'язний список.
 * Клас повинен мати можливість додавання елементів та вилучення елементів.
 * Додавання елементів відбувається в кінець списку, вилучення елементів відбувається за порядковим номером.
 * Також створіть методи, що дозволяють отримати розмір списку та елемент за його порядковим номером.
 * <p>
 * Елементи списку повинні бути типу Node
 * <p>
 * Просимо врахувати деякі особливості перевірки завдань:
 * 1. Декларація package повинна залишатися незмінною (як у шаблоні),
 * зверніть на це увагу вставляючи Ваш код у вікно перевірки.
 * 2. Для перевірки використовуються (беруться до уваги) виключно методи з сигнатурою описаною в шаблоні.
 * 3. Кількість та зміст полів та/або методів відмінних від наведених в шаблоні не обмежена.
 * 4. В кожному класі повинен бути або конструктор за замовчанням або public безаргументний конструктор.
 * 5. Не рекомендовано робити вивід на екран.
 * <p>
 * ЗВЕРНІТЬ УВАГУ: елементи списку повинні мати номери починаючи з нуля!
 */
public class LinkedList {
    private Node head;
    private Node last;

    /* Конструктор без аргументів */
    public LinkedList() {
        head = new Node();
        last = head;
    }

    /* Додати елемент в кінець списку */
    public void add(Integer data) {
        Node node = new Node();
        node.setData(data);

        last.setNext(node);
        last = node;
        if (head == null) {
            head = node;
        }
    }

    /* Отримати елемент по індексу, повертає null якщо такий елемент недоступний */
    public Integer get(int index) {
        if ((index < 0) || (index > size() - 1)) {
            return null;
        } else {
            Node crowler = head.getNext();
            for (int i = 0; i < index; i++) {
                crowler = crowler.getNext();
            }
            return crowler.getData();
        }
    }

    /* Вилучення елементу за індексом, повертає true у разі успіху або false в іншому випадку */
    public boolean delete(int index) {
        if ((index < 0) || (index > size() - 1)) {
            return false;
        } else {
            Node crowler = head;
            for (int i = 0; i < index; i++) {
                crowler = crowler.getNext();
            }

            crowler.setNext(crowler.getNext().getNext());
            return true;
        }
    }

    /*Поверта розмір списку: якщо елементів в списку нема то повертає 0 (нуль)*/
    public int size() {
        Node crowler = head.getNext();
        int counter = 0;
        while (crowler != null) {
            crowler = crowler.getNext();
            counter++;
        }
        return counter;
    }
}
