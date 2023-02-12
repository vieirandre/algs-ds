package algs;

public class BubbleSort extends AbstractSorting {
    public BubbleSort(int[] input) {
        super(input);
    }

    @Override
    public void sort() {
        for (int i = 0; i < (size - 1); i++) {
            for (int j = 0; j < (size - i - 1); j++) {
                if (arr[j] > arr[j + 1])
                    swap(j, j + 1);
            }
        }
    }
}
