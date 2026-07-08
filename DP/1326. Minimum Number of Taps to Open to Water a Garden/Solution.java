class Solution {
    public int minTaps(int n, int[] ranges) {
        int dp[]=new int[n+1];
        for(int i=1;i<=n;i++){
            dp[i]=n+2;
        }
        for(int i=0;i<=n;i++){
            int s=Math.max(0,i-ranges[i]);
            int e=Math.min(i+ranges[i],n);
            int k=s;
            for(int j=s;j<=e;j++){
                dp[j]=Math.min(dp[j],dp[k]+1);
            }
        }
        if(dp[n]==n+2)return -1;
        return dp[n];
    }
}