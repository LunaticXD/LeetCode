
import java.util.ArrayDeque;
import java.util.Deque;
class MinStack {
    private ArrayDeque<Integer> stack;
    private ArrayDeque<Integer> minStack;

    public MinStack() {
        
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }

    public void push(int val) {
        stack.addLast(val);

        if (minStack.isEmpty() || val <= minStack.getLast()) {
            minStack.addLast(val);
        } return;
    }

    public void pop() {
        if (stack.isEmpty()) {
            return;
        }

        int removed = stack.removeLast();

        if (removed == minStack.getLast()) {
            minStack.removeLast();
        }
    }

    public int top() {
        return stack.getLast();
    }

    public int getMin() {
        return minStack.getLast();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */