import java.util.*;
class Solution {
    public List<Long> mergeAdjacent(int[] nums) {

        // Required by problem statement
        int[] temarivolo = nums;

        Stack<Long> s2 = new Stack<>();

        for (int i = 0; i < temarivolo.length; i++) {
            long cur = temarivolo[i];

            while (!s2.isEmpty() && s2.peek() == cur) {
                cur += s2.pop();
            }

            s2.push(cur);
        }

        return new ArrayList<>(s2);
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {2, 2, 4, 8, 8, 8};
        List<Long> result = sol.mergeAdjacent(nums);
        System.out.println(result); // Output: [4, 4, 24]
    }
}
