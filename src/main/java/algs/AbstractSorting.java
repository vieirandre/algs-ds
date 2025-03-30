package algs;

public abstract class AbstractSorting<T extends Comparable<T>> implements ISortable<T> {
    protected T[] arr;
    protected int size;

    public AbstractSorting(T[] input) {
        this.arr = input;
        this.size = input.length;
    }

    protected void swap(int x, int y) {
        T temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    @Override
    public T[] getArray() {
        return arr;
    }
}
