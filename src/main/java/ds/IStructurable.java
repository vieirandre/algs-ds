package ds;

public interface IStructurable<T> {
    void insert(T item);
    T remove(T item);
    boolean search(T item);
    boolean isEmpty();
    int size();
    void clear();
  }