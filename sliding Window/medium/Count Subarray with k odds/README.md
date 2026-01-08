# Count Subarray with K Odds

You are given an array `arr[]` of positive integers and an integer `k`. You have to count the number of subarrays that contain exactly `k` odd numbers.

## Examples

### Example 1:

```
Input: arr[] = [2, 5, 6, 9], k = 2
Output: 2
Explanation: There are 2 subarrays with 2 odds: [2, 5, 6, 9] and [5, 6, 9].
```

### Example 2:

```
Input: arr[] = [2, 2, 5, 6, 9, 2, 11], k = 2
Output: 8
Explanation: There are 8 subarrays with 2 odds: [2, 2, 5, 6, 9], [2, 5, 6, 9], [5, 6, 9], [2, 2, 5, 6, 9, 2], [2, 5, 6, 9, 2], [5, 6, 9, 2], [6, 9, 2, 11] and [9, 2, 11].
```

## Constraints:

- 1 ≤ k ≤ arr.size() ≤ 10^5
- 1 ≤ arr[i] ≤ 10^9

## Expected Complexities

- **Time Complexity:** O(n)
- **Auxiliary Space:** O(1)

## Topic Tags

- Prefix Sum
- Hash Algorithms
- Sliding Window
- Two Pointer Algorithm

## Problem Category

- Sliding Window
- Array
- Subarray Problems

## Difficulty

Medium
