class Solution {
    static final int MOD = 1000000007;

    public int countWays(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        long[][] dp = new long[n + 1][m + 1];

        // Empty target can be formed in 1 way
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j]) % MOD;
                } else {
                    dp[i][j] = dp[i - 1][j] % MOD;
                }
            }
        }

        return (int) dp[n][m];
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s1 = "rabbbit";
        String s2 = "rabbit";
        int result = solution.countWays(s1, s2);
        System.out.println("Number of distinct subsequences: " + result);
    }   
}