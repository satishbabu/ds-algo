import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueUsingStacksTest {

    @Test
    void test_q_dq() {
        QueueUsingStacks<String> names = new QueueUsingStacks<>();
        names.enqueue("Satish");
        assertEquals("Satish", names.dequeue());
    }

    @Test
    void test_q_dq_twice() {
        QueueUsingStacks<String> names = new QueueUsingStacks<>();
        names.enqueue("Satish");
        names.enqueue("Babu");
        assertEquals("Satish", names.dequeue());
        assertEquals("Babu", names.dequeue());
    }

    @Test
    void test_q_dq_mixedup() {
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

}