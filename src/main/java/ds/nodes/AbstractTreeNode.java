package ds.nodes;

public abstract class AbstractTreeNode<T> {
    protected T value;
    protected AbstractTreeNode<T> parent;

    public AbstractTreeNode(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
