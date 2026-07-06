class Solution {
    public int minFallingPathSum(int[][] grid) {
        int n=grid.length;
        int dp[][]=new int[n][n];
        for(int i=0;i<n;i++){
            dp[0][i]=grid[0][i];
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                int ele=grid[i][j],min=Integer.MAX_VALUE;
                for(int k=0;k<n;k++){
                    if(k!=j){
                        min=Math.min(min,ele+dp[i-1][k]);
                    }
                }
                dp[i][j]=min;
            }
        }
        int ans=Integer.MAX_VALUE;
        for(int j=0;j<n;j++){
            ans=Math.min(ans,dp[n-1][j]);
        }
        return ans;
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        int[][] grid={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(s.minFallingPathSum(grid));
    }   
}