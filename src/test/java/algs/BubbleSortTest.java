package algs;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

public class BubbleSortTest {
    private AbstractSorting algorithm;
    private static SortingTestHelper helper;

    @BeforeAll
    public static void initialize() {
        helper = new SortingTestHelper();

        helper.initialize_SimpleInput_Case();
        helper.initialize_SimpleOrderedInput_Case();
        helper.initialize_SimpleReversedInput_Case();
        helper.initialize_LargeInput_Case();
    }

    @Test
    public void testSimpleInput_BubbleSort() {
        algorithm = new BubbleSort(helper.getSimpleInput());
        algorithm.sort();

        assertArrayEquals(helper.getOutputForSimpleInput(), algorithm.arr);
    }

    @Test
    public void testSimpleOrderedInput_BubbleSort() {
        algorithm = new BubbleSort(helper.getSimpleOrderedInput());
        algorithm.sort();

        assertArrayEquals(helper.getOutputForSimpleOrderedInput(), algorithm.arr);
    }

    @Test
    public void testSimpleReversedInput_BubbleSort() {
        algorithm = new BubbleSort(helper.getSimpleReversedInput());
        algorithm.sort();

        assertArrayEquals(helper.getOutputForSimpleReversedInput(), algorithm.arr);
    }

    @Test
    public void testLargeInput_BubbleSort() {
        algorithm = new BubbleSort(helper.getLargeInput());
        algorithm.sort();

        assertArrayEquals(helper.getOutputForLargeInput(), algorithm.arr);
    }
}
