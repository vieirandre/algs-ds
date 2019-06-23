import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

public class AbstractSortingTest {
    int[] input, expected;
    AbstractSorting algorithm;
    
    @Before
    public void initialize() {
        input = new int[] { 5, 7, 3, 1, 4, 2, 6 };
        expected = new int[] { 1, 2, 3, 4, 5, 6, 7 };
    }

    @Test()
    public void testSimpleSort_BubbleSort() {
        algorithm = new BubbleSort(input);
        algorithm.sort();

        assertArrayEquals(expected, algorithm.arr);
    }
}