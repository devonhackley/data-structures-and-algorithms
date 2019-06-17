package challenges.tree;


import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearchTree extends BinaryTree{
    private Node root;

    public Node getRoot() {
        return root;
    }


    public BinarySearchTree(){ this.root = null; }
    public BinarySearchTree(int value) {
        this.root = new Node(value);
    }

    private Node addValue(Node node, int value){
      if(node == null){
          return new Node(value);
      }
      if(value < (int)node.getValue()){
          node.setLeft(this.addValue(node.getLeft(), value));
      } else if(value > (int)node.getValue()) {
          node.setRight(this.addValue(node.getRight(), value));
      } else {
          return node;
      }
      return node;
    }

    public void add(int value){
        this.addValue(this.root, value);
    }

    private boolean isContained(Node node, int value){
        boolean contained = false;
        if(node == null){
            return contained;
        }
        if(value == (int)node.getValue()){
            contained = true;
        }
        if(value < (int)node.getValue()){
           contained = isContained(node.getLeft(), value);
        } else if(value > (int)node.getValue()){
            contained = isContained(node.getRight(),value);
        }
        return contained;
    }

    public boolean contains(int value){
        return isContained(this.root, value);
    }

    @Override
    public String toString(){
        return Arrays.toString(this.preOrder(this.getRoot(), new ArrayList()));
    }

}
