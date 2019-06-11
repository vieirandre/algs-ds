class SelectionSort extends AbstractSorting {
    public SelectionSort(int[] arr) {
        super(arr);
    }

    @Override
    public void sort() {
        int n = arr.length;

        for (int i = 0; i < (n - 1); i++) {
            int min = i;

            for (int j = (i + 1); j < n; j++) {
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