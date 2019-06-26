import static org.junit.Assert.assertArrayEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class QuickSortTest {
    private AbstractSorting algorithm;
    private static SortingTestHelper helper;

    @BeforeClass
    public static void initialize() {
        helper = new SortingTestHelper();

        helper.initialize_SimpleInput_Case();
        helper.initialize_SimpleOrderedInput_Case();
        helper.initialize_SimpleReversedInput_Case();
        helper.initialize_LargeInput_Case();
    }

    @Test
    public void testSimpleInput_QuickSort() {
        algorithm = new QuickSort(helper.getSimpleInput());
        algorithm.sort();

        assertArrayEquals(helper.getOutputForSimpleInput(), algorithm.arr);
    }

    @Test
    public void testSimpleOrderedInput_QuickSort() {
        algorithm = new QuickSort(helper.getSimpleOrderedInput());
        algorithm.sort();

        assertArrayEquals(helper.getOutputForSimpleOrderedInput(), algorithm.arr);
    }

    @Test
    public void testSimpleReversedInput_QuickSort() {
        algorithm = new QuickSort(helper.getSimpleReversedInput());
        algorithm.sort();

        assertArrayEquals(helper.getOutputForSimpleReversedInput(), algorithm.arr);
    }

    @Test
    public void testLargeInput_QuickSort() {
        algorithm = new QuickSort(helper.getLargeInput());
        algorithm.sort();

        assertArrayEquals(helper.getOutputForLargeInput(), algorithm.arr);
    }
}