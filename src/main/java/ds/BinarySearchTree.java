package ds;

import java.util.ArrayList;
import java.util.List;
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

            if (item.compareTo(currentNode.getValue()) < 0)
                currentNode = currentNode.getLeftChild();
            else
                currentNode = currentNode.getRightChild();
        }

        if (item.compareTo(parentNode.getValue()) < 0)
            parentNode.setLeftChild(newNode);
        else
            parentNode.setRightChild(newNode);

        this.size++;
    }

    @Override
    public T remove(T item) {
        root = removeRecursively(root, item);
        return item;
    }

    @Override
    public boolean search(T item) {
        return false;
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
    public BinarySearchTreeNode<T> getParent(BinarySearchTreeNode<T> node) {
        return node.getParent();
    }

    @Override
    public List<BinarySearchTreeNode<T>> getChildren(BinarySearchTreeNode<T> node) {
        List<BinarySearchTreeNode<T>> children = new ArrayList<>();

        if (node.getLeftChild() != null)
            children.add(node.getLeftChild());

        if (node.getRightChild() != null)
            children.add(node.getRightChild());

        return children;
    }

    private BinarySearchTreeNode<T> removeRecursively(BinarySearchTreeNode<T> current, T value) {
        if (current == null)
            return null;

        if (value.compareTo(current.getValue()) == 0) {
            size--;

            if (current.getLeftChild() == null)
                return current.getRightChild();
            else if (current.getRightChild() == null)
                return current.getLeftChild();

            current.setValue(findSmallestValue(current.getRightChild()));
            current.setRightChild(removeRecursively(current.getRightChild(), current.getValue()));

            return current;
        } else if (value.compareTo(current.getValue()) < 0) {
            current.setLeftChild(removeRecursively(current.getLeftChild(), value));
            return current;
        } else {
            current.setRightChild(removeRecursively(current.getRightChild(), value));
            return current;
        }
    }

    private T findSmallestValue(BinarySearchTreeNode<T> root) {
        return root.getLeftChild() == null ? root.getValue()
                : findSmallestValue(root.getLeftChild());
    }
}
