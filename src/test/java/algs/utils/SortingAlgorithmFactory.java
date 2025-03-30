package algs.utils;

import algs.ISortable;

@FunctionalInterface
public interface SortingAlgorithmFactory {
    ISortable create(int[] input);
}
