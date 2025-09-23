package bro.maks.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTest {
    @Test
    void factorialBaseTest() {
        RecursionFactorial fac = new RecursionFactorial();
        int factorial = fac.factorial(7);
        Assertions.assertEquals(5040, factorial);
    }

    @Test
    void factorialNullTest() {
        RecursionFactorial fac = new RecursionFactorial();
        int factorial = fac.factorial(0);
        Assertions.assertEquals(1, factorial);
    }

    @Test
    void factorialOneTest() {
        RecursionFactorial fac = new RecursionFactorial();
        int factorial = fac.factorial(1);
        Assertions.assertEquals(1, factorial);
    }

    @Test
    void factorialLessTest() {
        RecursionFactorial fac = new RecursionFactorial();
        int factorial = fac.factorial(-5);
        Assertions.assertEquals(-1, factorial);
    }

    @Test
    void recursionFibonachiDefaultTest() {
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
}
