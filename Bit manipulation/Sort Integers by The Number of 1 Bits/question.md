# Sort Integers by The Number of 1 Bits

**Difficulty:** Easy | **Topics:** Array, Bit Manipulation, Sorting

You are given an integer array `arr`. Sort the integers in the array in ascending order by the number of 1's in their binary representation and in case of two or more integers have the same number of 1's you have to sort them in ascending order.

Return the array after sorting it.

## Examples

### Example 1:

```
Input: arr = [0,1,2,3,4,5,6,7,8]
Output: [0,1,2,4,8,3,5,6,7]
```

**Explanation:**

- `[0]` is the only integer with 0 bits
- `[1,2,4,8]` all have 1 bit
- `[3,5,6]` have 2 bits
- `[7]` has 3 bits

The sorted array by bits is `[0,1,2,4,8,3,5,6,7]`

**Binary Analysis:**

```
Number | Binary | 1-bit Count
-------|--------|------------
0      | 0      | 0
1      | 1      | 1
2      | 10     | 1
3      | 11     | 2
4      | 100    | 1
5      | 101    | 2
6      | 110    | 2
7      | 111    | 3
8      | 1000   | 1
```

### Example 2:

```
Input: arr = [1024,512,256,128,64,32,16,8,4,2,1]
Output: [1,2,4,8,16,32,64,128,256,512,1024]
```

**Explanation:** All integers have 1 bit in the binary representation, you should just sort them in ascending order.

**Binary Analysis:**

```
All numbers are powers of 2, each having exactly 1 bit set
1    = 2^0  = 1
2    = 2^1  = 10
4    = 2^2  = 100
...
1024 = 2^10 = 10000000000
```

## Constraints:

- 1 ≤ arr.length ≤ 500
- 0 ≤ arr[i] ≤ 10^4

## Expected Complexities

- **Time Complexity:** O(n log n)
- **Auxiliary Space:** O(1) or O(n) depending on sorting algorithm

## Solution Approach

### Key Insight:

We need a **custom comparator** that sorts by:

1. **Primary:** Number of 1 bits (ascending)
2. **Secondary:** Actual value (ascending) for tie-breaking

### Algorithm:

1. **Count 1 bits** for each number using `Integer.bitCount()` or manual counting
2. **Custom sort** with two-level comparison
3. **Return sorted array**

### Bit Counting Methods:

#### **Method 1: Built-in Function**

```java
Integer.bitCount(num)
```

#### **Method 2: Brian Kernighan's Algorithm**

```java
int countBits(int n) {
    int count = 0;
    while (n > 0) {
        n &= (n - 1);  // Remove rightmost 1 bit
        count++;
    }
    return count;
}
```

#### **Method 3: Simple Bit Checking**

```java
int countBits(int n) {
    int count = 0;
    while (n > 0) {
        count += n & 1;  // Check if last bit is 1
        n >>= 1;         // Right shift by 1
    }
    return count;
}
```

### Step-by-Step Example:

For `arr = [0,1,2,3,4,5,6,7,8]`:

1. **Calculate 1-bit counts:**
   - 0 → 0 bits
   - 1 → 1 bit
   - 2 → 1 bit
   - 3 → 2 bits
   - 4 → 1 bit
   - 5 → 2 bits
   - 6 → 2 bits
   - 7 → 3 bits
   - 8 → 1 bit

2. **Group by bit count:**
   - 0 bits: [0]
   - 1 bit: [1,2,4,8]
   - 2 bits: [3,5,6]
   - 3 bits: [7]

3. **Sort within groups:**
   - 0 bits: [0]
   - 1 bit: [1,2,4,8] (already sorted)
   - 2 bits: [3,5,6] (already sorted)
   - 3 bits: [7]

4. **Final result:** [0,1,2,4,8,3,5,6,7]

### Custom Comparator Logic:

```java
Arrays.sort(arr, (a, b) -> {
    int bitsA = Integer.bitCount(a);
    int bitsB = Integer.bitCount(b);

    if (bitsA != bitsB) {
        return bitsA - bitsB;  // Sort by bit count first
    }
    return a - b;  // If same bit count, sort by value
});
```

### Edge Cases:

- **All same bit count:** Sort by value only
- **Single element:** Already sorted
- **All powers of 2:** All have 1 bit, sort by value
- **Zero included:** Has 0 bits, comes first

## Company Tags

- LeetCode

## Topic Tags

- Array
- Bit Manipulation
- Sorting
- Custom Comparator

## Problem Category

- Sorting Problems
- Bit Manipulation
- Custom Comparison

## Difficulty

Easy
