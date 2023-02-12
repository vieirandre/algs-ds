package ds.nodes;

public class BinarySearchTreeNode<T extends Comparable<T>> extends AbstractTreeNode<T> {
    protected BinarySearchTreeNode<T> left;
    protected BinarySearchTreeNode<T> right;

    public BinarySearchTreeNode(T value) {
        super(value);
        this.left = null;
        this.right = null;
    }

    public BinarySearchTreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(BinarySearchTreeNode<T> left) {
        this.left = left;
    }

    public BinarySearchTreeNode<T> getRight() {
        return right;
    }

    public void setRight(BinarySearchTreeNode<T> right) {
        this.right = right;
    }
}
