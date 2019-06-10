package challenges.stacksandqueues;

public class Queue {
    private Node front;
    private Node back;
    private int size;

    public Node getFront() {
        return front;
    }

    public void setFront(Node front) {
        this.front = front;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Node getBack() {
        return back;
    }

    public void setBack(Node back) {
        this.back = back;
    }

    public Queue(){
        this.front = null;
        this.back = null;
        this.size = 0;
    }

    public void enqueue(int value){
        try
        {
            Node node = new Node(value);
            node.next = null;
            if(this.front == null){
                this.front = node;
                this.back = node;
                this.size++;
            } else {
                Node last = this.back;
                last.next = node;
                this.back = node;
                this.size++;
            }

        } catch(IllegalArgumentException ex){
            System.out.println("You either didn't pass anything in or you didn't pass in an Integer");
        }
    }

    public int dequeue(){
        if(this.front == null){
            return 0;
        } else {
            Node curr = this.front;
            Node temp = this.front.next;
            this.front = temp;
            this.size--;
            return curr.value;
        }
    }

    public int peek(){
        if(this.front == null){
            return 0;
        } else {
            return this.front.value;
        }
    }

}
