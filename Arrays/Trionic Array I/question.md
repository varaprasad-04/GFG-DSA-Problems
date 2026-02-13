# Trionic Array I

**Difficulty:** Medium | **Topics:** Arrays, Two Pointers, Pattern Recognition

You are given an integer array `nums` of length `n`.

An array is **trionic** if there exist indices `0 < p < q < n - 1` such that:

- `nums[0...p]` is strictly increasing
- `nums[p...q]` is strictly decreasing
- `nums[q...n-1]` is strictly increasing

Return `true` if `nums` is trionic, otherwise return `false`.

## Examples

### Example 1:

```
Input: nums = [1,3,5,4,2,6]
Output: true
```

**Explanation:**
Pick `p = 2`, `q = 4`:

- `nums[0...2] = [1, 3, 5]` is strictly increasing (1 < 3 < 5)
- `nums[2...4] = [5, 4, 2]` is strictly decreasing (5 > 4 > 2)
- `nums[4...5] = [2, 6]` is strictly increasing (2 < 6)

### Example 2:

```
Input: nums = [2,1,3]
Output: false
```

**Explanation:**
There is no way to pick `p` and `q` to form the required three segments.

### Example 3:

```
Input: nums = [1,2,3,2,1,2,3]
Output: true
```

**Explanation:**
Pick `p = 2`, `q = 4`:

- `nums[0...2] = [1, 2, 3]` is strictly increasing
- `nums[2...4] = [3, 2, 1]` is strictly decreasing
- `nums[4...6] = [1, 2, 3]` is strictly increasing

## Constraints:

- 3 ≤ n ≤ 100
- -1000 ≤ nums[i] ≤ 1000

## Expected Complexities

- **Time Complexity:** O(n²)
- **Auxiliary Space:** O(1)

## Solution Approach

### Key Insight:

We need to find two transition points `p` and `q` where:

1. **First transition (p):** Array changes from increasing to decreasing
2. **Second transition (q):** Array changes from decreasing to increasing

### Algorithm:

#### **Approach 1: Brute Force**

1. **Try all possible values** of `p` and `q` where `0 < p < q < n-1`
2. **For each (p, q) pair:**
   - Check if `nums[0...p]` is strictly increasing
   - Check if `nums[p...q]` is strictly decreasing
   - Check if `nums[q...n-1]` is strictly increasing
3. **Return true** if any valid pair is found

#### **Approach 2: Optimized Search**

1. **Find all potential p values:** Points where increasing sequence can end
2. **For each valid p:** Find potential q values where decreasing sequence can end
3. **Validate the pattern** for each (p, q) combination

### Validation Functions:

```java
// Check if subarray is strictly increasing
boolean isIncreasing(int[] nums, int start, int end) {
    for (int i = start; i < end; i++) {
        if (nums[i] >= nums[i + 1]) return false;
    }
    return true;
}

// Check if subarray is strictly decreasing
boolean isDecreasing(int[] nums, int start, int end) {
    for (int i = start; i < end; i++) {
        if (nums[i] <= nums[i + 1]) return false;
    }
    return true;
}
```

### Pattern Requirements:

1. **Minimum length:** Array must have at least 3 elements
2. **Valid indices:** `0 < p < q < n-1` ensures each segment has at least one element
3. **Strict ordering:** No equal adjacent elements allowed in any segment

### Edge Cases:

- **Too short array:** Length < 3 cannot be trionic
- **No valid transitions:** Array might be only increasing or decreasing
- **Equal elements:** Strict ordering requirement eliminates plateaus

## Company Tags

- Google
- Amazon

## Topic Tags

- Arrays
- Two Pointers
- Pattern Recognition
- Validation

## Problem Category

- Array Pattern Recognition
- Subsequence Problems
- Validation Problems

## Difficulty

Medium
