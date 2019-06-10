package challenges.stacksandqueues;

public class Stack {
    private Node top;
    private int length;
    public Node getTop() {
        return top;
    }

    public void setTop(Node top) {
        this.top = top;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Stack(){
        this.top = null;
        this.length = 0;
    }


    public void push(int value){
        try
        {
            Node node = new Node(value);
            node.next = null;
            if(this.top == null){
                this.top = node;
                this.length++;
            } else {
                Node curr = this.top;
                node.next = curr;
                this.top = node;
                this.length++;
            }

        } catch (IllegalArgumentException ex){
            System.out.println("You either didn't pass anything in or you didn't pass in an Integer");
        }
    }

    public int pop(){
        if(this.top != null){
            Node curr = this.top;
            Node temp = this.top.next;
            this.top = temp;
            this.length--;
            return curr.value;
        } else {
            return 0;
        }
    }

    public int peek(){
        if(this.top != null){
            return this.top.value;
        } else {
            return 0;
        }
    }
}
