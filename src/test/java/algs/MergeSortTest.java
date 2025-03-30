package algs;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

public class MergeSortTest {
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
    public void testSimpleInput_MergeSort() {
        algorithm = new MergeSort(helper.getSimpleInput());
        algorithm.sort();

        assertArrayEquals(helper.getOutputForSimpleInput(), algorithm.arr);
    }

    @Test
    public void testSimpleOrderedInput_MergeSort() {
        algorithm = new MergeSort(helper.getSimpleOrderedInput());
        algorithm.sort();

        assertArrayEquals(helper.getOutputForSimpleOrderedInput(), algorithm.arr);
    }

    @Test
    public void testSimpleReversedInput_MergeSort() {
        algorithm = new MergeSort(helper.getSimpleReversedInput());
        algorithm.sort();

        assertArrayEquals(helper.getOutputForSimpleReversedInput(), algorithm.arr);
    }

    @Test
    public void testLargeInput_MergeSort() {
        algorithm = new MergeSort(helper.getLargeInput());
        algorithm.sort();

        assertArrayEquals(helper.getOutputForLargeInput(), algorithm.arr);
    }
}
