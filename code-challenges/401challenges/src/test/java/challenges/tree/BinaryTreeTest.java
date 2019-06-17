package challenges.tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class BinaryTreeTest {

    @Test public void testBinaryTreeConstructorEmpty(){
        BinaryTree tree = new BinaryTree();
        assertNull(tree.getRoot());
    }

    @Test public void testBinaryTreeConstructorWithValue(){
        BinaryTree tree = new BinaryTree("bill");
        assertEquals("bill", tree.getRoot().getValue());
    }

    @Test public void testBinaryTreeSetChildren(){
        BinaryTree tree = new BinaryTree("bill");
        tree.getRoot().setLeft(new Node("James"));
        tree.getRoot().setRight(new Node("Sarah"));

        assertEquals("James", tree.getRoot().getLeft().getValue());
        assertEquals("Sarah", tree.getRoot().getRight().getValue());
    }

    @Test public void testBinaryTreePreOrder(){
        BinaryTree tree = new BinaryTree("bill");
        tree.getRoot().setLeft(new Node("James"));
        tree.getRoot().setRight(new Node("Sarah"));

        String val = Arrays.toString(tree.preOrder(tree.getRoot(), new ArrayList()));
        assertEquals("[bill, James, Sarah]", val);
    }
    @Test public void testBinaryTreeInOrder(){
        BinaryTree tree = new BinaryTree("bill");
        tree.getRoot().setLeft(new Node("James"));
        tree.getRoot().setRight(new Node("Sarah"));

        String val = Arrays.toString(tree.inOrder(tree.getRoot(), new ArrayList()));
        assertEquals("[James, bill, Sarah]", val);
    }

    @Test public void testBinaryTreePostOrder(){
        BinaryTree tree = new BinaryTree("bill");
        tree.getRoot().setLeft(new Node("James"));
        tree.getRoot().setRight(new Node("Sarah"));

        String val = Arrays.toString(tree.postOrder(tree.getRoot(), new ArrayList()));
        assertEquals("[James, Sarah, bill]", val);
    }
}
