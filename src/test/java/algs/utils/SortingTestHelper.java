package algs.utils;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SortingTestHelper {
    private Integer[] simpleInput, outputForSimpleInput;
    private Integer[] simpleOrderedInput, outputForSimpleOrderedInput;
    private Integer[] simpleReversedInput, outputForSimpleReversedInput;
    private Integer[] largeInput, outputForLargeInput;

    public void initialize_SimpleInput_Case() {
        simpleInput = new Integer[] {5, 7, 3, 1, 4, 2, 6};
        outputForSimpleInput = new Integer[] {1, 2, 3, 4, 5, 6, 7};
    }

    public void initialize_SimpleOrderedInput_Case() {
        simpleOrderedInput = new Integer[] {1, 2, 3, 4, 5, 6, 7};
        outputForSimpleOrderedInput = new Integer[] {1, 2, 3, 4, 5, 6, 7};
    }

    public void initialize_SimpleReversedInput_Case() {
        simpleReversedInput = new Integer[] {7, 6, 5, 4, 3, 2, 1};
        outputForSimpleReversedInput = new Integer[] {1, 2, 3, 4, 5, 6, 7};
    }

    public void initialize_LargeInput_Case() {
        largeInput = new Integer[50000];

        for (int i = 1; i <= largeInput.length; i++) {
            largeInput[i - 1] = i;
        }

        outputForLargeInput = largeInput.clone();

        shuffleArray(largeInput);
    }

    // Fisher–Yates shuffle
    private void shuffleArray(Integer[] array) {
        Random rand = ThreadLocalRandom.current();

        for (int i = array.length - 1; i > 0; i--) {
            int idx = rand.nextInt(i + 1);

            // swap
            int temp = array[idx];
            array[idx] = array[i];
            array[i] = temp;
        }
    }

    public Integer[] getSimpleInput() {
        return simpleInput.clone();
    }

    public Integer[] getOutputForSimpleInput() {
        return outputForSimpleInput.clone();
    }

    public Integer[] getSimpleOrderedInput() {
        return simpleOrderedInput.clone();
    }

    public Integer[] getOutputForSimpleOrderedInput() {
        return outputForSimpleOrderedInput.clone();
    }

    public Integer[] getSimpleReversedInput() {
        return simpleReversedInput.clone();
    }

    public Integer[] getOutputForSimpleReversedInput() {
        return outputForSimpleReversedInput.clone();
    }

    public Integer[] getLargeInput() {
        return largeInput.clone();
    }

    public Integer[] getOutputForLargeInput() {
        return outputForLargeInput.clone();
    }
}
