import static org.junit.Assert.assertArrayEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class InsertionSortTest {
    private AbstractSorting algorithm;
    private static AbstractSortingTestHelper helper;

    @BeforeClass
    public static void initialize() {
        helper = new AbstractSortingTestHelper();

        helper.initialize_SimpleInput_Case();
        helper.initialize_OrderedInput_Case();
        helper.initialize_ReversedInput_Case();
        helper.initialize_LargeInput_Case();
    }

    @Test
    public void testSimpleInput_InsertionSort() {
        algorithm = new InsertionSort(helper.getSimpleInput());
        algorithm.sort();

        assertArrayEquals(helper.getOutputForSimpleInput(), algorithm.arr);
    }

    @Test
    public void testLargeInput_InsertionSort() {
        algorithm = new InsertionSort(helper.getLargeInput());
        algorithm.sort();

        assertArrayEquals(helper.getOutputForLargeInput(), algorithm.arr);
    }

    @Test
    public void testOrderedInput_InsertionSort() {
        algorithm = new InsertionSort(helper.getOrderedInput());
        algorithm.sort();

        assertArrayEquals(helper.getOutputForOrderedInput(), algorithm.arr);
    }

    @Test
    public void testReversedInput_InsertionSort() {
        algorithm = new InsertionSort(helper.getReversedInput());
        algorithm.sort();

        assertArrayEquals(helper.getOutputForReversedInput(), algorithm.arr);
    }
}