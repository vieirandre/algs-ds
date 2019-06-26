import static org.junit.Assert.assertArrayEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class InsertionSortTest {
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
    public void testSimpleInput_InsertionSort() {
        algorithm = new InsertionSort(helper.getSimpleInput());
        algorithm.sort();

        assertArrayEquals(helper.getOutputForSimpleInput(), algorithm.arr);
    }

    @Test
    public void testSimpleOrderedInput_InsertionSort() {
        algorithm = new InsertionSort(helper.getSimpleOrderedInput());
        algorithm.sort();

        assertArrayEquals(helper.getOutputForSimpleOrderedInput(), algorithm.arr);
    }

    @Test
    public void testSimpleReversedInput_InsertionSort() {
        algorithm = new InsertionSort(helper.getSimpleReversedInput());
        algorithm.sort();

        assertArrayEquals(helper.getOutputForSimpleReversedInput(), algorithm.arr);
    }

    @Test
    public void testLargeInput_InsertionSort() {
        algorithm = new InsertionSort(helper.getLargeInput());
        algorithm.sort();

        assertArrayEquals(helper.getOutputForLargeInput(), algorithm.arr);
    }
}