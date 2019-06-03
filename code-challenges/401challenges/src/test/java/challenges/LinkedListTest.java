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

}
