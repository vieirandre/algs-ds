package ds;

public interface IStructurable<T> {
  boolean contains(T item);

  boolean isEmpty();

  int size();

  void clear();
}
