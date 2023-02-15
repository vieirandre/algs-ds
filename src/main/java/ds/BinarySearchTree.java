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

    }

    @Override
    public T remove(T item) {
        return null;
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
}
