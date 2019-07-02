package ds;

interface IStructurable {
    boolean insert(AbstractNode node);
    boolean remove(AbstractNode node);
    boolean search(int value);
    void print();
}