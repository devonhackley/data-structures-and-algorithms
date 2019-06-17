package challenges.tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;
public class BinarySearchTreeTest {
    @Test public void testEmptyConstructor(){
        BinarySearchTree bst = new BinarySearchTree();
        assertNull(bst.getRoot());
    }

    @Test public void testWithValue(){
        BinarySearchTree bst = new BinarySearchTree(4);
        assertEquals(4, bst.getRoot().getValue());
    }
    @Test public void testAdd(){
        BinarySearchTree bst = new BinarySearchTree(4);
        bst.add(5);
        bst.add(3);

        assertEquals(3, bst.getRoot().getLeft().getValue());
        assertEquals(5,bst.getRoot().getRight().getValue());
        assertEquals("[4, 3, 5]", bst.toString());
    }
    @Test public void testContains(){
        BinarySearchTree bst = new BinarySearchTree(4);
        bst.add(5);
        bst.add(3);

        assertTrue(bst.contains(4));
        assertTrue(bst.contains(5));
    }
}
