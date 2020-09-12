public class LinkedList<T> {
    private Node<T> head;
    private int size = 0;


    public void addFront(T data) {
        Node<T> node = new Node<>(data);
        size++;

        if (head == null) {
            head = node;
            return;
        }

        node.next = head;
        head = node;
    }

    public void addBack(T data) {
        Node<T> node = new Node<>(data);
        size++;

        if (head == null) {
            head = node;
            return;
        }

        getLastNode().next = node;
    }

    public T getFirst() {
        if (head == null) {
            throw new IllegalStateException("Empty List!");
        }
        return head.data;
    }

    public T getLast() {
        if (head == null) {
            throw new IllegalStateException("Empty List!");
        }

        return getLastNode().data;
    }

    private Node<T> getLastNode() {
        Node<T> current = head;
        while(current.next != null) {
            current = current.next;
        }
        return current;
    }

    public int size() {
        return size;
    }

    public void deleteValue(T value) {
        if(head == null) {
            return;
        }

        if(head.data == value) {
            head = head.next;
            return;
        }

        Node<T> current = head;
        while(current.next != null) {
            if(current.next.data == value)
            {
                current.next = current.next.next;
                size--;
                return;
            }
            current = current.next;
        }
    }

    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    public void clear() {
        head = null;
        size = 0;
    }
}
