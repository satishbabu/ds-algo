import java.util.Stack;

public class QueueUsingStacks<T> {
    private Stack<T> stackPut = new Stack<>();
    private Stack<T> stackGet = new Stack<>();

    public void enqueue(T value) {
        stackPut.push(value);
    }

    public T dequeue() {
        if(stackGet.isEmpty()) {
            transferElements();
            if(stackGet.isEmpty()) {
                throw new IllegalStateException("No more elements left to dequeue");
            }
        }
        return stackGet.pop();
    }

    private void transferElements() {
        while(!stackPut.isEmpty()) {
            stackGet.push(stackPut.pop());
        }
    }
}
