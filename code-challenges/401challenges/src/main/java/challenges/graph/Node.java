package challenges.graph;

import java.util.HashSet;

public class Node<T> {
    private T data;
    private HashSet<Node> neighbors;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public HashSet<Node> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(HashSet<Node> neighbors) {
        this.neighbors = neighbors;
    }

    public Node(T data){
        this.data = data;
        this.neighbors = new HashSet();
    }

}
