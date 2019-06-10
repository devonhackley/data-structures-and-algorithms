package challenges;

import challenges.stacksandqueues.Stack;
import org.junit.Test;
import static org.junit.Assert.*;

public class StackTest {
    @Test public void testStackConstructor(){
        Stack libraryToTest = new Stack();
        assertNull(libraryToTest.getTop());
        assertEquals(0, libraryToTest.getLength());
    }

    @Test public void testStackPush(){
        Stack libraryToTest = new Stack();

        libraryToTest.push(3);
        assertEquals(1, libraryToTest.getLength());
        assertEquals(3, libraryToTest.getTop().value);
    }
    @Test public void testStackPushMultiple(){
        Stack libraryToTest = new Stack();

        libraryToTest.push(3);
        libraryToTest.push(4);
        libraryToTest.push(5);

        assertEquals(3, libraryToTest.getLength());
        assertEquals(5, libraryToTest.getTop().value);
    }

    @Test public void testStackPop(){
        Stack libraryToTest = new Stack();

        libraryToTest.push(3);
        libraryToTest.push(4);
        libraryToTest.push(5);
        assertEquals(3, libraryToTest.getLength());

        int popValue = libraryToTest.pop();
        assertEquals(5, popValue);
        assertEquals(2, libraryToTest.getLength());
        assertEquals(4, libraryToTest.getTop().value);
    }

    @Test public void testStackPopEmptyStack(){
        Stack libraryToTest = new Stack();

        libraryToTest.push(3);
        libraryToTest.push(4);
        libraryToTest.push(5);
        assertEquals(3, libraryToTest.getLength());

        libraryToTest.pop();
        libraryToTest.pop();
        libraryToTest.pop();
        assertEquals(0, libraryToTest.getLength());
        assertNull(libraryToTest.getTop());
    }

    @Test public void testStackPeek(){
        Stack libraryToTest = new Stack();

        libraryToTest.push(3);
        libraryToTest.push(4);
        libraryToTest.push(5);

        int peekVal = libraryToTest.peek();
        assertEquals(5, peekVal);
        assertEquals(3, libraryToTest.getLength());
    }



}
