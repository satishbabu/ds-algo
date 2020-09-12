import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {
    @Test
    void queueDequeue() {
        Queue<String> names = new Queue<>();
        names.enqueue("Satish");
        assertEquals("Satish", names.dequeue());
    }

    @Test
    void queueDequeueTwice() {
        QueueUsingStacks<String> names = new QueueUsingStacks<>();
        names.enqueue("Satish");
        names.enqueue("Babu");
        assertEquals("Satish", names.dequeue());
        assertEquals("Babu", names.dequeue());
    }

    @Test
    void queueDequeueMixedUp() {
        QueueUsingStacks<String> names = new QueueUsingStacks<>();
        names.enqueue("Satish");
        names.enqueue("Babu");
        names.enqueue("Kubi");
        names.enqueue("Aniketh");
        assertEquals("Satish", names.dequeue());
        assertEquals("Babu", names.dequeue());
        names.enqueue("Anika");
        names.enqueue("Mowgli");
        assertEquals("Kubi", names.dequeue());
        assertEquals("Aniketh", names.dequeue());
        assertEquals("Anika", names.dequeue());
        assertEquals("Mowgli", names.dequeue());
    }

    @Test
    void queueDequeueInteger() {
        Queue<Integer> names = new Queue<>();
        names.enqueue(5);
        assertEquals(5, names.dequeue());
    }

}