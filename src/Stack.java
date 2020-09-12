public class Stack<T> {
    private Node<T> head;

    public boolean isEmpty() {
        return head == null;
    }

    public T peek() {
        if(head == null) throw new IllegalStateException("Empty Stack!!");
        return head.data;
    }

    public void push(T data) {
        Node<T> node = new Node<>(data);
        node.next = head;
        head = node;
    }

    public T pop() {
        if(head == null) throw new IllegalStateException("Empty Stack!!");

        T data = head.data;
        head = head.next;
        return data;
    }

    private static class Node<T> {
        T data;
        Node<T> next;
        public Node(T data) {
            this.data = data;
        }
    }
}
