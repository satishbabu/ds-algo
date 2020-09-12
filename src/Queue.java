public class Queue<T> {
    Node<T> head = null;
    Node<T> tail = null;


    public void enqueue(T data) {
        Node<T> node = new Node<>(data);
        if(tail == null)
            head = node;
        else
            tail.next = node;

        tail = node;
    }

    public T dequeue() {
        if(head == null)
            throw new IllegalStateException("Queue is empty!!");

        T data = head.data;
        head = head.next;

        if(head == null)
            tail = null;

        return data;
    }

    private static class Node<T> {
        T data;
        Queue.Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }
}
