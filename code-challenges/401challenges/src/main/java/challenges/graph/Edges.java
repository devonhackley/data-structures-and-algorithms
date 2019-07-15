package challenges.graph;

public class Edges<T> {
    private int weight;
    private Node source;
    private Node target;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Node getSource() {
        return source;
    }

    public void setSource(Node source) {
        this.source = source;
    }

    public Node getTarget() {
        return target;
    }

    public void setTarget(Node target) {
        this.target = target;
    }

    public Edges(Node source, Node target, int weight){
        this.source = source;
        this.target = target;
        this.weight = weight;
    }
}
