class SelectionSort extends AbstractSorting {
    public SelectionSort(int[] arr) {
        super(arr);
    }

    @Override
    public void sort() {
        for (int i = 0; i < (this.size - 1); i++) {
            int min = i;

            for (int j = (i + 1); j < this.size; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }

            // swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}