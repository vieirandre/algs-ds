import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class AbstractSortingTestHelper {
    private int[] simpleInput, outputForSimpleInput;
    private int[] orderedInput, outputForOrderedInput;
    private int[] reversedInput, outputForReversedInput;
    private int[] largeInput, outputForLargeInput;

    public void initialize_SimpleArray() {
        simpleInput = new int[] { 5, 7, 3, 1, 4, 2, 6 };
        outputForSimpleInput = new int[] { 1, 2, 3, 4, 5, 6, 7 };
    }

    public void initialize_OrderedArray() {
        orderedInput = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        outputForOrderedInput = new int[] { 1, 2, 3, 4, 5, 6, 7 };
    }

    public void initialize_ReversedArray() {
        reversedInput = new int[] { 7, 6, 5, 4, 3, 2, 1 };
        outputForReversedInput = new int[] { 1, 2, 3, 4, 5, 6, 7 };
    }

    public void initialize_LargeArray() {
        largeInput = new int[1000];

        for (int i = 1; i <= largeInput.length; i++) {
            largeInput[i-1] = i;
        }

        outputForLargeInput = largeInput.clone();

        shuffleArray(largeInput);
    }

    // Fisher–Yates shuffle
    private void shuffleArray(int[] array) {
        Random rand = ThreadLocalRandom.current();

        for (int i = array.length - 1; i > 0; i--) {
            int idx = rand.nextInt(i + 1);
            
            // swap
            int temp = array[idx];
            array[idx] = array[i];
            array[i] = temp;
        }
    }

    public int[] getSimpleInput() {
        return simpleInput;
    }

    public int[] getOutputForSimpleInput() {
        return outputForSimpleInput;
    }

    public int[] getOrderedInput() {
        return orderedInput;
    }

    public int[] getOutputForOrderedInput() {
        return outputForOrderedInput;
    }

    public int[] getReversedInput() {
        return reversedInput;
    }

    public int[] getOutputForReversedInput() {
        return outputForReversedInput;
    }

    public int[] getLargeInput() {
        return largeInput;
    }

    public int[] getOutputForLargeInput() {
        return outputForLargeInput;
    }
}