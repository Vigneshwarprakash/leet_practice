class MinStack {
    Stack<Long> s = new Stack<>();
    long minEle;
    public void push(int val) {
        if (s.isEmpty()) { s.push((long)val); minEle = val; }
        else if (val < minEle) { s.push(2L*val - minEle); minEle = val; }
        else s.push((long)val);
    }
    public void pop() {
        long t = s.pop();
        if (t < minEle) minEle = 2*minEle - t;
    }
    public int top() {
        long t = s.peek();
        return t < minEle ? (int)minEle : (int)t;
    }
    public int getMin() { return (int)minEle; }
}