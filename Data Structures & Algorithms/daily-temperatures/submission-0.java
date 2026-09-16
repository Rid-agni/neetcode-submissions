class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
       //Deque <Integer> s=new ArrayDeque<>();
       int n=temperatures.length;
       int c=0;
       int[] arr= new int[n];
    for( int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(temperatures[i]<temperatures[j]){
             arr[i]=j-i;
             break;
            }
        }
    }
    return arr; 
    }
}
