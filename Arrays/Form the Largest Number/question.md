# Form the Largest Number

**Difficulty:** Medium | **Topics:** Arrays, Sorting, Custom Comparator

Given an array of integers `arr[]` representing non-negative integers, arrange them so that after concatenating all of them in order, it results in the largest possible number. Since the result may be very large, return it as a string.

## Examples

### Example 1:

```
Input: arr[] = [3, 30, 34, 5, 9]
Output: "9534330"
```

**Explanation:** Given numbers are [3, 30, 34, 5, 9], the arrangement [9, 5, 34, 3, 30] gives the largest value.

### Example 2:

```
Input: arr[] = [54, 546, 548, 60]
Output: "6054854654"
```

**Explanation:** Given numbers are [54, 546, 548, 60], the arrangement [60, 548, 546, 54] gives the largest value.

### Example 3:

```
Input: arr[] = [3, 4, 6, 5, 9]
Output: "96543"
```

**Explanation:** Given numbers are [3, 4, 6, 5, 9], the arrangement [9, 6, 5, 4, 3] gives the largest value.

## Constraints:

- 1 ≤ arr.size() ≤ 10^5
- 0 ≤ arr[i] ≤ 10^5

## Expected Complexities

- **Time Complexity:** O(n log n)
- **Auxiliary Space:** O(n)

## Solution Approach

### Key Insight:

The challenge is not just sorting numbers in descending order. For example, 3 vs 30: while 30 > 3 numerically, "330" > "303", so 3 should come before 30 in the final arrangement.

We need a **custom comparator** that determines which arrangement produces a larger concatenated result.

### Algorithm:

1. **Convert all integers to strings** for easy concatenation
2. **Sort using custom comparator:** For two strings `a` and `b`, compare `a+b` vs `b+a`
3. **Concatenate sorted strings** to form the final result
4. **Handle edge case:** If result starts with "0", return "0"

### Custom Comparator Logic:

For two numbers `a` and `b`:

- If `a + b > b + a` (as strings), then `a` should come before `b`
- If `a + b < b + a`, then `b` should come before `a`

### Step-by-Step Example:

For `arr = [3, 30, 34, 5, 9]`:

**Comparisons:**

- 3 vs 30: "330" > "303" → 3 comes before 30
- 3 vs 34: "334" < "343" → 34 comes before 3
- 5 vs 9: "59" < "95" → 9 comes before 5
- And so on...

**Sorted order:** [9, 5, 34, 3, 30]
**Result:** "9534330"

### Why This Works:

The custom comparator ensures **transitivity**:

- If a should come before b, and b should come before c
- Then a should come before c (transitivity property)
- This guarantees optimal arrangement

### Edge Cases:

1. **All zeros:** [0, 0, 0] → "0" (not "000")
2. **Leading zeros:** [0, 5, 10] → "5100" (not "05100")
3. **Single element:** [42] → "42"

### Mathematical Proof:

The custom comparator creates an optimal arrangement because:

- It considers the actual concatenated values
- It maintains the transitivity property required for sorting
- It maximizes the lexicographic order of the final string

## Company Tags

- Paytm
- Zoho
- Amazon
- Microsoft
- MakeMyTrip

## Topic Tags

- Arrays
- Data Structures
- Sorting
- Custom Comparator
- String Manipulation

## Problem Category

- Array Manipulation
- Sorting Problems
- String Problems

## Difficulty

Medium
