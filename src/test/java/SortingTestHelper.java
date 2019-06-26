import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SortingTestHelper {
    private int[] simpleInput, outputForSimpleInput;
    private int[] simpleOrderedInput, outputForSimpleOrderedInput;
    private int[] simpleReversedInput, outputForSimpleReversedInput;
    private int[] largeInput, outputForLargeInput;

    public void initialize_SimpleInput_Case() {
        simpleInput = new int[] { 5, 7, 3, 1, 4, 2, 6 };
        outputForSimpleInput = new int[] { 1, 2, 3, 4, 5, 6, 7 };
    }

    public void initialize_SimpleOrderedInput_Case() {
        simpleOrderedInput = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        outputForSimpleOrderedInput = new int[] { 1, 2, 3, 4, 5, 6, 7 };
    }

    public void initialize_SimpleReversedInput_Case() {
        simpleReversedInput = new int[] { 7, 6, 5, 4, 3, 2, 1 };
        outputForSimpleReversedInput = new int[] { 1, 2, 3, 4, 5, 6, 7 };
    }

    public void initialize_LargeInput_Case() {
        largeInput = new int[50000];

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

    public int[] getSimpleOrderedInput() {
        return simpleOrderedInput;
    }

    public int[] getOutputForSimpleOrderedInput() {
        return outputForSimpleOrderedInput;
    }

    public int[] getSimpleReversedInput() {
        return simpleReversedInput;
    }

    public int[] getOutputForSimpleReversedInput() {
        return outputForSimpleReversedInput;
    }

    public int[] getLargeInput() {
        return largeInput;
    }

    public int[] getOutputForLargeInput() {
        return outputForLargeInput;
    }
}