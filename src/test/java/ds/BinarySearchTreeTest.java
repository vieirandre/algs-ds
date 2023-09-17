package ds;

import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTreeTest {
    @Test
    public void testInsert() {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        assertTrue(bst.isEmpty());

        bst.insert(50);
        assertFalse(bst.isEmpty());
        assertEquals(1, bst.size());
        assertEquals(Integer.valueOf(50), bst.getRoot().getValue());

        bst.insert(30);
        bst.insert(70);
        bst.insert(30);

        assertEquals(3, bst.size());
        assertEquals(Integer.valueOf(30), bst.getRoot().getLeftChild().getValue());
        assertEquals(Integer.valueOf(70), bst.getRoot().getRightChild().getValue());
    }

    @Test
    public void testRemove() {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        assertEquals(7, bst.size());

        bst.remove(20);
        assertEquals(6, bst.size());
        assertNull(bst.getRoot().getLeftChild().getLeftChild());

        bst.remove(30);
        assertEquals(5, bst.size());
        assertEquals(Integer.valueOf(40), bst.getRoot().getLeftChild().getValue());

        bst.remove(50);
        assertEquals(4, bst.size());
        assertTrue(bst.getRoot().getValue().equals(60) || bst.getRoot().getValue().equals(40));
    }
}
