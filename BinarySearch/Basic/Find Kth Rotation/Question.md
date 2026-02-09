# Find Kth Rotation

**Difficulty:** Basic | **Topics:** Arrays, Searching, Binary Search

Given an increasing sorted rotated array `arr[]` of distinct integers. The array is right-rotated `k` times. Find the value of `k`.

Let's suppose we have an array `arr[] = [2, 4, 6, 9]`, if we rotate it by 2 times it will look like this:

- After 1st Rotation: `[9, 2, 4, 6]`
- After 2nd Rotation: `[6, 9, 2, 4]`

## Examples

### Example 1:

```
Input: arr[] = [5, 1, 2, 3, 4]
Output: 1
```

**Explanation:** The given array is `[5, 1, 2, 3, 4]`. The original sorted array is `[1, 2, 3, 4, 5]`. We can see that the array was rotated 1 time to the right.

### Example 2:

```
Input: arr[] = [1, 2, 3, 4, 5]
Output: 0
```

**Explanation:** The given array is not rotated.

### Example 3:

```
Input: arr[] = [3, 4, 5, 1, 2]
Output: 3
```

**Explanation:** The original sorted array is `[1, 2, 3, 4, 5]`. The array was rotated 3 times to the right.

## Constraints:

- 1 ≤ arr.size() ≤ 10^5
- 1 ≤ arr[i] ≤ 10^7

## Expected Complexities

- **Time Complexity:** O(log n)
- **Auxiliary Space:** O(1)

## Solution Approach

### Key Insight:

In a rotated sorted array, the number of rotations equals the index of the minimum element. We can find the minimum element efficiently using binary search.

### Algorithm:

1. **Use binary search** to find the minimum element's index
2. **Key observation:** In a rotated array, the minimum element is the only element that is smaller than its previous element
3. **Binary search logic:**
   - If `arr[mid] > arr[high]`: minimum is in the right half
   - If `arr[mid] < arr[high]`: minimum is in the left half (including mid)
   - If `arr[mid] == arr[high]`: handle duplicates (though problem states distinct elements)

### Why This Works:

- **Original array:** `[1, 2, 3, 4, 5]` (0 rotations)
- **1 rotation:** `[5, 1, 2, 3, 4]` (min at index 1)
- **2 rotations:** `[4, 5, 1, 2, 3]` (min at index 2)
- **3 rotations:** `[3, 4, 5, 1, 2]` (min at index 3)

The pattern shows: **Number of rotations = Index of minimum element**

### Binary Search Process:

1. **Compare mid with high:**
   - If `arr[mid] > arr[high]`: Rotation point is to the right
   - If `arr[mid] < arr[high]`: Rotation point is to the left or at mid
2. **Continue until we find the minimum element**
3. **Return its index**

## Company Tags

- Flipkart
- Amazon
- ABCO

## Topic Tags

- Arrays
- Searching
- Data Structures
- Algorithms
- Binary Search

## Problem Category

- Binary Search
- Array Manipulation
- Searching Problems

## Difficulty

Basic
