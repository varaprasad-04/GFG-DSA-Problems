class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int maxDist = 0;

        // Scenario 1: Distance from the first house to the furthest different color from the right
        for (int i = n - 1; i > 0; i--) {
            if (colors[0] != colors[i]) {
                maxDist = Math.max(maxDist, i);
                break; 
            }
        }

        // Scenario 2: Distance from the last house to the furthest different color from the left
        for (int i = 0; i < n - 1; i++) {
            if (colors[n - 1] != colors[i]) {
                maxDist = Math.max(maxDist, (n - 1) - i);
                break;
            }
        }

        return maxDist;
    }
}