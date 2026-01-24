# Minimize Maximum Pair Sum in Array

**Difficulty:** Medium | **Topics:** Array, Greedy, Sorting

The pair sum of a pair (a,b) is equal to a + b. The maximum pair sum is the largest pair sum in a list of pairs.

For example, if we have pairs (1,5), (2,3), and (4,4), the maximum pair sum would be max(1+5, 2+3, 4+4) = max(6, 5, 8) = 8.

Given an array `nums` of even length `n`, pair up the elements of `nums` into `n / 2` pairs such that:

- Each element of `nums` is in exactly one pair, and
- The maximum pair sum is minimized.

Return the minimized maximum pair sum after optimally pairing up the elements.

## Examples

### Example 1:

```
Input: nums = [3,5,2,3]
Output: 7
```

**Explanation:** The elements can be paired up into pairs (3,3) and (5,2).
The maximum pair sum is max(3+3, 5+2) = max(6, 7) = 7.

### Example 2:

```
Input: nums = [3,5,4,2,4,6]
Output: 8
```

**Explanation:** The elements can be paired up into pairs (3,5), (4,4), and (6,2).
The maximum pair sum is max(3+5, 4+4, 6+2) = max(8, 8, 8) = 8.

## Constraints:

- n == nums.length
- 2 ≤ n ≤ 10^5
- n is even
- 1 ≤ nums[i] ≤ 10^5

## Expected Complexities

- **Time Complexity:** O(n log n)
- **Auxiliary Space:** O(1)

## Solution Approach

To minimize the maximum pair sum, we use a **greedy approach**:

### Algorithm:

1. **Sort the array** in ascending order
2. **Pair smallest with largest** elements:
   - Pair `nums[0]` with `nums[n-1]`
   - Pair `nums[1]` with `nums[n-2]`
   - Continue this pattern
3. **Find maximum** among all pair sums
4. **Return** the maximum pair sum

### Key Insight:

By pairing the smallest element with the largest, we ensure that the maximum pair sum is minimized compared to other pairing strategies.

## Topic Tags

- Array
- Greedy Algorithm
- Sorting
- Two Pointer

## Problem Category

- Greedy Algorithm
- Array Manipulation
- Optimization Problems

## Difficulty

Medium
