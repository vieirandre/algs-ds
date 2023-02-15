package ds;

import java.util.List;
import ds.nodes.AbstractTreeNode;

public interface ITree<T, N extends AbstractTreeNode<T, N>> extends IStructurable<T> {
    N getRoot();

    N getParent(N node);

    List<N> getChildren(N node);
}
