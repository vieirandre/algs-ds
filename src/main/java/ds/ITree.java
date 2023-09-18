package ds;

import ds.nodes.AbstractTreeNode;

public interface ITree<T, N extends AbstractTreeNode<T, N>> extends IStructurable<T> {
    N getRoot();

    N getParent(N node);
}
