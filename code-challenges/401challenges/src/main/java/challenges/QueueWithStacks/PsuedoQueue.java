package challenges.QueueWithStacks;

import challenges.stacksandqueues.Stack;

public class PsuedoQueue {
    protected Stack stack1;
    protected Stack stack2;

    public PsuedoQueue() {
        this.stack1 = new Stack();
        this.stack2 = new Stack();
    }

    public Stack getStack1() {
        return stack1;
    }

    public void setStack1(Stack stack1) {
        this.stack1 = stack1;
    }

    public Stack getStack2() {
        return stack2;
    }

    public void setStack2(Stack stack2) {
        this.stack2 = stack2;
    }



    public void enqueue(int value){
        this.stack1.push(value);
    }

    public int dequeue(){
       try{
           while(this.stack1.getTop() != null){
               this.stack2.push(this.stack1.pop());
           }
           // take value from the "back"
           int top = this.stack2.pop();

           while(this.stack2.getTop() != null ){
               // grab all values from stack 2 and add to stack1(queue)
               this.stack1.push(this.stack2.pop());
           }
           return top;
       } catch (NullPointerException ex){
            System.out.println("The stack is empty");
            return -1;
       }
    }
}
