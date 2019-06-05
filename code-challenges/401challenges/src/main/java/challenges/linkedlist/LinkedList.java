package challenges.linkedlist;

import java.util.ArrayList;

public class LinkedList {
   public  Node head;
   public int length;

    public LinkedList(){
            this.head = null;
            this.length = 0;
    }
    public void insert(int data){
        try
        {
            Node node = new Node(data);
            node.next = null;
            if(this.head == null){
                this.head = node;
                this.length++;
            } else {
                Node current = this.head;
                node.next = current;
                this.head = node;
                this.length++;
            }

        }
        catch(IllegalArgumentException ex){
            System.out.println("You either didn't pass anything in or you didn't pass in an Integer");
        }


    }

    public boolean includes(int data){

        Node current = this.head;
        boolean isIncluded = false;
        try
        {
            while(current != null){
                if(current.data == data){
                    isIncluded = true;
                }
                current = current.next;
            }
        }
        catch (IllegalArgumentException ex)
        {
            System.out.println("You either didn't pass anything in or you didn't pass in an Integer");
        }
        return isIncluded;
    }

    public ArrayList print(){

        ArrayList nodeValues = new ArrayList();
        if(this.head == null) {
            System.out.println("The list is empty, please add items then print");
            return nodeValues;
        }
        Node current = this.head;

        while (current != null){
            nodeValues.add(current.data);
            current = current.next;
        }

        return nodeValues;
    }

    public void append(int data){
        try
        {
            Node node = new Node(data);
            if(this.head == null){
                this.head = node;
                this.length++;
            }else {
                Node current = this.head;
                while (current.next != null){
                    current = current.next;
                }
                current.next = node;
                this.length++;
            }
        }
        catch(IllegalArgumentException ex){
            System.out.println("You either didn't pass anything in or you didn't pass in an Integer");
        }
    }

    public void insertBefore(int beforeValue, int data){
        try
        {
            Node node = new Node(data);
            if(this.head == null){
                this.head = node;
                this.length++;
            }else {
                Node current = this.head;
                Node prev = null;
                while (current.next != null){
                    if(current == this.head && current.data == beforeValue){
                        node.next = current;
                        this.head = node;
                    } else if(current.data == beforeValue){
                        node.next = current;
                        if(prev != null) {
                            prev.next = node;
                        }
                        this.length++;
                    }
                    prev = current;
                    current = current.next;
                }
            }
        }
        catch(IllegalArgumentException ex){
            System.out.println("You either didn't pass anything in or you didn't pass in an Integer");
        }
    }

    public void insertAfter(int afterValue, int data){
        try
        {
            Node node = new Node(data);
            if(this.head == null){
                this.head = node;
                this.length++;
            }else {
                Node current = this.head;
                Node temp;
                while (current != null){
                    if(current.data == afterValue){
                        temp = current.next;
                        current.next = node;
                        current.next.next = temp;
                        this.length++;
                    }
                    current = current.next;
                }
            }
        }
        catch(IllegalArgumentException ex){
            System.out.println("You either didn't pass anything in or you didn't pass in an Integer");
        }
    }

    public int findNodeFromEnd(int num){
        if(this.head == null){
            return 0;
        } else if(num < 0) {
            throw new IllegalArgumentException("The number passed in was less than the list"); // num was greater than length of the list
        } else {
           Node current = this.head;
            int lengthOfList = 0;

            while(current != null){
                current = current.next;
                lengthOfList++; // grab length of the list
            }
            if(lengthOfList < num){
                throw new IllegalArgumentException("The number passed in was greater than the list"); // num was greater than length of the list
            }
            Node k = this.head;
            while(lengthOfList > num){
                k = k.next;
                lengthOfList--;
            }
            return k.data;
        }
    }


}

