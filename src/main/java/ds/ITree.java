package ds;

import java.util.List;

public interface ITree<T> extends IStructurable<T> {
    T getRoot();

    T getParent(T node);

    List<T> getChildren(T node);
}
