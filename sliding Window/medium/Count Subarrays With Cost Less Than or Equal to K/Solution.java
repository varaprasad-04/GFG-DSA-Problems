import java.util.*;
class Solution {
    public long countSubarrays(int[] nums, long k) {
       TreeMap<Integer, Integer> map = new TreeMap<>();
        long ans = 0;
        int l = 0;

        for (int r = 0; r < nums.length; r++) {
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);

            while ((long)(map.lastKey() - map.firstKey()) * (r - l + 1) > k) {
                map.put(nums[l], map.get(nums[l]) - 1);
                if (map.get(nums[l]) == 0) {
                    map.remove(nums[l]);
                }
                l++;
            }

            ans += (r - l + 1);
        }
        return ans;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 2, 3, 4, 5};
        long k = 10;
        System.out.println(sol.countSubarrays(nums, k));
    }
}