package ds;

abstract class AbstractNode {
    int value;

    public AbstractNode(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}