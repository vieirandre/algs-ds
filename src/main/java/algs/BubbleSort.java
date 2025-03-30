package algs;

public class BubbleSort<T extends Comparable<T>> extends AbstractSorting<T> {
    public BubbleSort(T[] input) {
        super(input);
    }

    @Override
    public void sort() {
        for (int i = 0; i < size - 1; i++)
            for (int j = 0; j < size - i - 1; j++)
                if (arr[j].compareTo(arr[j + 1]) > 0)
                    swap(j, j + 1);
    }
}
