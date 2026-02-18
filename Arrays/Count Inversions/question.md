# Count Inversions

**Difficulty:** Medium | **Topics:** Arrays, Divide and Conquer, Sorting

Given an array of integers `arr[]`. You have to find the Inversion Count of the array.

**Note:** Inversion count is the number of pairs of elements `(i, j)` such that `i < j` and `arr[i] > arr[j]`.

## Examples

### Example 1:

```
Input: arr[] = [2, 4, 1, 3, 5]
Output: 3
```

**Explanation:** The sequence 2, 4, 1, 3, 5 has three inversions:

- `(2, 1)` at indices (0, 2)
- `(4, 1)` at indices (1, 2)
- `(4, 3)` at indices (1, 3)

### Example 2:

```
Input: arr[] = [2, 3, 4, 5, 6]
Output: 0
```

**Explanation:** As the sequence is already sorted in ascending order, there is no inversion count.

### Example 3:

```
Input: arr[] = [10, 10, 10]
Output: 0
```

**Explanation:** As all the elements of array are same, so there is no inversion count.

## Constraints:

- 1 ≤ arr.size() ≤ 10^5
- 1 ≤ arr[i] ≤ 10^4

## Expected Complexities

- **Time Complexity:** O(n log n)
- **Auxiliary Space:** O(n)

## Solution Approach

### Key Insight:

An inversion occurs when a larger element appears before a smaller element in the array. We can efficiently count inversions using the **merge sort** algorithm.

### Algorithm:

#### **Approach 1: Merge Sort Based (Optimal)**

During the merge step of merge sort, count inversions when elements from the right half are smaller than elements from the left half.

#### **Approach 2: Brute Force**

Check all pairs `(i, j)` where `i < j` and count when `arr[i] > arr[j]`.

### Merge Sort Approach Logic:

1. **Divide:** Split array into two halves recursively
2. **Conquer:** Count inversions in left half, right half, and cross inversions
3. **Cross Inversions:** During merge, when an element from right array is picked, it forms inversions with all remaining elements in left array

### Why Merge Sort Works:

- **Left half inversions:** Counted recursively
- **Right half inversions:** Counted recursively
- **Cross inversions:** When merging, if `right[j] < left[i]`, then `right[j]` is smaller than all remaining elements in left half

### Step-by-Step Example:

For `arr = [2, 4, 1, 3, 5]`:

```
Initial: [2, 4, 1, 3, 5]

Split: [2, 4] and [1, 3, 5]

Left half [2, 4]: 0 inversions
Right half [1, 3, 5]: 0 inversions

Merge process:
- Compare 2 and 1: 1 < 2, so 1 forms inversion with [2, 4] → +2 inversions
- Compare 2 and 3: 2 < 3, pick 2
- Compare 4 and 3: 3 < 4, so 3 forms inversion with [4] → +1 inversion
- Remaining elements: 4, 5

Total inversions: 2 + 1 = 3
```

### Inversion Patterns:

- **Sorted array:** 0 inversions
- **Reverse sorted array:** Maximum inversions = n(n-1)/2
- **Array with duplicates:** Equal elements don't form inversions

### Applications:

- **Similarity measure:** How close an array is to being sorted
- **Ranking problems:** Measuring disagreement between rankings
- **Data analysis:** Finding disorder in sequences

## Company Tags

- Flipkart
- Amazon
- Microsoft
- MakeMyTrip
- Adobe
- BankBazaar
- Myntra

## Topic Tags

- Arrays
- Divide and Conquer
- Sorting
- Data Structures
- Algorithms

## Problem Category

- Array Problems
- Divide and Conquer
- Sorting Applications

## Difficulty

Medium
