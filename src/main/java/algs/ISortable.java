package algs;

public interface ISortable<T extends Comparable<T>> {
    void sort();

    T[] getArray();
}
