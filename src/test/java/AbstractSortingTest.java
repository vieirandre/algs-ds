import static org.junit.Assert.assertArrayEquals;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.junit.BeforeClass;
import org.junit.Test;

public class AbstractSortingTest {
    static int[] simpleInput, outputForSimpleInput;
    static int[] largeInput, outputForLargeInput;
    static int[] orderedInput, outputForOrderedInput;
    AbstractSorting algorithm;
    
    @BeforeClass
    public static void initialize_Simple_Ordered_ReversedArrays() {
        simpleInput = new int[] { 5, 7, 3, 1, 4, 2, 6 };
        outputForSimpleInput = new int[] { 1, 2, 3, 4, 5, 6, 7 };

        orderedInput = outputForSimpleInput.clone();
        outputForOrderedInput = outputForSimpleInput.clone();
    }

    @BeforeClass
    public static void initialize_LargeArrays() {
        largeInput = new int[1000];

        for (int i = 1; i <= largeInput.length; i++) {
            largeInput[i-1] = i;
        }

        outputForLargeInput = largeInput.clone();

        shuffleArray(largeInput);
    }

    // Fisher–Yates shuffle
    private static void shuffleArray(int[] array) {
        Random rand = ThreadLocalRandom.current();

        for (int i = array.length - 1; i > 0; i--) {
            int idx = rand.nextInt(i + 1);
            
            // swap
            int temp = array[idx];
            array[idx] = array[i];
            array[i] = temp;
        }
    }

    @Test
    public void testSimpleSort_BubbleSort() {
        algorithm = new BubbleSort(simpleInput);
        algorithm.sort();

        assertArrayEquals(outputForSimpleInput, algorithm.arr);
    }

    @Test
    public void testLargeSort_BubbleSort() {
        algorithm = new BubbleSort(largeInput);
        algorithm.sort();

        assertArrayEquals(outputForLargeInput, algorithm.arr);
    }

    @Test
    public void testOrderedSort_BubbleSort() {
        algorithm = new BubbleSort(orderedInput);
        algorithm.sort();

        assertArrayEquals(outputForOrderedInput, algorithm.arr);
    }

    @Test
    public void testSimpleSort_InsertionSort() {
        algorithm = new InsertionSort(simpleInput);
        algorithm.sort();

        assertArrayEquals(outputForSimpleInput, algorithm.arr);
    }

    @Test
    public void testLargeSort_InsertionSort() {
        algorithm = new InsertionSort(largeInput);
        algorithm.sort();

        assertArrayEquals(outputForLargeInput, algorithm.arr);
    }

    @Test
    public void testOrderedSort_InsertionSort() {
        algorithm = new InsertionSort(orderedInput);
        algorithm.sort();

        assertArrayEquals(outputForOrderedInput, algorithm.arr);
    }

    @Test
    public void testSimpleSort_SelectionSort() {
        algorithm = new SelectionSort(simpleInput);
        algorithm.sort();

        assertArrayEquals(outputForSimpleInput, algorithm.arr);
    }

    @Test
    public void testLargeSort_SelectionSort() {
        algorithm = new SelectionSort(largeInput);
        algorithm.sort();

        assertArrayEquals(outputForLargeInput, algorithm.arr);
    }

    @Test
    public void testOrderedSort_SelectionSort() {
        algorithm = new SelectionSort(orderedInput);
        algorithm.sort();

        assertArrayEquals(outputForOrderedInput, algorithm.arr);
    }
}