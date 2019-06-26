import static org.junit.Assert.assertArrayEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class BubbleSortTest {
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
    public void testSimpleInput_BubbleSort() {
        algorithm = new BubbleSort(helper.getSimpleInput());
        algorithm.sort();

        assertArrayEquals(helper.getOutputForSimpleInput(), algorithm.arr);
    }

    @Test
    public void testLargeInput_BubbleSort() {
        algorithm = new BubbleSort(helper.getLargeInput());
        algorithm.sort();

        assertArrayEquals(helper.getOutputForLargeInput(), algorithm.arr);
    }

    @Test
    public void testOrderedInput_BubbleSort() {
        algorithm = new BubbleSort(helper.getOrderedInput());
        algorithm.sort();

        assertArrayEquals(helper.getOutputForOrderedInput(), algorithm.arr);
    }

    @Test
    public void testReversedInput_BubbleSort() {
        algorithm = new BubbleSort(helper.getReversedInput());
        algorithm.sort();

        assertArrayEquals(helper.getOutputForReversedInput(), algorithm.arr);
    }
}