import java.util.*;
class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
       ArrayList<Integer>s1=new ArrayList<Integer>();
       Stack<Integer>st=new Stack<>();
       for(int i=0;i<arr.length;i++){
           while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
               st.pop();
           }
           if(st.isEmpty())s1.add(i+1);
           else s1.add(i-st.peek());
           st.push(i);
       }
       return s1;
    }
    public static void main(String args[]){
        Solution s=new Solution();
        int arr[]={100,80,60,70,60,75,85};
        ArrayList<Integer> result=s.calculateSpan(arr);
        for(int val:result){
            System.out.print(val+" ");
        }
    }
}