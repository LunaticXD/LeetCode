import java.util.ArrayDeque;
import java.util.Deque;

class MyStack {

    private Deque<Integer> myStack;

    public MyStack() {
        myStack = new ArrayDeque<>();
    }

    public void push(int x) {
        myStack.addLast(x);
    }

    public int pop() {
        if (myStack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return myStack.removeLast();
    }

    public int top() {
        if (myStack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return myStack.getLast();
    }

    public boolean empty() {
        return myStack.isEmpty();
    }
}