import java.util.*;
class Solution {
    public static ArrayList<Integer> max_three(int[] arr,int k){
         ArrayList<Integer>s2=new ArrayList<>();
        Deque<Integer> dq=new LinkedList<>();
        int n=arr.length;
          for(int i=0;i<k;i++){
            while(!dq.isEmpty() && arr[dq.peekLast()]<=arr[i]){
                dq.removeLast();
            }
            dq.addLast(i);
          }
          s2.add(arr[dq.peekFirst()]);
          for(int i=k;i<n;i++){
            while(!dq.isEmpty() &&dq.peekFirst()<=i-k){
                dq.removeFirst();    
            }
             while(!dq.isEmpty() && arr[dq.peekLast()]<=arr[i]){
                dq.removeLast();
            }
            dq.addLast(i);
           s2.add(arr[dq.peekFirst()]);
          }
        return s2;
    }
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
       ArrayList<Integer>s1=new ArrayList<>();
       s1=max_three(arr,k);
      
     return s1;
       
    }
    public static void main(String args[]){
        Solution s=new Solution();
        int arr[]={1,3,-1,-3,5,3,6,7};
        int k=3;
        ArrayList<Integer> result=s.maxOfSubarrays(arr,k);
        System.out.println(result);
    }
}