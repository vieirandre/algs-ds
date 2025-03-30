package algs.utils;

import algs.ISortable;

@FunctionalInterface
public interface SortingAlgorithmFactory<T extends Comparable<T>> {
    ISortable<T> create(T[] input);
}
