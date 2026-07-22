class StockSpanner {
    Stack<Integer> priceSt;
    Stack<Integer> spanSt;
    public StockSpanner() {
    priceSt=new Stack<>();
    spanSt=new Stack<>();
    }
    
    public int next(int price) {
        int span=1;
        while(!priceSt.isEmpty() && priceSt.peek()<=price){
            span+=spanSt.pop();
            priceSt.pop();
        }
        priceSt.push(price);
        spanSt.push(span);
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */