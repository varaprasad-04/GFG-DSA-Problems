class Solution {
    boolean subset(int arr[],int k){
        int n=arr.length;
        boolean dp[][]=new boolean[n][k+1];
        for(int i=0;i<n;i++)dp[i][0]=true;
         if (arr[0] <= k) dp[0][arr[0]]=true;
        for(int i=1;i<n;i++){
            for(int tar=1;tar<=k;tar++){
                boolean nottake=dp[i-1][tar];
                boolean take=false;
                if(arr[i]<=tar)take=dp[i-1][tar-arr[i]];
                dp[i][tar]=take || nottake;
            }
        }
        return dp[n-1][k];
    }
    public boolean isPossible(int[] arr, int s, int x) {
        int n=arr.length;
        int nums[]=new int[n+1];
        int sum=s;
        nums[0]=s;
        for(int i=0;i<n;i++){
            nums[i+1]=sum+arr[i];
            sum+=nums[i+1];
        }
        boolean check=subset(nums,x);
        return check;
    }
}