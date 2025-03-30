package algs.utils;

public record SortingAlgorithm(String name, SortingAlgorithmFactory factory) {
    @Override
    public String toString() {
        return name;
    }
}
