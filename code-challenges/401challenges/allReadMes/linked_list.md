# Singly Linked List
This read me contains information about the linked list coding challenge.

## Challenge
Implement a Singly linked list. And the following methods: insert, includes, print

## Approach & Efficiency
Went with a basic implementation. Insert is O(1), Includes O(n), and print is O(n)

## API
  ### Methods:
    * insert(int num): creates a new Node with the value passed in, and adds to list by reassigning head
    * includes(int num): traverses thru list and checks if passed in value is contained in a Node within the list
    * print(): traverse thru list and places each node into an arraylist. Returns that arraylist.

[Link to code](../src/main/java/challenges/linkedlist/LinkedList.java)

[Link to Test](../src/test/java/challenges/LinkedListTest.java)

