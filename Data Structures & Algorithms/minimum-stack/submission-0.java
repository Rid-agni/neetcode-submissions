
class MinStack {
    Deque <Integer> s=new ArrayDeque<>();
    Deque <Integer> ms=new ArrayDeque<>(); 
    public MinStack() {
      
    }
    
    public void push(int val) {
     s.push(val);
        if(ms.isEmpty()||val<=ms.peek()){
            ms.push(val);
        }   
    }
    
    public void pop() {
      int tv=s.pop();
      if(!ms.isEmpty() && tv==ms.peek()){
        ms.pop();
      }   
    }
    
    public int top() {
     return s.peek();   
    }
    
    public int getMin() {
     return ms.peek();   
    }
}
