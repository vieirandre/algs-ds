package ds;

import ds.nodes.BinarySearchTreeNode;

public class BinarySearchTree<T extends Comparable<T>>
        implements ITree<T, BinarySearchTreeNode<T>> {
    private BinarySearchTreeNode<T> root;
    private int size;

    public BinarySearchTree() {
        this.root = null;
        this.size = 0;
    }

    @Override
    public void insert(T item) {
        BinarySearchTreeNode<T> newNode = new BinarySearchTreeNode<>(item);

        if (this.root == null) {
            this.root = newNode;
            this.size++;
            return;
        }

        BinarySearchTreeNode<T> currentNode = this.root;
        BinarySearchTreeNode<T> parentNode = null;

        while (currentNode != null) {
            parentNode = currentNode;

            int comparisonResult = item.compareTo(currentNode.getValue());

            if (comparisonResult < 0)
                currentNode = currentNode.getLeftChild();
            else if (comparisonResult > 0)
                currentNode = currentNode.getRightChild();
            else // duplicate
                return;
        }

        if (item.compareTo(parentNode.getValue()) < 0)
            parentNode.setLeftChild(newNode);
        else
            parentNode.setRightChild(newNode);

        this.size++;
    }

    @Override
    public T remove(T item) {
        root = remove(root, item);
        return item;
    }

    @Override
    public boolean contains(T item) {
        return contains(root, item) != null;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void clear() {
        this.root = null;
        this.size = 0;
    }

    @Override
    public BinarySearchTreeNode<T> getRoot() {
        return this.root;
    }

    @Override
    public int getHeight() {
        return getHeight(root);
    }

    private BinarySearchTreeNode<T> remove(BinarySearchTreeNode<T> current, T value) {
        if (current == null)
            return null;

        int comparisonResult = value.compareTo(current.getValue());

        if (comparisonResult < 0)
            current.setLeftChild(remove(current.getLeftChild(), value));
        else if (comparisonResult > 0)
            current.setRightChild(remove(current.getRightChild(), value));
        else {
            if (current.getLeftChild() == null) {
                size--;
                return current.getRightChild();
            } else if (current.getRightChild() == null) {
                size--;
                return current.getLeftChild();
            }

            current.setValue(findSmallestValue(current.getRightChild()));

            current.setRightChild(remove(current.getRightChild(), current.getValue()));
        }

        return current;
    }

    private T findSmallestValue(BinarySearchTreeNode<T> node) {
        return node.getLeftChild() == null ? node.getValue()
                : findSmallestValue(node.getLeftChild());
    }

    private BinarySearchTreeNode<T> contains(BinarySearchTreeNode<T> current, T value) {
        if (current == null)
            return null;

        int comparisonResult = value.compareTo(current.getValue());

        if (comparisonResult < 0)
            return contains(current.getLeftChild(), value);
        else if (comparisonResult > 0)
            return contains(current.getRightChild(), value);
        else
            return current;
    }

    private int getHeight(BinarySearchTreeNode<T> node) {
        if (node == null)
            return 0;

        int leftHeight = getHeight(node.getLeftChild());
        int rightHeight = getHeight(node.getRightChild());

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
