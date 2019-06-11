abstract class AbstractSorting implements ISortable {   
    int[] arr;
    int size;

    public AbstractSorting(int[] arr) {
        this.arr = arr;
        this.size = arr.length;
    }
}