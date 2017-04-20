package week3.task1;

/**
 * Created by Vladik on 20.04.2017.
 */
public class LinkedListTest {
    LinkedList list = new LinkedList();

    @org.junit.Test
    public void add() throws Exception {

    }

    @org.junit.Test
    public void get() throws Exception {
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        System.out.println(list.get(0));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        System.out.println(list.get(-1));
    }

    @org.junit.Test
    public void delete() throws Exception {
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        System.out.println(list.delete(0));
        System.out.println(list.delete(2));
        System.out.println(list.delete(4));
        System.out.println(list.delete(-1));
    }

    @org.junit.Test
    public void size() throws Exception {
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        System.out.println(list.size());
    }

}