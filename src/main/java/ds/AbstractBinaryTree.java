package ds;

abstract class AbstractBinaryTree implements IStructurable {
    AbstractNode root;

    public AbstractBinaryTree() {
        root = null;
    }

    public AbstractBinaryTree(AbstractNode node) {
        root = node;
    }
}