# Max Circular Subarray Sum

**Difficulty:** Hard | **Topics:** Arrays, Data Structures, Kadane Algorithm

You are given a circular array `arr[]` of integers, find the maximum possible sum of a non-empty subarray. In a circular array, the subarray can start at the end and wrap around to the beginning. Return the maximum non-empty subarray sum, considering both non-wrapping and wrapping cases.

## Examples

### Example 1:

```
Input: arr[] = [8, -8, 9, -9, 10, -11, 12]
Output: 22
```

**Explanation:** Starting from the last element of the array, i.e, 12, and moving in a circular fashion, we have max subarray as 12, 8, -8, 9, -9, 10, which gives maximum sum as 22.

### Example 2:

```
Input: arr[] = [10, -3, -4, 7, 6, 5, -4, -1]
Output: 23
```

**Explanation:** Maximum sum of the circular subarray is 23. The subarray is [7, 6, 5, -4, -1, 10].

### Example 3:

```
Input: arr[] = [5, -2, 3, 4]
Output: 12
```

**Explanation:** The circular subarray [3, 4, 5] gives the maximum sum of 12.

## Constraints:

- 1 ≤ arr.size() ≤ 10^5
- -10^4 ≤ arr[i] ≤ 10^4

## Expected Complexities

- **Time Complexity:** O(n)
- **Auxiliary Space:** O(1)

## Solution Approach

### Key Insight:

Think of the array as a circle, not a straight line. The maximum sum subarray can either:

1. **Stay inside the array normally** (non-wrapping case)
2. **Take elements from the end and continue from the beginning** (wrapping case)

### Algorithm:

To find the maximum circular subarray sum:

1. **Calculate normal maximum subarray sum** using Kadane's algorithm
2. **Calculate minimum subarray sum** using modified Kadane's algorithm
3. **Calculate total array sum**
4. **For circular case:** Subtract minimum subarray sum from total sum
5. **Return maximum** of normal max and circular max

### Mathematical Formula:

```
Max Circular Sum = max(
    Normal Max Subarray Sum,
    Total Sum - Min Subarray Sum
)
```

### Why This Works:

When we remove the minimum subarray from the total sum, we're left with the maximum possible circular subarray. This is because:

- Total sum = All elements combined
- Min subarray = Worst contributing elements
- Total - Min = Best possible circular combination

### Time Complexity: O(n)

- One pass for normal max subarray sum
- One pass for min subarray sum
- Total: O(2n) = O(n)

### Space Complexity: O(1)

- Only using constant extra variables

## Company Tags

- Amazon
- Microsoft

## Topic Tags

- Arrays
- Data Structures
- Kadane Algorithm
- Circular Arrays

## Problem Category

- Kadane Algorithm
- Array Manipulation
- Dynamic Programming

## Difficulty

Hard
