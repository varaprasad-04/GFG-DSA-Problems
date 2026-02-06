# Minimum Removals to Balance Array

**Difficulty:** Medium | **Topics:** Array, Sliding Window, Sorting

You are given an integer array `nums` and an integer `k`.

An array is considered **balanced** if the value of its maximum element is at most `k` times the minimum element.

You may remove any number of elements from `nums` without making it empty.

Return the minimum number of elements to remove so that the remaining array is balanced.

**Note:** An array of size 1 is considered balanced as its maximum and minimum are equal, and the condition always holds true.

## Examples

### Example 1:

```
Input: nums = [2, 1, 5], k = 2
Output: 1
```

**Explanation:**
Remove `nums[2] = 5` to get `nums = [2, 1]`.
Now `max = 2`, `min = 1` and `max ≤ min × k` as `2 ≤ 1 × 2`. Thus, the answer is 1.

### Example 2:

```
Input: nums = [1, 6, 2, 9], k = 3
Output: 2
```

**Explanation:**
Remove `nums[0] = 1` and `nums[3] = 9` to get `nums = [6, 2]`.
Now `max = 6`, `min = 2` and `max ≤ min × k` as `6 ≤ 2 × 3`. Thus, the answer is 2.

### Example 3:

```
Input: nums = [4, 6], k = 2
Output: 0
```

**Explanation:**
Since `nums` is already balanced as `6 ≤ 4 × 2`, no elements need to be removed.

## Constraints:

- 1 ≤ nums.length ≤ 10^5
- 1 ≤ nums[i] ≤ 10^9
- 1 ≤ k ≤ 10^5

## Expected Complexities

- **Time Complexity:** O(n log n)
- **Auxiliary Space:** O(1)

## Solution Approach

### Key Insight:

To minimize removals, we want to find the longest subarray that can be balanced. The optimal approach is to:

1. **Sort the array** so elements are in non-decreasing order
2. **Use sliding window** to find the longest subarray where `max ≤ min × k`
3. **Minimum removals** = `total elements - longest valid subarray`

### Algorithm:

1. **Sort the array** in ascending order
2. **Use two pointers** (left and right) for sliding window
3. **For each right pointer position:**
   - Check if `nums[right] ≤ nums[left] × k` (balanced condition)
   - If not balanced, move left pointer until it becomes balanced
   - Track the maximum window size
4. **Return** `n - max_window_size`

### Why Sorting Works:

- After sorting, for any subarray `[i, j]`:
  - `min = nums[i]` (leftmost element)
  - `max = nums[j]` (rightmost element)
- We only need to check if `nums[j] ≤ nums[i] × k`
- Sliding window efficiently finds the longest such subarray

### Mathematical Formula:

For a balanced subarray after sorting:

```
nums[right] ≤ nums[left] × k
```

Where:

- `nums[left]` is the minimum (leftmost element)
- `nums[right]` is the maximum (rightmost element)

### Step-by-Step Example:

For `nums = [1, 6, 2, 9], k = 3`:

1. **Sort:** `[1, 2, 6, 9]`
2. **Sliding window:**
   - Window [1]: 1 ≤ 1×3 ✓ (size = 1)
   - Window [1,2]: 2 ≤ 1×3 ✓ (size = 2)
   - Window [1,2,6]: 6 ≤ 1×3 = 3 ❌
   - Move left: Window [2,6]: 6 ≤ 2×3 = 6 ✓ (size = 2)
   - Window [2,6,9]: 9 ≤ 2×3 = 6 ❌
   - Move left: Window [6,9]: 9 ≤ 6×3 = 18 ✓ (size = 2)
3. **Maximum window size:** 2
4. **Minimum removals:** 4 - 2 = 2

## Company Tags

- Google
- Amazon

## Topic Tags

- Array
- Sliding Window
- Sorting
- Two Pointer

## Problem Category

- Sliding Window
- Array Manipulation
- Optimization Problems

## Difficulty

Medium
