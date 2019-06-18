package challenges.tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T> {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public BinaryTree(){
        this.root = null;
    }
    public BinaryTree(T value){
        this.root = new Node((T)value);
    }

    public  T[] preOrder(Node root, List<T> list){
        if(root != null){
            list.add((T)root.getValue());
            preOrder(root.getLeft(), list);
            preOrder(root.getRight(), list);
        } else {
            System.out.println("The tree is empty");
        }
        return (T[])list.toArray();
    }

    public  T[] inOrder(Node node, List<T> list){
        if(node != null){
            if(node.getLeft() != null) {
                Node left = node.getLeft();
                list.add((T)left.getValue());
                preOrder(left.getLeft(), list);
            }
            list.add((T)node.getValue());
            if(node.getRight() != null){
                Node right = node.getRight();
                list.add((T)right.getValue());
                preOrder(right.getRight(), list);
            }
        } else {
            System.out.println("The tree is empty");
        }
        return (T[])list.toArray();
    }

    public  T[] postOrder(Node node, List<T> list){
        if(node != null){
            if(node.getLeft() != null) {
                Node left = node.getLeft();
                list.add((T)left.getValue());
                preOrder(left.getLeft(), list);
            }
            if(node.getRight() != null){
                Node right = node.getRight();
                list.add((T)right.getValue());
                preOrder(right.getRight(), list);
            }
            list.add((T)node.getValue());
        } else {
            System.out.println("The tree is empty");
        }
        return (T[])list.toArray();
    }

}
