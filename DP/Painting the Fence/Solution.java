class Solution {
    public int countWays(int n, int k) {
        if (n == 1) return k;

        int same = k;
        int diff = k * (k - 1);

        for (int i = 3; i <= n; i++) {
            int newSame = diff;
            int newDiff = (same + diff) * (k - 1);

            same = newSame;
            diff = newDiff;
        }

        return same + diff;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 3, k = 2;
        System.out.println(solution.countWays(n, k)); // Output: 6
    }
}