package ds.nodes;

public class BinarySearchTreeNode<T extends Comparable<T>> extends AbstractTreeNode<T> {
    private BinarySearchTreeNode<T> leftChild;
    private BinarySearchTreeNode<T> rightChild;

    public BinarySearchTreeNode(T value) {
        super(value);
        this.leftChild = null;
        this.rightChild = null;
    }

    public BinarySearchTreeNode<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(BinarySearchTreeNode<T> left) {
        this.leftChild = left;
    }

    public BinarySearchTreeNode<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(BinarySearchTreeNode<T> right) {
        this.rightChild = right;
    }
}
