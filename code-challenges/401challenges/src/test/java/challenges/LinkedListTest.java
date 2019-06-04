package challenges;

import challenges.linkedlist.LinkedList;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class LinkedListTest {
    @Test public void testLinkedListEmptyMethod(){
        LinkedList libraryForTest = new LinkedList();

        assertTrue("Method should create an empty linked list", libraryForTest.length == 0);
        assertTrue("Method should create an empty linked list, list's head should be null", libraryForTest.head == null);
    }

    @Test public void testLinkedListInsertMethod(){
        LinkedList libraryForTest = new LinkedList();

        libraryForTest.insert(10);

        assertTrue("Method should add a new Node with the value of 10 to the list", libraryForTest.length == 1);
        assertTrue("Method should create an empty linked list, list's head should be a node with the value of 10", libraryForTest.head.data == 10);


        // insert again to make sure head changes

        libraryForTest.insert(20);
        assertTrue("Method should add a new Node with the value of 10 to the list", libraryForTest.length == 2);
        assertTrue("Method should create an empty linked list, list's head should be null", libraryForTest.head.data == 20);
        assertTrue("Method should create an empty linked list, list's head should be null", libraryForTest.head.next.data == 10);
    }

    @Test public void testLinkedListIncludesMethod(){
        LinkedList libraryForTest = new LinkedList();

        libraryForTest.insert(10);
        libraryForTest.insert(20);
        libraryForTest.insert(30);
        libraryForTest.insert(40);

        assertTrue("Method should find the value in the list", libraryForTest.includes(30));
        assertFalse("Method should not find the value in the list", libraryForTest.includes(50));
    }

    @Test public void testLinkedListPrintMethod(){
        LinkedList libraryForTest = new LinkedList();

        libraryForTest.insert(10);
        libraryForTest.insert(20);
        libraryForTest.insert(30);
        libraryForTest.insert(40);

        ArrayList expected = new ArrayList(4);
        expected.add(40);
        expected.add(30);
        expected.add(20);
        expected.add(10);

        ArrayList actual = libraryForTest.print();

        assertTrue("Method should return a collection of node values", actual.size() == 4);
        assertEquals(actual, expected);
    }

    @Test public void testLinkedListAppendMethod(){
        LinkedList libraryForTest = new LinkedList();
        libraryForTest.insert(10);
        libraryForTest.insert(20);
        libraryForTest.append(30);

        assertTrue("Method should add 30 to end of list", libraryForTest.length == 3);
        assertTrue("Method should add 30 to end of list and new head should be 20", libraryForTest.head.data == 20);

        // add more to end

        libraryForTest.append(40);
        libraryForTest.append(50);

        assertTrue("This method should add nodes to end of list, new tail should be 50", libraryForTest.head.next.next.next.next.data == 50);
    }

    @Test public void testLinkedListInsertAfter(){
        LinkedList libraryForTest = new LinkedList();
        libraryForTest.insert(10);
        libraryForTest.insert(20);
        libraryForTest.insert(30);
        libraryForTest.insert(40);

        libraryForTest.insertAfter(40, 35);

        assertTrue("The method should insert the node with a value of 35 before the node with a value of 40", libraryForTest.head.next.data == 35);

        // insert after last node
        libraryForTest.insertAfter(10, 15);

        assertTrue("The method should add a Node with a value of 15 to the end of the list, or after the node with the value of 10", libraryForTest.head.next.next.next.next.next.data == 15);

        // insert to middle
        libraryForTest.insertAfter(30, 18);
        System.out.println(libraryForTest.print());
        assertTrue("The method should add a Node with a value of 18 after the middle node which is 30", libraryForTest.head.next.next.next.data == 18);

    }

    @Test public void testLinkedListInsertBefore(){
        LinkedList libraryForTest = new LinkedList();
        libraryForTest.insert(10);
        libraryForTest.insert(20);
        libraryForTest.insert(30);
        libraryForTest.insert(40);

        libraryForTest.insertBefore(30, 35);

        assertTrue("The method should insert the node with a value of 35 before the node with a value of 40", libraryForTest.head.next.data == 35);

        // insert before head
        libraryForTest.insertBefore(40, 22);
        assertTrue("The method should insert the node with a value of 35 before the node with a value of 40", libraryForTest.head.data == 22);
    }


}
