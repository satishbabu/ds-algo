import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    @Test
    void pushPop() {
        Stack<String> names = new Stack<>();
        names.push("first");
        assertEquals("first", names.pop());
    }

    @Test
    void pushPopTwice() {
        Stack<String> names = new Stack<>();
        names.push("first");
        names.push("last");
        assertEquals("last", names.pop());
        assertEquals("first", names.pop());
    }

    @Test
    void pushPopMixedUp() {
        Stack<String> names = new Stack<>();
        names.push("Satish");
        names.push("Babu");
        names.push("Kubi");
        names.push("Aniketh");
        assertEquals("Aniketh", names.pop());
        assertEquals("Kubi", names.pop());
        assertEquals("Babu", names.pop());
        assertEquals("Satish", names.pop());
        names.push("Anika");
        names.push("Mowgli");
        assertEquals("Mowgli", names.pop());
        assertEquals("Anika", names.pop());
    }

    @Test
    void queueDequeueInteger() {
        Stack<Integer> numbers = new Stack<>();
        numbers.push(5);
        assertEquals(5, numbers.pop());
    }
}