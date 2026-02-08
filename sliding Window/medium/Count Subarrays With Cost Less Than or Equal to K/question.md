# Count Subarrays With Cost Less Than or Equal to K

**Difficulty:** Medium | **Topics:** Array, Sliding Window, Two Pointer

You are given an integer array `nums`, and an integer `k`.

For any subarray `nums[l..r]`, define its cost as:

```
cost = (max(nums[l..r]) - min(nums[l..r])) × (r - l + 1)
```

Return an integer denoting the number of subarrays of `nums` whose cost is less than or equal to `k`.

## Examples

### Example 1:

```
Input: nums = [1,3,2], k = 4
Output: 5
```

**Explanation:**

We consider all subarrays of nums:

- `nums[0..0]`: cost = (1 - 1) × 1 = 0 ✓
- `nums[0..1]`: cost = (3 - 1) × 2 = 4 ✓
- `nums[0..2]`: cost = (3 - 1) × 3 = 6 ❌
- `nums[1..1]`: cost = (3 - 3) × 1 = 0 ✓
- `nums[1..2]`: cost = (3 - 2) × 2 = 2 ✓
- `nums[2..2]`: cost = (2 - 2) × 1 = 0 ✓

There are 5 subarrays whose cost is less than or equal to 4.

### Example 2:

```
Input: nums = [5,5,5,5], k = 0
Output: 10
```

**Explanation:**

For any subarray of nums, the maximum and minimum values are the same, so the cost is always 0.

As a result, every subarray of nums has cost less than or equal to 0.

For an array of length 4, the total number of subarrays is (4 × 5) / 2 = 10.

### Example 3:

```
Input: nums = [1,2,3], k = 0
Output: 3
```

**Explanation:**

The only subarrays of nums with cost 0 are the single-element subarrays, and there are 3 of them.

## Constraints:

- 1 ≤ nums.length ≤ 10^5
- 1 ≤ nums[i] ≤ 10^5
- 0 ≤ k ≤ 10^15

## Expected Complexities

- **Time Complexity:** O(n²) or O(n log n) with optimized approach
- **Auxiliary Space:** O(1)

## Solution Approach

### Key Insight:

The cost formula combines two factors:

1. **Range difference:** `max - min` (measures spread of values)
2. **Length factor:** `r - l + 1` (measures subarray size)

As subarray length increases, both factors can increase, making the cost grow quickly.

### Algorithm Options:

#### **Approach 1: Brute Force**

1. **Generate all subarrays** using nested loops
2. **For each subarray:** Find max, min, and calculate cost
3. **Count valid subarrays** where cost ≤ k

#### **Approach 2: Optimized with Sliding Window**

1. **Use sliding window** to maintain subarrays efficiently
2. **Track max and min** using deque or other data structures
3. **Expand/contract window** based on cost constraint

### Cost Analysis:

For subarray `nums[l..r]`:

- **Length:** `r - l + 1`
- **Range:** `max(nums[l..r]) - min(nums[l..r])`
- **Cost:** `range × length`

### Special Cases:

- **All elements equal:** Cost is always 0 (max = min)
- **Single elements:** Cost is always 0 (max = min, length = 1)
- **k = 0:** Only single-element subarrays are valid

## Company Tags

- Google
- Amazon

## Topic Tags

- Array
- Sliding Window
- Two Pointer
- Subarray

## Problem Category

- Sliding Window
- Array Manipulation
- Optimization Problems

## Difficulty

Medium
