import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    LinkedList<Integer> list = new LinkedList<>();

    @Test
    void addFront() {
        list.addFront(1);
        list.addFront(2);
        list.addFront(3);

        assertEquals(3, list.getFirst());
    }

    @Test
    void addBack() {
        list.addBack(1);
        list.addBack(2);
        list.addBack(3);

        assertEquals(1, list.getFirst());
    }

    @Test
    void getLast() {
        list.addFront(1);
        list.addFront(2);
        list.addFront(3);

        assertEquals(1, list.getLast());
    }

    @Test
    void getFront() {
        list.addFront(1);
        assertEquals(1, list.getFirst());
    }

    @Test
    public void size() {
        assertEquals(0, list.size());
        list.addFront(1);
        assertEquals(1, list.size());
        list.addFront(2);
        assertEquals(2, list.size());
        list.addBack(3);
        assertEquals(3, list.size());
    }

    @Test
    public void clear() {
        list.addFront(1);
        list.addFront(2);
        list.addBack(3);
        list.clear();
        assertEquals(0, list.size());
        assertThrows(IllegalStateException.class,
                ()-> list.getFirst());
    }

    @Test
    public void DeleteVale() {
        list.addBack(1);
        list.addBack(2);
        list.addBack(3);
        list.deleteValue(2);

        assertEquals(2, list.size());
        assertEquals(1, list.getFirst());
        assertEquals(3, list.getLast());
    }

}