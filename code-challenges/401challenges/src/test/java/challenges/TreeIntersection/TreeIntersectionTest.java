package challenges.TreeIntersection;

import challenges.tree.BinaryTree;
import challenges.tree.Node;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;
public class TreeIntersectionTest {
    @Test public void testTreeIntersection(){
        // create binary trees
        BinaryTree tree1 = new BinaryTree(15);
        tree1.getRoot().setLeft(new Node(10));
        tree1.getRoot().getLeft().setLeft(new Node(11));
        tree1.getRoot().getLeft().setRight(new Node(5));
        tree1.getRoot().setRight(new Node(25));
        tree1.getRoot().getRight().setLeft(new Node(18));
        tree1.getRoot().getRight().setRight(new Node(6));

        BinaryTree tree2 = new BinaryTree(15);
        tree2.getRoot().setLeft(new Node(1));
        tree2.getRoot().getLeft().setLeft(new Node(5));
        tree2.getRoot().getLeft().setRight(new Node(9));
        tree2.getRoot().setRight(new Node(25));
        tree2.getRoot().getRight().setLeft(new Node(18));
        tree2.getRoot().getRight().setRight(new Node(7));

        HashSet expected = new HashSet();
        expected.add(5);
        expected.add(25);
        expected.add(18);
        expected.add(15);

        assertEquals(expected, TreeIntersection.treeIntersection(tree1, tree2));
    }

    @Test public void testTreeIntersectionEmptyTrees(){
        BinaryTree tree1 = new BinaryTree();
        BinaryTree tree2 = new BinaryTree();

        HashSet expected = new HashSet();
        assertEquals(expected, TreeIntersection.treeIntersection(tree1, tree2));
    }

    @Test public void testTreeIntersectionNoCommon(){
        // create binary trees
        BinaryTree tree1 = new BinaryTree(15);
        tree1.getRoot().setLeft(new Node(10));
        tree1.getRoot().getLeft().setLeft(new Node(11));
        tree1.getRoot().getLeft().setRight(new Node(5));
        tree1.getRoot().setRight(new Node(25));
        tree1.getRoot().getRight().setLeft(new Node(18));
        tree1.getRoot().getRight().setRight(new Node(6));

        BinaryTree tree2 = new BinaryTree(1);
        tree2.getRoot().setLeft(new Node(2));
        tree2.getRoot().getLeft().setLeft(new Node(4));
        tree2.getRoot().getLeft().setRight(new Node(9));
        tree2.getRoot().setRight(new Node(23));
        tree2.getRoot().getRight().setLeft(new Node(17));
        tree2.getRoot().getRight().setRight(new Node(7));

        HashSet expected = new HashSet();
        assertEquals(expected, TreeIntersection.treeIntersection(tree1, tree2));

    }
}
