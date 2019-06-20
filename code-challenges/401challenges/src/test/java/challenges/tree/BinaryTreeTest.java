package challenges.tree;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
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

    @Test public void testBinaryTreeBreathFirstTraversal(){
        BinaryTree tree = new BinaryTree(15);
        tree.getRoot().setLeft(new Node(10));
        tree.getRoot().getLeft().setLeft(new Node(11));
        tree.getRoot().getLeft().setRight(new Node(9));
        tree.getRoot().setRight(new Node(25));
        tree.getRoot().getRight().setLeft(new Node(18));
        tree.getRoot().getRight().setRight(new Node(7));

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        tree.breadthFirstTraversal();

        //expected: 4,2,6,1,3,5,7
        assertEquals("15\n" +
                "10\n" +
                "11\n" +
                "9\n" +
                "25\n" +
                "18\n" +
                "7\n", outContent.toString());
    }

    @Test public void testBinaryTreeFindMax(){
        BinaryTree tree = new BinaryTree(15);
        tree.getRoot().setLeft(new Node(10));
        tree.getRoot().getLeft().setLeft(new Node(11));
        tree.getRoot().getLeft().setRight(new Node(9));
        tree.getRoot().setRight(new Node(25));
        tree.getRoot().getRight().setLeft(new Node(18));
        tree.getRoot().getRight().setRight(new Node(7));

        assertEquals(25, tree.findMaxValue());
    }

    @Test public void testBinaryTreeFindMaxSameValues(){
        BinaryTree tree = new BinaryTree(1);
        tree.getRoot().setLeft(new Node(1));
        tree.getRoot().getLeft().setLeft(new Node(1));
        tree.getRoot().getLeft().setRight(new Node(1));
        tree.getRoot().setRight(new Node(1));
        tree.getRoot().getRight().setLeft(new Node(1));
        tree.getRoot().getRight().setRight(new Node(1));

        assertEquals(1, tree.findMaxValue());
    }
}
