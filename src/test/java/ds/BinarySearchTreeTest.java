package ds;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class BinarySearchTreeTest {
    private BinarySearchTree<Integer> tree;

    @BeforeEach
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
        assertEquals(3, tree.size());

        tree.insert(30); // duplicate; size shouldn't change
        assertEquals(3, tree.size());

        assertEquals(Integer.valueOf(30), tree.getRoot().getLeftChild().getValue());
        assertEquals(Integer.valueOf(70), tree.getRoot().getRightChild().getValue());

        tree.clear();

        // insertion in increasing order
        tree.insert(6);
        tree.insert(7);
        tree.insert(8);
        assertEquals(3, tree.size());
    }

    @Test
    public void testRemove() {
        // setup
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        assertEquals(7, tree.size());

        tree.remove(20); // removing a leaf node
        assertEquals(6, tree.size());
        assertNull(tree.getRoot().getLeftChild().getLeftChild());

        tree.remove(30); // remove node with one child
        assertEquals(5, tree.size());
        assertEquals(Integer.valueOf(40), tree.getRoot().getLeftChild().getValue());

        tree.remove(50); // remove node with two children
        assertEquals(4, tree.size());
        assertTrue(tree.getRoot().getValue().equals(60) || tree.getRoot().getValue().equals(40));

        // setup
        tree.clear();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);

        tree.remove(2); // removing a leaf node
        assertFalse(tree.contains(2));
        assertEquals(6, tree.size());

        tree.remove(3); // removing a node with one child
        assertFalse(tree.contains(3));
        assertTrue(tree.contains(4)); // 4 should replace 3
        assertEquals(5, tree.size());

        tree.remove(5); // removing a node with two children
        assertFalse(tree.contains(5));
        assertTrue(tree.contains(6)); // 6 (successor of 5, inorder) should replace 5
        assertEquals(4, tree.size());

        tree.remove(10); // removing a non-existent node
        assertEquals(4, tree.size());

        tree.clear();
        tree.remove(4); // removing from an empty tree
        assertEquals(0, tree.size());
    }

    @Test
    public void testContains() {
        // the tree has no elements yet
        assertFalse(tree.contains(5));

        tree.insert(5);
        assertTrue(tree.contains(5));

        tree.insert(3);
        tree.insert(7);
        tree.insert(1);
        tree.insert(4);

        assertTrue(tree.contains(3));
        assertTrue(tree.contains(7));
        assertTrue(tree.contains(1));
        assertTrue(tree.contains(4));

        // test for an element that hasn't been added
        assertFalse(tree.contains(10));

        // after removing an element, it shouldn't be found
        tree.remove(3);
        assertFalse(tree.contains(3));
    }

    @Test
    public void testGetHeight() {
        assertEquals(0, tree.getHeight());

        tree.insert(5);
        assertEquals(1, tree.getHeight());

        tree.insert(3);
        tree.insert(7);
        assertEquals(2, tree.getHeight());

        tree.insert(1);
        tree.insert(4);
        assertEquals(3, tree.getHeight());
    }
}
