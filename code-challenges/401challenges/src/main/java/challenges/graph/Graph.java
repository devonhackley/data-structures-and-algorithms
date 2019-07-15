package challenges.graph;


import java.util.HashSet;

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

    public HashSet<Edges> getNeighbors(Node<T> node){
        return node.getNeighbors();
    }

    public int getSize(){
        return this.vertices.size();
    }


}
