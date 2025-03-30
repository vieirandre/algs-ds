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

    static Stream<SortingAlgorithm> sortingAlgorithms() {
        return Stream.of(new SortingAlgorithm("BubbleSort", BubbleSort::new),
                new SortingAlgorithm("InsertionSort", InsertionSort::new),
                new SortingAlgorithm("SelectionSort", SelectionSort::new),
                new SortingAlgorithm("MergeSort", MergeSort::new),
                new SortingAlgorithm("QuickSort (last pivot)",
                        input -> new QuickSort(input, false)),
                new SortingAlgorithm("QuickSort (random pivot)",
                        input -> new QuickSort(input, true)));
    }

    @ParameterizedTest(name = "{0} on simple input")
    @MethodSource("sortingAlgorithms")
    void testSimpleInput(SortingAlgorithm algorithm) {
        ISortable instance = algorithm.factory().create(helper.getSimpleInput());
        instance.sort();
        assertArrayEquals(helper.getOutputForSimpleInput(), ((AbstractSorting) instance).arr);
    }

    @ParameterizedTest(name = "{0} on ordered input")
    @MethodSource("sortingAlgorithms")
    void testSimpleOrderedInput(SortingAlgorithm algorithm) {
        ISortable instance = algorithm.factory().create(helper.getSimpleOrderedInput());
        instance.sort();
        assertArrayEquals(helper.getOutputForSimpleOrderedInput(),
                ((AbstractSorting) instance).arr);
    }

    @ParameterizedTest(name = "{0} on reversed input")
    @MethodSource("sortingAlgorithms")
    void testSimpleReversedInput(SortingAlgorithm algorithm) {
        ISortable instance = algorithm.factory().create(helper.getSimpleReversedInput());
        instance.sort();
        assertArrayEquals(helper.getOutputForSimpleReversedInput(),
                ((AbstractSorting) instance).arr);
    }

    @ParameterizedTest(name = "{0} on large input")
    @MethodSource("sortingAlgorithms")
    void testLargeInput(SortingAlgorithm algorithm) {
        ISortable instance = algorithm.factory().create(helper.getLargeInput());
        instance.sort();
        assertArrayEquals(helper.getOutputForLargeInput(), ((AbstractSorting) instance).arr);
    }
}
