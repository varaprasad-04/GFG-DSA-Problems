class Solution {
    public int maxProductPath(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        long[][] maxDp = new long[m][n];
        long[][] minDp = new long[m][n];

        // Base case
        maxDp[0][0] = grid[0][0];
        minDp[0][0] = grid[0][0];

        // First row (only left)
        for (int j = 1; j < n; j++) {
            maxDp[0][j] = maxDp[0][j - 1] * grid[0][j];
            minDp[0][j] = minDp[0][j - 1] * grid[0][j];
        }

        // First column (only top)
        for (int i = 1; i < m; i++) {
            maxDp[i][0] = maxDp[i - 1][0] * grid[i][0];
            minDp[i][0] = minDp[i - 1][0] * grid[i][0];
        }

        // Fill the DP table
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {

                long val = grid[i][j];

                long topMax = maxDp[i - 1][j];
                long topMin = minDp[i - 1][j];

                long leftMax = maxDp[i][j - 1];
                long leftMin = minDp[i][j - 1];

                long a = topMax * val;
                long b = topMin * val;
                long c = leftMax * val;
                long d = leftMin * val;

                maxDp[i][j] = Math.max(Math.max(a, b), Math.max(c, d));
                minDp[i][j] = Math.min(Math.min(a, b), Math.min(c, d));
            }
        }

        long result = maxDp[m - 1][n - 1];

        if (result < 0) return -1;

        return (int)(result % 1000000007);
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int grid[][] = {{1,-2,1},{1,-2,1},{3,-4,1}};
        int result = s.maxProductPath(grid);
        System.out.println(result);
    }
}