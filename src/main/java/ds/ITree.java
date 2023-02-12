package ds;

import java.util.List;

interface ITree<T> extends IStructurable<T> {
    T getRoot();

    T getParent(T node);

    List<T> getChildren(T node);
}
