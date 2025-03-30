package algs;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

public class QuickSortTest {
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
    public void testSimpleInput_QuickSort() {
        algorithm = new QuickSort(helper.getSimpleInput(), false);
        algorithm.sort();

        assertArrayEquals(helper.getOutputForSimpleInput(), algorithm.arr);
    }

    @Test
    public void testSimpleInput_RandomPivot_QuickSort() {
        algorithm = new QuickSort(helper.getSimpleInput(), true);
        algorithm.sort();

        assertArrayEquals(helper.getOutputForSimpleInput(), algorithm.arr);
    }

    @Test
    public void testSimpleOrderedInput_QuickSort() {
        algorithm = new QuickSort(helper.getSimpleOrderedInput(), false);
        algorithm.sort();

        assertArrayEquals(helper.getOutputForSimpleOrderedInput(), algorithm.arr);
    }

    @Test
    public void testSimpleOrderedInput_RandomPivot_QuickSort() {
        algorithm = new QuickSort(helper.getSimpleOrderedInput(), true);
        algorithm.sort();

        assertArrayEquals(helper.getOutputForSimpleOrderedInput(), algorithm.arr);
    }

    @Test
    public void testSimpleReversedInput_QuickSort() {
        algorithm = new QuickSort(helper.getSimpleReversedInput(), false);
        algorithm.sort();

        assertArrayEquals(helper.getOutputForSimpleReversedInput(), algorithm.arr);
    }

    @Test
    public void testSimpleReversedInput_RandomPivot_QuickSort() {
        algorithm = new QuickSort(helper.getSimpleReversedInput(), true);
        algorithm.sort();

        assertArrayEquals(helper.getOutputForSimpleReversedInput(), algorithm.arr);
    }

    @Test
    public void testLargeInput_QuickSort() {
        algorithm = new QuickSort(helper.getLargeInput(), false);
        algorithm.sort();

        assertArrayEquals(helper.getOutputForLargeInput(), algorithm.arr);
    }

    @Test
    public void testLargeInput_RandomPivot_QuickSort() {
        algorithm = new QuickSort(helper.getLargeInput(), true);
        algorithm.sort();

        assertArrayEquals(helper.getOutputForLargeInput(), algorithm.arr);
    }
}
