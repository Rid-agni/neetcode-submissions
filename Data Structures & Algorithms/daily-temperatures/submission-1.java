class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
       Deque <Integer> s=new ArrayDeque<>();
       int n=temperatures.length;
       //int c=0;
       int prevInd=0;
       int[] arr= new int[n];
    for(int i=0;i<n;i++){
     while (!s.isEmpty() && temperatures[i]>temperatures[s.peek()]){
        prevInd=s.pop();
        arr[prevInd]=i-prevInd;
     }
     s.push(i);
     }
    return arr; 
    }
}
