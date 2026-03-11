import java.util.*;
class Solution {
    public int sumSubMins(int[] arr) {
        int n=arr.length;
        Stack<Integer>s1=new Stack<>();
        int pse[]=new int[n];
        int nse[]=new int[n];
        for(int i=0;i<n;i++){
            while(!s1.isEmpty() && arr[s1.peek()]>arr[i]){
                s1.pop();
            }
            pse[i]=s1.isEmpty()?-1:s1.peek();
            s1.push(i);
        }
        s1.clear();
        for(int i=n-1;i>=0;i--){
            while(!s1.isEmpty() && arr[s1.peek()]>=arr[i]){
                s1.pop();
            }
            nse[i]=s1.isEmpty()?n:s1.peek();
            s1.push(i);
        }
        long sum=0;
        for(int i=0;i<n;i++){
            int left=i-pse[i];
            int right=nse[i]-i;
            sum+=(arr[i]*left*right);
        }
        return (int)sum;
    }
    public static void main(String[] args) {
        int arr[]={3,1,2,4};
        Solution s=new Solution();
        int result=s.sumSubMins(arr);
        System.out.println(result);
    }
}
