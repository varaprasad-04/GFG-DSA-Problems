# Count Subarrays with Given XOR

**Difficulty:** Medium | **Topics:** Arrays, Hash Map, Bit Manipulation

Given an array of integers `arr[]` and a number `k`, count the number of subarrays having XOR of their elements as `k`.

**Note:** It is guaranteed that the total count will fit within a 32-bit integer.

## Examples

### Example 1:

```
Input: arr[] = [4, 2, 2, 6, 4], k = 6
Output: 4
```

**Explanation:** The subarrays having XOR of their elements as 6 are:

- `[4, 2]` (indices 0-1)
- `[4, 2, 2, 6, 4]` (indices 0-4)
- `[2, 2, 6]` (indices 1-3)
- `[6]` (index 3)

Hence, the answer is 4.

### Example 2:

```
Input: arr[] = [5, 6, 7, 8, 9], k = 5
Output: 2
```

**Explanation:** The subarrays having XOR of their elements as 5 are:

- `[5]` (index 0)
- `[5, 6, 7, 8, 9]` (indices 0-4)

Hence, the answer is 2.

### Example 3:

```
Input: arr[] = [1, 1, 1, 1], k = 0
Output: 4
```

**Explanation:** The subarrays having XOR of their elements as 0 are:

- `[1, 1]` (indices 0-1)
- `[1, 1]` (indices 1-2)
- `[1, 1]` (indices 2-3)
- `[1, 1, 1, 1]` (indices 0-3)

## Constraints:

- 1 ≤ arr.size() ≤ 10^5
- 0 ≤ arr[i] ≤ 10^5
- 0 ≤ k ≤ 10^5

## Expected Complexities

- **Time Complexity:** O(n)
- **Auxiliary Space:** O(n)

## Solution Approach

### Key Insight:

This problem can be solved efficiently using **prefix XOR** and **hash map**. The idea is similar to finding subarrays with a given sum, but using XOR properties.

### XOR Properties:

1. **A ⊕ A = 0** (any number XORed with itself is 0)
2. **A ⊕ 0 = A** (any number XORed with 0 is the number itself)
3. **XOR is commutative:** A ⊕ B = B ⊕ A
4. **If A ⊕ B = C, then A ⊕ C = B**

### Algorithm:

1. **Calculate prefix XOR** for each position
2. **For each prefix XOR,** check if `(prefix_xor ⊕ k)` exists in the hash map
3. **Count occurrences** of required XOR values
4. **Update hash map** with current prefix XOR

### Mathematical Logic:

For subarray from index `i` to `j` with XOR = `k`:

```
prefix_xor[j] ⊕ prefix_xor[i-1] = k
Therefore: prefix_xor[i-1] = prefix_xor[j] ⊕ k
```

### Step-by-Step Example:

For `arr = [4, 2, 2, 6, 4], k = 6`:

```
Index:     0  1  2  3  4
Array:     4  2  2  6  4
Prefix XOR: 4  6  4  2  6

Hash Map Updates and Checks:
i=0: prefix=4, check (4⊕6)=2 → not found, count=0, map={0:1, 4:1}
i=1: prefix=6, check (6⊕6)=0 → found 1 time, count=1, map={0:1, 4:1, 6:1}
i=2: prefix=4, check (4⊕6)=2 → not found, count=1, map={0:1, 4:2, 6:1}
i=3: prefix=2, check (2⊕6)=4 → found 2 times, count=3, map={0:1, 4:2, 6:1, 2:1}
i=4: prefix=6, check (6⊕6)=0 → found 1 time, count=4, map={0:1, 4:2, 6:2, 2:1}

Final count = 4
```

### Why This Works:

- **Prefix XOR:** Captures cumulative XOR up to each index
- **Hash Map:** Stores frequency of each prefix XOR value
- **XOR Property:** Uses the fact that if `A ⊕ B = C`, then `A = B ⊕ C`

### Edge Cases:

- **k = 0:** Count subarrays where elements cancel out
- **Single elements:** Each element equal to k contributes 1
- **Entire array:** When prefix XOR equals k

## Company Tags

- Amazon
- Microsoft
- Adobe

## Topic Tags

- Arrays
- Hash Map
- Bit Manipulation
- Prefix XOR
- Subarray Problems

## Problem Category

- Array Problems
- Bit Manipulation
- Hash Map Applications

## Difficulty

Medium
