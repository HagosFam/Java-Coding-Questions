package concepts;

import java.util.EmptyStackException;
import java.util.Stack;

public class QueueUsingStack <T> {
    private Stack<T> stack;

    public void dequeue() {

    }

    public void enqueue(T c) {
        stack.push(c);
    }
}
