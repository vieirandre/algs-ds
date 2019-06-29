class MergeSort extends AbstractSorting {
    public MergeSort(int[] input) {
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
        int i, j, k;
        int leftSize = middle - leftIdx + 1;
        int rightSize = rightIdx - middle;

        int[] leftArray = new int[leftSize];
        int[] rightArray = new int[rightSize];

        for (i = 0; i < leftSize; i++)
            leftArray[i] = arr[leftIdx + i]; // copy to left array
        for (j = 0; j < rightSize; j++)
            rightArray[j] = arr[middle + 1 + j]; // copy to right array

        i = 0; j = 0; k = leftIdx; // initial indexes of subarrays

        // merge left and right arrays
        while (i < leftSize && j < rightSize) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }

            k++;
        }

        // copy remaining elements of left half, if any
        while (i < leftSize) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // copy remaining elements of right half, if any
        while (j < rightSize) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}