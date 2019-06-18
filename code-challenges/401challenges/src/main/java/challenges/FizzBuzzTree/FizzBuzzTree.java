package challenges.FizzBuzzTree;

import challenges.tree.Node;

public class FizzBuzzTree {

    ///////// Helper methods
    private boolean isDivisible(int num, int num2){
        return num % num2 == 0;
    }

    private void checkNode(Node node){
        if(isDivisible((int)node.getValue(), 3) && isDivisible((int)node.getValue(), 5)){
            node.setValue("FizBuzz");
        } else if(isDivisible((int)node.getValue(), 3)){
            node.setValue("Fizz");
        }  else if(isDivisible((int)node.getValue(), 5)){
            node.setValue("Buzz");
        }
    }

    private Node traveseThruNodes(Node node){
        if(node != null){
            checkNode(node);
            if(node.getLeft() != null) {
                Node left = node.getLeft();
                checkNode(left);
                traveseThruNodes(left.getLeft());
            }
            if(node.getRight() != null){
                Node right = node.getRight();
                checkNode(right);
                traveseThruNodes(right.getRight());
            }
        } else {
            System.out.println("The tree is empty");
        }
        return node;
    }
    ////////////

    public void FizzBuzzTree(Tree tree) throws NullPointerException {
       if(tree.getRoot() != null){
          checkNode(tree.getRoot());
          if(tree.getRoot().getLeft() != null){
              traveseThruNodes(tree.getRoot().getLeft());
          }
          if(tree.getRoot().getRight() != null){
              traveseThruNodes(tree.getRoot().getRight());
          }
       }

    }
}
