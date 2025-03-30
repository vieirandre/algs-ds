package algs;

import java.util.concurrent.ThreadLocalRandom;

public class QuickSort<T extends Comparable<T>> extends AbstractSorting<T> {
    private boolean isRandomPivot = false;

    public QuickSort(T[] input, boolean isRandomPivot) {
        super(input);
        this.isRandomPivot = isRandomPivot;
    }

    @Override
    public void sort() {
        sort(0, size - 1);
    }

    public void sort(int startIdx, int endIdx) {
        if (startIdx < endIdx) {
            int partitionIdx = partition(startIdx, endIdx);

            sort(startIdx, partitionIdx - 1); // sort before partition
            sort(partitionIdx + 1, endIdx); // sort after partition
        }
    }

    private int partition(int startIdx, int endIdx) {
        if (isRandomPivot)
            randomizePivot(startIdx, endIdx);

        T pivot = arr[endIdx]; // if !random, last element as pivot
        int i = startIdx - 1;

        for (int j = startIdx; j < endIdx; j++) {
            if (arr[j].compareTo(pivot) <= 0) {
                i++;
                swap(i, j);
            }
        }

        swap(i + 1, endIdx);

        return i + 1;
    }

    void randomizePivot(int startIdx, int endIdx) {
        int pivot = ThreadLocalRandom.current().nextInt(endIdx - startIdx) + startIdx;

        swap(pivot, endIdx);
    }
}
