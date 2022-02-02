class Solution {

    private Stack<Integer> stack = new Stack<Integer>();
    private Stack<Integer> MinStack = new Stack<Integer>();

    public void push(int x) {
        if(stack.isEmpty() || MinStack.peek() > x)
            MinStack.push(x);
        else
            MinStack.push(MinStack.peek());
        
        stack.push(x);
    }

    public void pop() {
        if(stack.isEmpty())
            return;
        stack.pop();
        MinStack.pop();
    }

    public int top() {
        if(stack.isEmpty())
            return -1;
        return stack.peek();
    }

    public int getMin() {
        if(stack.isEmpty())
            return -1;
        return MinStack.peek();
    }
}
