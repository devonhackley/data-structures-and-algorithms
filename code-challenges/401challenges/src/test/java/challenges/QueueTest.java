package challenges;

import challenges.stacksandqueues.Queue;
import org.junit.Test;
import static org.junit.Assert.*;
public class QueueTest {
    @Test public void testQueueConstructors(){
        Queue libraryForQueue = new Queue();

        assertNull(libraryForQueue.getFront());
        assertEquals(0, libraryForQueue.getSize());
    }

    @Test public void testQueueEnqueue(){
        Queue libraryForQueue = new Queue();

        libraryForQueue.enqueue(3);

        assertEquals(1, libraryForQueue.getSize());
        assertEquals(3, libraryForQueue.getFront().value);
        assertEquals(3, libraryForQueue.getBack().value);
    }

    @Test public void testQueueEnqueueMultiple(){
        Queue libraryForQueue = new Queue();

        libraryForQueue.enqueue(3);
        libraryForQueue.enqueue(4);
        libraryForQueue.enqueue(5);
        libraryForQueue.enqueue(6);

        assertEquals(4, libraryForQueue.getSize());
        assertEquals(3, libraryForQueue.getFront().value);
        assertEquals(6, libraryForQueue.getBack().value);
    }

    @Test public void testQueueDequeue(){
        Queue libraryForQueue = new Queue();

        libraryForQueue.enqueue(3);
        libraryForQueue.enqueue(4);
        libraryForQueue.enqueue(5);
        libraryForQueue.enqueue(6);

        int deqVal = libraryForQueue.dequeue();
        assertEquals(3, deqVal);
        assertEquals(4, libraryForQueue.getFront().value);
        assertEquals(3, libraryForQueue.getSize());
    }
    @Test public void testQueueDequeueEmptyQueue(){
        Queue libraryForQueue = new Queue();

        libraryForQueue.enqueue(3);
        libraryForQueue.enqueue(4);
        libraryForQueue.enqueue(5);
        libraryForQueue.enqueue(6);

        libraryForQueue.dequeue();
        libraryForQueue.dequeue();
        libraryForQueue.dequeue();
        libraryForQueue.dequeue();
        assertNull(libraryForQueue.getFront());
        assertEquals(0, libraryForQueue.getSize());
    }

    @Test public void testQueuePeek(){
        Queue libraryForQueue = new Queue();
        libraryForQueue.enqueue(3);
        libraryForQueue.enqueue(4);
        libraryForQueue.enqueue(5);
        libraryForQueue.enqueue(6);

        int peekVal = libraryForQueue.peek();
        assertEquals(3, peekVal);
        assertEquals(4, libraryForQueue.getSize());
    }


}
