package algs;

abstract class AbstractSorting implements ISortable {
    int[] arr;
    int size;

    public AbstractSorting(int[] input) {
        this.arr = input;
        this.size = input.length;
    }

    void swap(int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}