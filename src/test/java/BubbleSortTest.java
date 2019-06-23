import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

public class BubbleSortTest {
    int[] input, expected;
    
    @Before
    public void initialize() {
        input = new int[] { 5, 7, 3, 1, 4, 2, 6 };
    }

    @Test()
    public void testIt() {
        expected = new int[] { 1, 2, 3, 4, 5, 6, 7 };

        BubbleSort algorithm = new BubbleSort(input);
        algorithm.sort();

        assertArrayEquals(expected, algorithm.arr);
    }
}