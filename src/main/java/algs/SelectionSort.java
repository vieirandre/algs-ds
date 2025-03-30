package algs;

public class SelectionSort<T extends Comparable<T>> extends AbstractSorting<T> {
    public SelectionSort(T[] input) {
        super(input);
    }

    @Override
    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            int min = i;

            for (int j = i + 1; j < size; j++) {
                if (arr[j].compareTo(arr[min]) < 0)
                    min = j;
            }

            swap(min, i);
        }
    }
}
