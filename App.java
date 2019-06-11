public class App {
    public static void main(String[] args) {
        int[] input = new int[] { 5, 7, 3, 1, 4, 2, 6 };

        SelectionSort algorithm = new SelectionSort(input);
        algorithm.sort();

        printOutput(input);
    }

    private static void printOutput(int[] input) {
        for (int e : input) {
            System.out.print(e + " ");
        }
    }
}