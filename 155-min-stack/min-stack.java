import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;
class MinStack {
    private ArrayDeque<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        
        stack = new ArrayDeque<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.addLast(val);

        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        } return;
    }

    public void pop() {
        if (stack.isEmpty()) {
            return;
        }

        int removed = stack.removeLast();

        if (removed == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.getLast();
    }

    public int getMin() {
        return minStack.peek();
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