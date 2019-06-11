package challenges.QueueWithStacks;

import org.junit.Test;
import static org.junit.Assert.*;

public class PsuedoQueueTest {
    @Test public void testQueueWithStacksConstructor(){
        PsuedoQueue libraryToTest = new PsuedoQueue();
        assertNotNull(libraryToTest.getStack1());
        assertNotNull(libraryToTest.getStack2());
    }

    @Test public void testQueueWithStacksEnqueue(){
        PsuedoQueue libraryToTest = new PsuedoQueue();
        libraryToTest.enqueue(2);
        assertEquals(2, libraryToTest.getStack1().getTop().value);
    }
    @Test public void testQueueWithStacksDequeue(){
        PsuedoQueue libraryToTest = new PsuedoQueue();
        libraryToTest.enqueue(2);
        assertEquals(2, libraryToTest.dequeue());
    }
}
