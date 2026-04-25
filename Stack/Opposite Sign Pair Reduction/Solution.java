import java.util.*;

class Solution {
    public ArrayList<Integer> reducePairs(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int num : arr) {
            boolean removed = false;

            while (!stack.isEmpty()) {
                int top = stack.peek();

                // Check if signs are opposite
                if ((top > 0 && num < 0) || (top < 0 && num > 0)) {

                    if (Math.abs(top) == Math.abs(num)) {
                        // Both cancel
                        stack.pop();
                        removed = true;
                        break;
                    } 
                    else if (Math.abs(top) > Math.abs(num)) {
                        // Current element is destroyed
                        removed = true;
                        break;
                    } 
                    else {
                        // Stack top is destroyed
                        stack.pop();
                        continue;
                    }
                } 
                else {
                    // Same sign → no operation
                    break;
                }
            }

            if (!removed) {
                stack.push(num);
            }
        }

        return new ArrayList<>(stack);
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {5, -5, 10, -10, 15, -20};
        ArrayList<Integer> result = sol.reducePairs(arr);
        System.out.println(result); // Output: [15, -20]
    }
}