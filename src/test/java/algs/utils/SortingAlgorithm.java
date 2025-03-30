package algs.utils;

public record SortingAlgorithm<T extends Comparable<T>>(String name,
        SortingAlgorithmFactory<T> factory) {
    @Override
    public String toString() {
        return name;
    }
}
