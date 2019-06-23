class SelectionSort extends AbstractSorting {
    public SelectionSort(int[] arr) {
        super(arr);
    }

    @Override
    public void sort() {
        for (int i = 0; i < (size - 1); i++) {
            int min = i;

            for (int j = (i + 1); j < size; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }

            swap(min, i);
        }
    }
}