package bro.maks.sort;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.Arrays;

public class SortTest {
    private void testSortAlgorithm(Sort sorter, int[] arrActual, int[] arrExpected) {
        int[] arrActualCopy = Arrays.copyOf(arrActual, arrActual.length);
        sorter.sort(arrActualCopy);
        Assertions.assertArrayEquals(arrExpected, arrActualCopy,
                "Sorting with " + sorter.getClass().getSimpleName() + " failed for input: " + Arrays.toString(arrActual));
    }

    @Test
    void testBaseTypicalCase() {
        int[] arrOriginal = {5, 7, 3, 8, 1, 5};
        int[] arrExpected = {1, 3, 5, 5, 7, 8};

        testSortAlgorithm(new BubbleSort(), arrOriginal, arrExpected);
        testSortAlgorithm(new SelectionSort(), arrOriginal, arrExpected);
        testSortAlgorithm(new InsertionSort(), arrOriginal, arrExpected);
    }

    @Test
    void testArrayWithEqualElements() {
        int[] arrOriginal = {5, 5, 5, 5, 5};
        int[] arrExpected = {5, 5, 5, 5, 5};

        testSortAlgorithm(new BubbleSort(), arrOriginal, arrExpected);
        testSortAlgorithm(new SelectionSort(), arrOriginal, arrExpected);
        testSortAlgorithm(new InsertionSort(), arrOriginal, arrExpected);
    }

    @Test
    void testAlreadySortedArray() {
        int[] arrOriginal = {1, 2, 3, 4, 5};
        int[] arrExpected = {1, 2, 3, 4, 5};

        testSortAlgorithm(new BubbleSort(), arrOriginal, arrExpected);
        testSortAlgorithm(new SelectionSort(), arrOriginal, arrExpected);
        testSortAlgorithm(new InsertionSort(), arrOriginal, arrExpected);
    }

    @Test
    void testReverseSortedArray() {
        int[] arrOriginal = {5, 4, 3, 2, 1};
        int[] arrExpected = {1, 2, 3, 4, 5};

        testSortAlgorithm(new BubbleSort(), arrOriginal, arrExpected);
        testSortAlgorithm(new SelectionSort(), arrOriginal, arrExpected);
        testSortAlgorithm(new InsertionSort(), arrOriginal, arrExpected);
    }

    @Test
    void testSingleElementArray() {
        int[] arrOriginal = {5};
        int[] arrExpected = {5};

        testSortAlgorithm(new BubbleSort(), arrOriginal, arrExpected);
        testSortAlgorithm(new SelectionSort(), arrOriginal, arrExpected);
        testSortAlgorithm(new InsertionSort(), arrOriginal, arrExpected);
    }

    @Test
    void testEmptyArray() {
        int[] arrOriginal = {};
        int[] arrExpected = {};

        testSortAlgorithm(new BubbleSort(), arrOriginal, arrExpected);
        testSortAlgorithm(new SelectionSort(), arrOriginal, arrExpected);
        testSortAlgorithm(new InsertionSort(), arrOriginal, arrExpected);
    }
}


