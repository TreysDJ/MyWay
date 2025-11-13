package bro.maks.sort;

import bro.maks.JavaAlgorithmsCourse.MemoiZationFibonachi;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest {
    @Test
    void recursionFibonachiTypicalTest() {
        RecursionFibonachi fib = new RecursionFibonachi();
        Assertions.assertEquals(1, fib.fibonachi(2));
        Assertions.assertEquals(2, fib.fibonachi(3));
        Assertions.assertEquals(3, fib.fibonachi(4));
        Assertions.assertEquals(5, fib.fibonachi(5));
    }

    @Test
    void recursionFibonachiBaseTest() {
        RecursionFibonachi fib = new RecursionFibonachi();
        Assertions.assertEquals(0, fib.fibonachi(0));
        Assertions.assertEquals(1, fib.fibonachi(1));
    }

    @Test
    void recursionFibonachiNegativeTest() {
        RecursionFibonachi fib = new RecursionFibonachi();
        Assertions.assertEquals(-1, fib.fibonachi(-1));
        Assertions.assertEquals(-1, fib.fibonachi(-5));
    }

    @Test
    void fibonachiDefaultTest() {
        FibonachiNoRecursion fib = new FibonachiNoRecursion();
        Assertions.assertEquals(1, fib.fibonachi(2));
        Assertions.assertEquals(2, fib.fibonachi(3));
        Assertions.assertEquals(3, fib.fibonachi(4));
        Assertions.assertEquals(5, fib.fibonachi(5));
    }

    @Test
    void fibonachiBaseTest() {
        FibonachiNoRecursion fib = new FibonachiNoRecursion();
        Assertions.assertEquals(0, fib.fibonachi(0));
        Assertions.assertEquals(1, fib.fibonachi(1));
    }

    @Test
    void fibonachiNegativeTest() {
        FibonachiNoRecursion fib = new FibonachiNoRecursion();
        Assertions.assertEquals(-1, fib.fibonachi(-1));
        Assertions.assertEquals(-1, fib.fibonachi(-5));
    }

    @Test
    void memoFibonachiDefaultTest() {
        MemoiZationFibonachi fib = new MemoiZationFibonachi();
        Assertions.assertEquals(1, fib.fibonachi(2));
        Assertions.assertEquals(2, fib.fibonachi(3));
        Assertions.assertEquals(3, fib.fibonachi(4));
        Assertions.assertEquals(5, fib.fibonachi(5));
    }

    @Test
    void memoFibonachiBaseTest() {
        MemoiZationFibonachi fib = new MemoiZationFibonachi();
        Assertions.assertEquals(0, fib.fibonachi(0));
        Assertions.assertEquals(1, fib.fibonachi(1));
    }

    @Test
    void memoFibonachiNegativeTest() {
        MemoiZationFibonachi fib = new MemoiZationFibonachi();
        Assertions.assertEquals(-1, fib.fibonachi(-1));
        Assertions.assertEquals(-1, fib.fibonachi(-5));
    }

}
