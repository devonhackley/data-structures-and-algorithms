# Stack and Queues
This read me contains information about my stack and queue implementation.

## Challenge
Implement a stack and queue and various methods:
    * Stack: peek, pop, push
    * Queue: peek, dequeue, enqueue

## Approach & Efficiency
Stack:
 * Peek: 
     * Time: O(1) Space: O(1)
 * Pop: 
     * Time: O(1) Space: O(1)
 * Push: 
     * Time: O(1) Space: O(1)
    
 Queue: 
 * Peek: 
     * Time: O(1) Space: O(1)
 * Dequeue: 
     * Time: O(1) Space: O(1)
 * Enqueue: 
     * Time: O(1) Space: O(1) 

## API
  ### Methods:
  Stack:
* peek(): does not take an argument and returns the value of the node located on top of the stack, without removing it from the stack.
* pop():  removes the node from the top of the stack, and returns the node’s value
* push(int num): which takes any value as an argument and adds a new node with that value to the top of the stack

Queue:
* peek(): does not take an argument and returns the value of the node located in the front of the queue, without removing it from the queue.
* dequeue(): does not take any argument, removes the node from the front of the queue, and returns the node’s value.
* enqueue(int num): which takes any value as an argument and adds a new node with that value to the back of the queue


[Link to Stack Code](../src/main/java/challenges/stacksandqueues/Stack.java)
[Link to Stack Test](../src/test/java/challenges/StackTest.java)

[Link to Queue Code](../src/main/java/challenges/stacksandqueues/Queue.java)
[Link to Queue Test](../src/test/java/challenges/QueueTest.java)


