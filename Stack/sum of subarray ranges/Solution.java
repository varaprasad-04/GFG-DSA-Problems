


import java.util.*;
class Solution {
     public static int largest(int[] arr){
         int n=arr.length;
        int[] pg=new int[n];
        int[] ng=new int[n];
        int sum=0;
        Stack<Integer>s1=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!s1.isEmpty() && arr[s1.peek()]<=arr[i]){
                s1.pop();
            }
            ng[i] = s1.isEmpty() ? n : s1.peek();

            s1.push(i);
        }
         Stack<Integer>s2=new Stack<>();
         for(int i=0;i<n;i++){
            while(!s2.isEmpty() && arr[s2.peek()]<arr[i]){
                s2.pop();
            }
            pg[i] = s2.isEmpty() ? -1: s2.peek();

            s2.push(i);
        }
        for(int i=0;i<n;i++){
            int left=i-pg[i];
            int right=ng[i]-i;
            sum+=(left*right)*arr[i];
        }
        return sum;
        
    }
    public static int smallest(int[] arr){
         int n=arr.length;
        int[] ps=new int[n];
        int[] ns=new int[n];
        int sum=0,k=0;
        Stack<Integer>s1=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!s1.isEmpty() && arr[s1.peek()]>=arr[i]){
                s1.pop();
            }
            ns[i] = s1.isEmpty() ? n : s1.peek();

            s1.push(i);
        }
         Stack<Integer>s2=new Stack<>();
         for(int i=0;i<n;i++){
            while(!s2.isEmpty() && arr[s2.peek()]>arr[i]){
                s2.pop();
            }
            ps[i] = s2.isEmpty() ? -1: s2.peek();

            s2.push(i);
        }
        for(int i=0;i<n;i++){
            int left=i-ps[i];
            int right=ns[i]-i;
            sum+=(left*right)*arr[i];
        }
        return sum;
        
    }
    public int subarrayRanges(int[] arr) {
       
       int small=smallest(arr);
       int large=largest(arr);
       
       return large-small;
    }
    public static void main(String args[]){
        Solution s=new Solution();
        int arr[]={1,2,3};
        int result=s.subarrayRanges(arr);
        System.out.println(result);
    }
}
