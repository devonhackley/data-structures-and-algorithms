package challenges.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tree {
    public static void main(String[] args) {
        //Binary tree
        BinaryTree bTree = new BinaryTree("Bill");
        // set children
        bTree.getRoot().setLeft(new Node("James"));
        bTree.getRoot().setRight(new Node("Sarah"));

        String v1 = Arrays.toString(bTree.preOrder(bTree.getRoot(), new ArrayList()));
        System.out.println(v1);

        String v2 = Arrays.toString(bTree.inOrder(bTree.getRoot(), new ArrayList()));
        System.out.println(v2);

        String v3 = Arrays.toString(bTree.postOrder(bTree.getRoot(), new ArrayList()));
        System.out.println(v3);

        BinarySearchTree bst = new BinarySearchTree(1);
        bst.add(3);
        bst.add(5);
        bst.add(7);

        System.out.println(bst.toString());

    }
}
