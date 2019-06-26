class QuickSort extends AbstractSorting {
    public QuickSort(int[] input) {
        super(input);
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
        int pivot = arr[endIdx]; // last element as pivot
        int i = startIdx - 1;

        for(int j = startIdx; j < endIdx; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(i, j);
            }
        }

        swap(i + 1, endIdx);

        return i + 1;
    }
}