# Maximize Number of 1's

**Difficulty:** Medium | **Topics:** Sliding Window, Two Pointer, Arrays

Given a binary array `arr[]` containing only 0s and 1s and an integer `k`, you are allowed to flip at most `k` 0s to 1s. Find the maximum number of consecutive 1's that can be obtained in the array after performing the operation at most `k` times.

## Examples

### Example 1:

```
Input: arr[] = [1, 0, 1], k = 1
Output: 3
```

**Explanation:** By flipping the zero at index 1, we get the longest subarray from index 0 to 2 containing all 1's.

### Example 2:

```
Input: arr[] = [1, 0, 0, 1, 0, 1, 0, 1], k = 2
Output: 5
```

**Explanation:** By flipping the zeroes at indices 4 and 6, we get the longest subarray from index 3 to 7 containing all 1's.

### Example 3:

```
Input: arr[] = [1, 1], k = 2
Output: 2
```

**Explanation:** Since the array is already having the max consecutive 1's, hence we don't need to perform any operation. Hence the answer is 2.

## Constraints:

- 1 ≤ arr.size() ≤ 10^5
- 0 ≤ k ≤ arr.size()
- 0 ≤ arr[i] ≤ 1

## Expected Complexities

- **Time Complexity:** O(n)
- **Auxiliary Space:** O(1)

## Solution Approach

### Key Insight:

The problem is equivalent to finding the longest subarray that contains at most `k` zeros. We can use the sliding window technique to solve this efficiently.

### Algorithm:

1. **Use two pointers** (left and right) to maintain a sliding window
2. **Expand the window** by moving the right pointer
3. **Count zeros** in the current window
4. **Shrink the window** from the left when zeros count exceeds `k`
5. **Track the maximum window size** throughout the process

### Why This Works:

- We're looking for the longest subarray with at most `k` zeros
- After flipping those zeros, the entire subarray becomes all 1's
- The sliding window maintains the constraint of at most `k` zeros
- The maximum window size gives us the answer

## Company Tags

- Accolite
- Amazon
- Microsoft
- MakeMyTrip

## Topic Tags

- Arrays
- Data Structures
- Binary Search
- Sliding Window
- Two Pointer Algorithm

## Problem Category

- Sliding Window
- Array Manipulation
- Optimization Problems

## Difficulty

Medium
