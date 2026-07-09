// Last updated: 7/9/2026, 3:12:23 PM
class MinStack {
    public Stack<Integer>stack;
    public Stack<Integer>mini;
    public MinStack() {
        stack = new Stack();
        mini = new Stack();
    }
    
    public void push(int val) {
        stack.push(val);
        if(mini.size()>0){
            val = Math.min(mini.peek(),val);
        }
        mini.push(val);
    }
    
    public void pop() {
        stack.pop();
        mini.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return mini.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */