# Longest Subarray with Majority Greater than K

**Difficulty:** Medium | **Topics:** Arrays, Prefix Sum, Hash Map

Given an array `arr[]` and an integer `k`, find the length of the longest subarray in which the count of elements greater than `k` is more than the count of elements less than or equal to `k`.

## Examples

### Example 1:

```
Input: arr[] = [1, 2, 3, 4, 1], k = 2
Output: 3
```

**Explanation:** The subarray `[2, 3, 4]` or `[3, 4, 1]` satisfy the given condition, and there is no subarray of length 4 or 5 which will hold the given condition, so the answer is 3.

**Analysis:**

- Subarray `[2, 3, 4]`: elements > 2 = {3, 4} (count = 2), elements ≤ 2 = {2} (count = 1) → 2 > 1 ✓
- Subarray `[3, 4, 1]`: elements > 2 = {3, 4} (count = 2), elements ≤ 2 = {1} (count = 1) → 2 > 1 ✓

### Example 2:

```
Input: arr[] = [6, 5, 3, 4], k = 2
Output: 4
```

**Explanation:** In the subarray `[6, 5, 3, 4]`, there are 4 elements > 2 and 0 elements ≤ 2, so it is the longest subarray.

**Analysis:**

- All elements {6, 5, 3, 4} are > 2
- Count of elements > 2 = 4, count of elements ≤ 2 = 0 → 4 > 0 ✓

### Example 3:

```
Input: arr[] = [1, 1, 1, 1], k = 2
Output: 0
```

**Explanation:** All elements are ≤ 2, so no subarray can have more elements > k than elements ≤ k.

## Constraints:

- 1 ≤ arr.size() ≤ 10^6
- 1 ≤ arr[i] ≤ 10^6
- 0 ≤ k ≤ 10^6

## Expected Complexities

- **Time Complexity:** O(n)
- **Auxiliary Space:** O(n)

## Solution Approach

### Key Insight:

Transform this into a **longest subarray with positive sum** problem. For each element:

- If `arr[i] > k`, assign value +1
- If `arr[i] ≤ k`, assign value -1

Now find the longest subarray where sum > 0.

### Algorithm:

1. **Transform array:** Convert to +1/-1 based on comparison with k
2. **Prefix sum + Hash map:** Track cumulative sum and first occurrence
3. **Find longest positive sum:** Use the fact that if `prefix[j] > prefix[i]`, then subarray `(i, j]` has positive sum

### Step-by-Step Example:

For `arr = [1, 2, 3, 4, 1], k = 2`:

1. **Transform array:**

   ```
   Original: [1, 2, 3, 4, 1]
   k = 2
   Compare:  ≤  ≤  >  >  ≤
   Transform:[-1,-1, 1, 1,-1]
   ```

2. **Calculate prefix sums:**

   ```
   Index:    0  1  2  3  4
   Values:  -1 -1  1  1 -1
   Prefix:  -1 -2 -1  0 -1
   ```

3. **Find longest subarray with positive sum:**
   - We need `prefix[j] > prefix[i]` for subarray `(i, j]` to have positive sum
   - From prefix array: positions where we can find this condition
   - Maximum length subarray: indices 1 to 3 → length = 3

### Why This Works:

- **Majority condition:** Count(>k) > Count(≤k) is equivalent to Sum(+1/-1) > 0
- **Subarray sum:** If transformed subarray sum > 0, original condition is satisfied
- **Prefix sum property:** Difference of prefix sums gives subarray sum

### Alternative Approach - Hash Map:

```
For each prefix sum, track:
- Leftmost occurrence of each sum
- For current sum, find smaller sums seen before
- Maximum difference gives longest valid subarray
```

### Edge Cases:

- **All elements ≤ k:** No valid subarray exists
- **All elements > k:** Entire array is the answer
- **k = 0:** All positive elements are > k
- **Single element:** Length 1 if element > k, else 0

## Company Tags

- NPCI

## Topic Tags

- Arrays
- Prefix Sum
- Hash Map
- Subarray Problems

## Problem Category

- Array Manipulation
- Prefix Sum Applications
- Subarray Sum Problems

## Difficulty

Medium
