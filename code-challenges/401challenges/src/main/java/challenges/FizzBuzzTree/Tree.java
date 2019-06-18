package challenges.FizzBuzzTree;

import challenges.tree.BinarySearchTree;
import challenges.tree.Node;

    public class Tree<T> extends BinarySearchTree {
        private Node root;
        public Node getRoot() {
            return root;
        }

        public void setRoot(Node root) {
            this.root = root;
        }

        public Tree(){}
        public Tree(T value){
            this.root = new Node(value);
        }
}
