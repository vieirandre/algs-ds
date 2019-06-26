import static org.junit.Assert.assertArrayEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class SelectionSortTest {
    private AbstractSorting algorithm;
    private static SortingTestHelper helper;

    @BeforeClass
    public static void initialize() {
        helper = new SortingTestHelper();

        helper.initialize_SimpleInput_Case();
        helper.initialize_OrderedInput_Case();
        helper.initialize_ReversedInput_Case();
        helper.initialize_LargeInput_Case();
    }

    @Test
    public void testSimpleInput_SelectionSort() {
        algorithm = new SelectionSort(helper.getSimpleInput());
        algorithm.sort();

        assertArrayEquals(helper.getOutputForSimpleInput(), algorithm.arr);
    }

    @Test
    public void testLargeInput_SelectionSort() {
        algorithm = new SelectionSort(helper.getLargeInput());
        algorithm.sort();

        assertArrayEquals(helper.getOutputForLargeInput(), algorithm.arr);
    }

    @Test
    public void testOrderedInput_SelectionSort() {
        algorithm = new SelectionSort(helper.getOrderedInput());
        algorithm.sort();

        assertArrayEquals(helper.getOutputForOrderedInput(), algorithm.arr);
    }

    @Test
    public void testReversedInput_SelectionSort() {
        algorithm = new SelectionSort(helper.getReversedInput());
        algorithm.sort();

        assertArrayEquals(helper.getOutputForReversedInput(), algorithm.arr);
    }
}