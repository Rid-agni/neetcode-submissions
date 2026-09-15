class Solution {
    public int evalRPN(String[] tokens) {
        Deque <Integer> s= new ArrayDeque<>();
      for(String t:tokens){
        if(!t.equals("+") && !t.equals("-") && !t.equals("*") && !t.equals("/")){
                s.push(Integer.parseInt(t));
      }else{
        int f=s.pop();
        int sec=s.pop();
        int ans;
        switch(t){
            case "+":
            ans=sec+f;
            break;
            case "-":
            ans= sec-f;
            break;
            case "*":
            ans=sec*f;
            break;
            default:
            ans=sec/f;
        }
        s.push(ans);
      }  
    }
    return s.peek();
    }
}
