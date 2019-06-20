package challenges.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
                inOrder(left.getLeft(), list);
            }
            list.add((T)node.getValue());
            if(node.getRight() != null){
                Node right = node.getRight();
                list.add((T)right.getValue());
                inOrder(right.getRight(), list);
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

    public void breadthFirstTraversal(){
       breadthTraversal(this.root);
    }

    private void breadthTraversal(Node node){
        Queue temp = new LinkedList<>() ;
        // add in root
        temp.add(node);

        // traversal thru tree
        while(temp.peek() != null){
            // "dequeue" front of queue and print value
            Node front = (Node)temp.remove();
            System.out.println(front.getValue());
            if(front.getLeft() != null){
                breadthTraversal(front.getLeft());
            }
            if(front.getRight() != null){
                breadthTraversal(front.getRight());
            }
        }
    }

    private int traverseForMax(Node node, int maxValue){
        if(node != null){
            if(node.getLeft() != null) {
                Node left = node.getLeft();
                if((int)left.getValue() > maxValue){
                    maxValue = (int)left.getValue();
                }
                traverseForMax(left.getLeft(), maxValue);
            }
            if((int)node.getValue() > maxValue){
                maxValue = (int)node.getValue();
            }
            if(node.getRight() != null){
                Node right = node.getRight();
                if((int)right.getValue() > maxValue){
                    maxValue = (int)right.getValue();
                }
                traverseForMax(right.getRight(), maxValue);
            }
        } else {
            System.out.println("The tree is empty");
        }
        return maxValue;
    }

    public int findMaxValue() {
        return traverseForMax(this.getRoot(), 0);
    }
}
