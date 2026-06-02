import java.util.*;
class Solution {
    public static int sumDiffPairs(int[] arr, int k) {
       Arrays.sort(arr);
       int ans=0,n=arr.length;
       int i=n-1;
       for(i=n-1;i>0;i--){
           int dif=arr[i]-arr[i-1];
           if(dif<k){
               ans+=arr[i]+arr[i-1];
               i--;
           }
       }
       return ans;
    }
    public static void main(String args[]){
        int arr[]={3, 5, 10, 15, 17, 12, 9};
        int k=4;
        int ans=sumDiffPairs(arr,k);
        System.out.println(ans+" ");
    } 
}