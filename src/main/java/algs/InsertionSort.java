package algs;

public class InsertionSort<T extends Comparable<T>> extends AbstractSorting<T> {
    public InsertionSort(T[] input) {
        super(input);
    }

    @Override
    public void sort() {
        for (int i = 1; i < size; i++) {
            T key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }
}
