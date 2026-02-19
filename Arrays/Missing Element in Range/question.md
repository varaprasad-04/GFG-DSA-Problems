# Missing Element in Range

**Difficulty:** Easy | **Topics:** Arrays, Hash Set, Range Processing

Given an array `arr[]` of distinct integers and a range `[low, high]`, find all the numbers within the range that are not present in the array. Return the missing numbers in sorted order.

## Examples

### Example 1:

```
Input: arr[] = [10, 12, 11, 15], low = 10, high = 15
Output: [13, 14]
```

**Explanation:** Numbers 13 and 14 lie in the range [10, 15] but are not present in the array.

### Example 2:

```
Input: arr[] = [1, 4, 11, 51, 15], low = 50, high = 55
Output: [50, 52, 53, 54, 55]
```

**Explanation:** Numbers 50, 52, 53, 54 and 55 lie in the range [50, 55] but are not present in the array.

### Example 3:

```
Input: arr[] = [5, 10, 15, 20], low = 1, high = 25
Output: [1, 2, 3, 4, 6, 7, 8, 9, 11, 12, 13, 14, 16, 17, 18, 19, 21, 22, 23, 24, 25]
```

**Explanation:** All numbers in range [1, 25] except [5, 10, 15, 20] are missing.

## Constraints:

- 1 ≤ arr.size(), low, high ≤ 10^5
- 1 ≤ arr[i] ≤ 10^5
- low ≤ high

## Expected Complexities

- **Time Complexity:** O(n + (high - low + 1))
- **Auxiliary Space:** O(n)

## Solution Approach

### Key Insight:

We need to efficiently check which numbers in the range `[low, high]` are missing from the array. Using a hash set for O(1) lookup makes this optimal.

### Algorithm:

1. **Create a hash set** from the array for O(1) lookup
2. **Iterate through the range** `[low, high]`
3. **Check existence** of each number in the hash set
4. **Add missing numbers** to the result list
5. **Return the result** (already in sorted order due to sequential iteration)

### Step-by-Step Process:

For `arr = [10, 12, 11, 15], low = 10, high = 15`:

1. **Create hash set:** `{10, 12, 11, 15}`
2. **Check range [10, 15]:**
   - 10: Present in set ✓
   - 11: Present in set ✓
   - 12: Present in set ✓
   - 13: Not in set → Add to result
   - 14: Not in set → Add to result
   - 15: Present in set ✓
3. **Result:** `[13, 14]`

### Why This Approach Works:

- **Efficient lookup:** Hash set provides O(1) average time complexity for checking existence
- **Sequential processing:** Iterating through range ensures sorted output
- **Space-time tradeoff:** Uses O(n) space to achieve optimal time complexity

### Alternative Approaches:

1. **Sorting + Two Pointers:** Sort array and use two pointers (O(n log n) time)
2. **Binary Search:** For each range number, binary search in sorted array (O((high-low) × log n) time)
3. **Boolean Array:** Create boolean array of size (high-low+1) (O(high-low) space)

### Edge Cases:

- **Empty array:** All numbers in range are missing
- **Range outside array values:** All numbers in range are missing
- **Complete coverage:** Array contains all numbers in range
- **Single element range:** Check if that single number exists

## Company Tags

- Amazon
- Microsoft

## Topic Tags

- Arrays
- Hash Set
- Range Processing
- Missing Numbers

## Problem Category

- Array Problems
- Set Operations
- Range Queries

## Difficulty

Easy
