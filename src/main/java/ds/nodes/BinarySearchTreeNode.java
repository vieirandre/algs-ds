package ds.nodes;

public class BinarySearchTreeNode<T extends Comparable<T>>
        extends AbstractTreeNode<T, BinarySearchTreeNode<T>>
        implements Comparable<BinarySearchTreeNode<T>> {
    private BinarySearchTreeNode<T> leftChild;
    private BinarySearchTreeNode<T> rightChild;

    public BinarySearchTreeNode(T value) {
        super(value);
        this.leftChild = null;
        this.rightChild = null;
    }

    public BinarySearchTreeNode<T> getLeftChild() {
        return this.leftChild;
    }

    public void setLeftChild(BinarySearchTreeNode<T> left) {
        this.leftChild = left;

        if (left != null)
            left.setParent(this);
    }

    public BinarySearchTreeNode<T> getRightChild() {
        return this.rightChild;
    }

    public void setRightChild(BinarySearchTreeNode<T> right) {
        this.rightChild = right;

        if (right != null)
            right.setParent(this);
    }

    @Override
    public int compareTo(BinarySearchTreeNode<T> otherNode) {
        return this.getValue().compareTo(otherNode.getValue());
    }
}
