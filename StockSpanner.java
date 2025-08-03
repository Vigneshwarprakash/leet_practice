class StockSpanner {
    class pair {
        int price;
        int span;

        pair(int price, int span) {
            this.price = price;
            this.span = span;
        }
    }
    Stack<pair> s = new Stack<>();
    public StockSpanner() {
        
    }
    
    public int next(int price) {
        int span = 1;
        while(!s.isEmpty() && s.peek().price <= price) {
            span += s.peek().span;
            s.pop();
        }
        pair p = new pair(price, span);
        s.push(p);

        return s.peek().span;
    }
}