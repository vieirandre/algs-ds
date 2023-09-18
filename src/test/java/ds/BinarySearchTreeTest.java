package ds;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class BinarySearchTreeTest {
    private BinarySearchTree<Integer> tree;

    @Before
    public void setUp() {
        tree = new BinarySearchTree<>();
    }

    @Test
    public void testInsert() {
        assertTrue(tree.isEmpty());

        tree.insert(50);
        assertFalse(tree.isEmpty());
        assertEquals(1, tree.size());
        assertEquals(Integer.valueOf(50), tree.getRoot().getValue());

        tree.insert(30);
        tree.insert(70);
        tree.insert(30);

        assertEquals(3, tree.size());
        assertEquals(Integer.valueOf(30), tree.getRoot().getLeftChild().getValue());
        assertEquals(Integer.valueOf(70), tree.getRoot().getRightChild().getValue());
    }

    @Test
    public void testRemove() {
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        assertEquals(7, tree.size());

        tree.remove(20);
        assertEquals(6, tree.size());
        assertNull(tree.getRoot().getLeftChild().getLeftChild());

        tree.remove(30);
        assertEquals(5, tree.size());
        assertEquals(Integer.valueOf(40), tree.getRoot().getLeftChild().getValue());

        tree.remove(50);
        assertEquals(4, tree.size());
        assertTrue(tree.getRoot().getValue().equals(60) || tree.getRoot().getValue().equals(40));
    }

    @Test
    public void testContains() {
        assertFalse(tree.contains(5));

        tree.insert(5);

        assertTrue(tree.contains(5));

        // Add more elements
        tree.insert(3);
        tree.insert(7);
        tree.insert(1);
        tree.insert(4);

        assertTrue(tree.contains(3));
        assertTrue(tree.contains(7));
        assertTrue(tree.contains(1));
        assertTrue(tree.contains(4));

        assertFalse(tree.contains(10));

        tree.remove(3);
        assertFalse(tree.contains(3));
    }
}
