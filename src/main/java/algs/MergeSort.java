package algs;

import java.util.Arrays;

public class MergeSort<T extends Comparable<T>> extends AbstractSorting<T> {
    public MergeSort(T[] input) {
        super(input);
    }

    @Override
    public void sort() {
        sort(0, size - 1);
    }

    public void sort(int leftIdx, int rightIdx) {
        if (leftIdx < rightIdx) {
            int middle = leftIdx + (rightIdx - leftIdx) / 2;

            sort(leftIdx, middle); // sort left half
            sort(middle + 1, rightIdx); // sort right half

            merge(leftIdx, middle, rightIdx); // merge halves
        }
    }

    private void merge(int leftIdx, int middle, int rightIdx) {
        int leftSize = middle - leftIdx + 1;
        int rightSize = rightIdx - middle;

        T[] leftArray = Arrays.copyOfRange(arr, leftIdx, middle + 1);
        T[] rightArray = Arrays.copyOfRange(arr, middle + 1, rightIdx + 1);

        int i = 0, j = 0, k = leftIdx;

        // merge left and right arrays
        while (i < leftSize && j < rightSize) {
            if (leftArray[i].compareTo(rightArray[j]) <= 0)
                arr[k++] = leftArray[i++];
            else
                arr[k++] = rightArray[j++];
        }

        // copy remaining elements of left half, if any
        while (i < leftSize)
            arr[k++] = leftArray[i++];

        // copy remaining elements of right half, if any
        while (j < rightSize)
            arr[k++] = rightArray[j++];
    }
}
