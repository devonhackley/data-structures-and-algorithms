package challenges.graph;


import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Graph<T> {
    private HashSet<Node<T>> vertices;

    public HashSet<Node<T>> getVertices() {
        return vertices;
    }

    public void setVertices(HashSet<Node<T>> vertices) {
        this.vertices = vertices;
    }

    public Graph(){
        this.vertices = new HashSet<>();
    }

    public Node<T>addNode(T data){
        Node node = new Node(data);
        this.vertices.add(node);
        return node;
    }

    public void addEdge(Node<T> node, Node<T> target){
        if(this.vertices.contains(node) && this.vertices.contains(target)){
            this.vertices.add(node);
            this.vertices.add(target);
        }
    }

    public HashSet<Node<T>>getNodes(){
        return this.vertices;
    }

    public HashSet<Node> getNeighbors(Node<T> node){
        return node.getNeighbors();
    }

    public int getSize(){
        return this.vertices.size();
    }

    public LinkedList<Node> breadthFirstTraversal(Node<T> start){
        LinkedList<Node> result = new LinkedList<>();
       LinkedList<Node> visited = new LinkedList<>();
        Queue queue  = new LinkedList();

        //add start node

        queue.add(start);
        visited.add(start);

        while(queue.size() != 0){
            Node node = (Node)queue.remove();
            result.add(node);
            for(Node neighbor:  (HashSet<Node>)node.getNeighbors()){
                if(!visited.contains(neighbor)){
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }

        return result;

    }


}
