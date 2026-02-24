# Longest Span in Two Binary Arrays

**Difficulty:** Medium | **Topics:** Arrays, Hash Map, Prefix Sum

Given two binary arrays `a1[]` and `a2[]` of equal length. Find the length of longest common span `(i, j)`, where `i ≤ j` such that:

```
a1[i] + a1[i+1] + ... + a1[j] = a2[i] + a2[i+1] + ... + a2[j]
```

## Examples

### Example 1:

```
Input: a1[] = [0, 1, 0, 0, 0, 0], a2[] = [1, 0, 1, 0, 0, 1]
Output: 4
```

**Explanation:** The longest span with same sum is from index 1 to 4 (0-based indexing).

- `a1[1..4] = [1, 0, 0, 0]` → sum = 1
- `a2[1..4] = [0, 1, 0, 0]` → sum = 1

### Example 2:

```
Input: a1[] = [0, 1, 0, 1, 1, 1, 1], a2[] = [1, 1, 1, 1, 1, 0, 1]
Output: 6
```

**Explanation:** The longest span with same sum is from index 1 to 6 (0-based indexing).

- `a1[1..6] = [1, 0, 1, 1, 1, 1]` → sum = 5
- `a2[1..6] = [1, 1, 1, 1, 0, 1]` → sum = 5

### Example 3:

```
Input: a1[] = [0, 0, 0], a2[] = [1, 1, 1]
Output: 0
```

**Explanation:** There is no span where the sum of the elements in a1[] and a2[] is equal.

## Constraints:

- 1 ≤ a1.size() = a2.size() ≤ 10^6
- 0 ≤ a1[i], a2[i] ≤ 1

## Expected Complexities

- **Time Complexity:** O(n)
- **Auxiliary Space:** O(n)

## Solution Approach

### Key Insight:

Instead of comparing sums of subarrays directly, we can transform this into a **difference array problem**. If two subarrays have equal sums, their difference should be 0.

### Transformation:

Create a difference array `diff[]` where:

```
diff[i] = a1[i] - a2[i]
```

Now the problem becomes: **Find the longest subarray in diff[] with sum = 0**

### Algorithm:

1. **Create difference array:** `diff[i] = a1[i] - a2[i]`
2. **Use prefix sum + hash map:** Track cumulative sum and first occurrence of each sum
3. **Find longest zero sum subarray:** When same prefix sum appears twice, subarray between them has sum 0

### Step-by-Step Example:

For `a1 = [0, 1, 0, 0, 0, 0], a2 = [1, 0, 1, 0, 0, 1]`:

1. **Create difference array:**

   ```
   Index:  0  1  2  3  4  5
   a1:     0  1  0  0  0  0
   a2:     1  0  1  0  0  1
   diff:  -1  1 -1  0  0 -1
   ```

2. **Calculate prefix sums:**

   ```
   Index:     0  1  2  3  4  5
   diff:     -1  1 -1  0  0 -1
   prefix:   -1  0 -1 -1 -1 -2
   ```

3. **Hash map tracking:**

   ```
   i=0: prefix=-1, first occurrence → map={0:-1, -1:0}
   i=1: prefix=0, seen at -1 → span length = 1-(-1) = 2
   i=2: prefix=-1, seen at 0 → span length = 2-0 = 2
   i=3: prefix=-1, seen at 0 → span length = 3-0 = 3
   i=4: prefix=-1, seen at 0 → span length = 4-0 = 4
   i=5: prefix=-2, first occurrence
   ```

4. **Maximum span length:** 4

### Why This Works:

- **Equal sums condition:** `sum(a1[i..j]) = sum(a2[i..j])`
- **Equivalent to:** `sum(diff[i..j]) = 0`
- **Prefix sum property:** If `prefix[j] = prefix[i-1]`, then `sum(diff[i..j]) = 0`

### Mathematical Proof:

For subarray from index `i` to `j`:

```
If sum(a1[i..j]) = sum(a2[i..j])
Then sum(a1[i..j]) - sum(a2[i..j]) = 0
Which is sum(diff[i..j]) = 0
```

### Edge Cases:

- **No common span:** All differences are non-zero cumulatively
- **Entire array:** When prefix sum at end equals initial value
- **Single elements:** When `a1[i] = a2[i]`

## Company Tags

- Amazon
- Microsoft

## Topic Tags

- Arrays
- Hash Map
- Prefix Sum
- Subarray Problems

## Problem Category

- Array Manipulation
- Hash Map Applications
- Subarray Sum Problems

## Difficulty

Medium
