package ds;

import java.util.List;
import ds.nodes.BinarySearchTreeNode;

public class BinarySearchTree<T extends Comparable<T>> implements ITree<T> {
    private BinarySearchTreeNode<T> root;
    private int size;

    public BinarySearchTree() {
        root = null;
        size = 0;
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
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        root = null;
        size = 0;
    }

    @Override
    public T getRoot() {
        return root != null ? root.getValue() : null;
    }

    @Override
    public T getParent(T node) {
        return null;
    }

    @Override
    public List<T> getChildren(T node) {
        return null;
    }
}
