package ds;

class BinaryTree extends AbstractBinaryTree {
    public BinaryTree() {
        super();
    }
    
    public BinaryTree(int value) {
        super(new Node(value));
    }

    static class Node extends AbstractNode {
        Node right, left;

        public Node(int value) {
            super(value);
            left = right = null;
        }
    }

    @Override
    public boolean insert(AbstractNode node) {
        return false;
    }

    @Override
    public boolean remove(AbstractNode node) {
        return false;
    }

    @Override
    public boolean search(int value) {
        return false;
    }

    @Override
    public void print() {

    }
}