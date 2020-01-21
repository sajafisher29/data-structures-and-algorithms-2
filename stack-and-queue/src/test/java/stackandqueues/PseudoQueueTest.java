package stackandqueues;

import org.junit.*;

import static org.junit.Assert.*;

public class PseudoQueueTest {

    @Test
    public void enqueue() {
    PseudoQueue suzyQ = new PseudoQueue();
    suzyQ.enqueue(1);
    suzyQ.enqueue(2);
    int actual = suzyQ.dequeue();
        System.out.println(actual);
    assertEquals("Should follow first in first out",1,actual);
    }
    @Test
    public void enqueueTwo(){
        PseudoQueue suzyQ = new PseudoQueue();
        suzyQ.enqueue(4);
        suzyQ.enqueue(3);
        suzyQ.enqueue(2);
        suzyQ.enqueue(1);
        assertEquals("Should follow first in first out",4,suzyQ.dequeue());
    }

    @Test
    public void dequeue() {
        PseudoQueue suzyQ = new PseudoQueue();
        suzyQ.enqueue(4);
        assertEquals("Should return the only value in Pseudo Queue",4,suzyQ.dequeue());
    }
}