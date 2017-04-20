package week3.task3;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Vladik on 20.04.2017.
 */
public class FibonacciTest {
    @Test
    public void getNumber() throws Exception {
        Fibonacci f = new Fibonacci();
        System.out.println(f.getNumber(1));
        System.out.println(f.getNumber(2));
        System.out.println(f.getNumber(3));
        System.out.println(f.getNumber(4));
        System.out.println(f.getNumber(5));
        System.out.println(f.getNumber(-5));
    }

}