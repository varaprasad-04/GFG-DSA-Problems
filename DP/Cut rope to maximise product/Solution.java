import java.util.Arrays;
class Solution {

    int[] dp;

    int solve(int n) {
        if (n == 1) return 1;

        if (dp[n] != -1) return dp[n];

        int ans = 0;

        for (int i = 1; i < n; i++) {
            ans = Math.max(
                ans,
                i * Math.max(n - i, solve(n - i))
            );
        }

        return dp[n] = ans;
    }

    int maxProduct(int n) {
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return solve(n);
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 5;
        System.out.println("Maximum product for rope length " + n + " is: " + solution.maxProduct(n));
    }   
}