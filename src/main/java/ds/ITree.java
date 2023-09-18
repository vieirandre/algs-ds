package ds;

import ds.nodes.AbstractTreeNode;

public interface ITree<T, N extends AbstractTreeNode<T, N>> extends IStructurable<T> {
    void insert(T item);

    T remove(T item);

    N getRoot();
}
