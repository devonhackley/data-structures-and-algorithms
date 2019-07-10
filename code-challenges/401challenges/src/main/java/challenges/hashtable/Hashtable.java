package challenges.hashtable;


import java.util.LinkedList;

public class Hashtable<T> {

    private static int INIT_SIZE = 10;
    private LinkedList<Node<T>>[] table;
    private int size;

    public static int getInitSize() {
        return INIT_SIZE;
    }

    public int getSize() {
        return size;
    }

    public Hashtable(){
        this.table = new LinkedList[INIT_SIZE];
        this.size = 0;
    }

    public Node<T> add(String key, T value){
        int index = hash(key);

        Node<T> newNode = new Node<>(key,value);

        if(this.table[index] == null){
            this.table[index] = new LinkedList<>();
        }

        this.table[index].add(newNode);
        this.size++;

        return newNode;
    }

    public T get(String key){
        int index = hash(key);

        if(this.table[index] != null) {
            for (Node node : this.table[index]) {
                if (node.getKey().equals(key)) {
                    return (T) node.getValue();
                }
            }
        }
        return null;
    }

    public boolean contains(String key){
        int index = hash(key);

        if(this.table[index] != null){
            for( Node node : this.table[index]){
                if(node.getKey().equals(key)){
                    return true;
                }
            }
        }
        return false;
    }

    public int hash(String key){
        return key.hashCode() % INIT_SIZE;
    }
}
