import java.util.Stack;
class Solution {
    public int maxPeople(int[] arr) {
      Stack<Integer>s1=new Stack<>();
      Stack<Integer>s2=new Stack<>();
      int n=arr.length;
      int[] pg=new int[n];
      int[] ng=new int[n];
      for(int i=n-1;i>=0;i--){
          while(!s1.isEmpty() && arr[s1.peek()]<arr[i]){
              s1.pop();
          }
          ng[i]=s1.isEmpty()?n:s1.peek();
          s1.push(i);
      }
      for(int i=0;i<n;i++){
          while(!s2.isEmpty() && arr[s2.peek()]<arr[i]){
              s2.pop();
          }
          pg[i]=s2.isEmpty()?-1:s2.peek();
          s2.push(i);
      }
      int ans=0;
      for(int i=0;i<n;i++){
          ans=Math.max(ans,(ng[i]-pg[i]-1));
      }
      return ans;
    }
    public static void main(String args[]){
        Solution s=new Solution();
        int arr[]={10,3,7,4,12,2};
        int result=s.maxPeople(arr);
        System.out.println(result);
    }
}
