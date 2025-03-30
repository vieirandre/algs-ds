package algs;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import algs.utils.SortingAlgorithm;
import algs.utils.SortingTestHelper;
import java.util.stream.Stream;

public class SortingAlgorithmsTest {

    private static SortingTestHelper helper;

    @BeforeAll
    static void setup() {
        helper = new SortingTestHelper();
        helper.initialize_SimpleInput_Case();
        helper.initialize_SimpleOrderedInput_Case();
        helper.initialize_SimpleReversedInput_Case();
        helper.initialize_LargeInput_Case();
    }

    static Stream<SortingAlgorithm<Integer>> sortingAlgorithms() {
        return Stream.<SortingAlgorithm<Integer>>of(
                new SortingAlgorithm<>("BubbleSort", BubbleSort::new),
                new SortingAlgorithm<>("InsertionSort", InsertionSort::new),
                new SortingAlgorithm<>("SelectionSort", SelectionSort::new),
                new SortingAlgorithm<>("MergeSort", MergeSort::new),
                new SortingAlgorithm<>("QuickSort, last pivot",
                        input -> new QuickSort<>(input, false)),
                new SortingAlgorithm<>("QuickSort, random pivot",
                        input -> new QuickSort<>(input, true)));
    }

    @ParameterizedTest(name = "{0} on simple input")
    @MethodSource("sortingAlgorithms")
    void testSimpleInput(SortingAlgorithm<Integer> algorithm) {
        Integer[] input = helper.getSimpleInput();
        ISortable<Integer> instance = algorithm.factory().create(input);
        instance.sort();
        assertArrayEquals(helper.getOutputForSimpleInput(), instance.getArray());
    }

    @ParameterizedTest(name = "{0} on ordered input")
    @MethodSource("sortingAlgorithms")
    void testSimpleOrderedInput(SortingAlgorithm<Integer> algorithm) {
        Integer[] input = helper.getSimpleOrderedInput();
        ISortable<Integer> instance = algorithm.factory().create(input);
        instance.sort();
        assertArrayEquals(helper.getOutputForSimpleOrderedInput(), instance.getArray());
    }

    @ParameterizedTest(name = "{0} on reversed input")
    @MethodSource("sortingAlgorithms")
    void testSimpleReversedInput(SortingAlgorithm<Integer> algorithm) {
        Integer[] input = helper.getSimpleReversedInput();
        ISortable<Integer> instance = algorithm.factory().create(input);
        instance.sort();
        assertArrayEquals(helper.getOutputForSimpleReversedInput(), instance.getArray());
    }

    @ParameterizedTest(name = "{0} on large input")
    @MethodSource("sortingAlgorithms")
    void testLargeInput(SortingAlgorithm<Integer> algorithm) {
        Integer[] input = helper.getLargeInput();
        ISortable<Integer> instance = algorithm.factory().create(input);
        instance.sort();
        assertArrayEquals(helper.getOutputForLargeInput(), instance.getArray());
    }
}
