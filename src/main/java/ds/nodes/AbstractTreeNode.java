package ds.nodes;

public abstract class AbstractTreeNode<T, N extends AbstractTreeNode<T, N>> {
    protected T value;
    protected N parent;

    public AbstractTreeNode(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public N getParent() {
        return this.parent;
    }

    public void setParent(N parent) {
        this.parent = parent;
    }
}
