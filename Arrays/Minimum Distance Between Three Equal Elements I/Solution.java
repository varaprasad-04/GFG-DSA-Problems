import java.util.*; 
class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        // Step 1: store indices for each value
        for (int i = 0; i < nums.length; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        int ans = Integer.MAX_VALUE;

        // Step 2: check each value group
        for (List<Integer> list : map.values()) {
            if (list.size() < 3) continue;

            // Step 3: check consecutive triplets
            for (int i = 0; i <= list.size() - 3; i++) {
                int first = list.get(i);
                int third = list.get(i + 2);

                int dist = 2 * (third - first);
                ans = Math.min(ans, dist);
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, 2, 1, 3, 1};
        System.out.println(s.minimumDistance(nums)); // Output: 4
    }
}