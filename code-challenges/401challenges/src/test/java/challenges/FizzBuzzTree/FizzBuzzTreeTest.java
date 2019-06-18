package challenges.FizzBuzzTree;

import challenges.tree.Node;
import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTreeTest {

    @Test public void testFizzBuzz(){
       Tree tree = new Tree(15);
       tree.getRoot().setLeft(new Node(10));
       tree.getRoot().getLeft().setLeft(new Node(11));
       tree.getRoot().getLeft().setRight(new Node(9));
       tree.getRoot().setRight(new Node(25));
       tree.getRoot().getRight().setLeft(new Node(18));
       tree.getRoot().getRight().setRight(new Node(7));

       FizzBuzzTree libraryToTest = new FizzBuzzTree();

       libraryToTest.FizzBuzzTree(tree);

       assertEquals("[FizBuzz, Buzz, 11, Buzz, 7]", tree.toString());
    }

    @Test public void testNoBuzz(){
        Tree tree = new Tree(1);
        tree.getRoot().setLeft(new Node(1));
        tree.getRoot().getLeft().setLeft(new Node(11));
        tree.getRoot().getLeft().setRight(new Node(1));
        tree.getRoot().setRight(new Node(11));
        tree.getRoot().getRight().setLeft(new Node(1));
        tree.getRoot().getRight().setRight(new Node(11));

        FizzBuzzTree libraryToTest = new FizzBuzzTree();

        libraryToTest.FizzBuzzTree(tree);

        assertEquals("[1, 1, 11, 11, 11]", tree.toString());
    }
}
