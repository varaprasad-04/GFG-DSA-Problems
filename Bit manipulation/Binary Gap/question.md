# Binary Gap

**Difficulty:** Easy | **Topics:** Bit Manipulation, Math

Given a positive integer `n`, find and return the longest distance between any two adjacent 1's in the binary representation of `n`. If there are no two adjacent 1's, return 0.

**Definition:**

- Two 1's are adjacent if there are only 0's separating them (possibly no 0's)
- The distance between two 1's is the absolute difference between their bit positions

For example, the two 1's in "1001" have a distance of 3.

## Examples

### Example 1:

```
Input: n = 22
Output: 2
```

**Explanation:** 22 in binary is "10110".

- The first adjacent pair of 1's is "**1**0**1**10" with a distance of 2
- The second adjacent pair of 1's is "10**1\*\***1\*\*0" with a distance of 1
- The answer is the largest of these two distances, which is 2

**Note:** "**1**01**1**0" is not a valid pair since there is a 1 separating the two 1's.

### Example 2:

```
Input: n = 8
Output: 0
```

**Explanation:** 8 in binary is "1000".
There are no adjacent pairs of 1's in the binary representation of 8, so we return 0.

### Example 3:

```
Input: n = 5
Output: 2
```

**Explanation:** 5 in binary is "101".
The two 1's at positions 0 and 2 have a distance of 2.

### Example 4:

```
Input: n = 6
Output: 1
```

**Explanation:** 6 in binary is "110".
The two adjacent 1's at positions 1 and 2 have a distance of 1.

## Constraints:

- 1 ≤ n ≤ 10^9

## Expected Complexities

- **Time Complexity:** O(log n)
- **Auxiliary Space:** O(1)

## Solution Approach

### Key Insight:

We need to find positions of all 1's in the binary representation and calculate the maximum distance between consecutive 1's.

### Algorithm:

1. **Find all positions of 1's** in the binary representation
2. **Calculate distances** between consecutive 1's
3. **Return the maximum distance**

### Bit Manipulation Approach:

```
1. Track the position of each bit
2. When we find a 1, calculate distance from previous 1
3. Update maximum distance and previous position
```

### Step-by-Step Example:

For `n = 22` (binary: "10110"):

```
Bit positions: 4 3 2 1 0
Binary:        1 0 1 1 0
               ↑   ↑ ↑
            pos 4  2 1

Distances:
- Between position 4 and 2: 4 - 2 = 2
- Between position 2 and 1: 2 - 1 = 1

Maximum distance: 2
```

### Implementation Strategy:

#### **Method 1: Convert to String**

1. Convert number to binary string
2. Find indices of all '1's
3. Calculate maximum gap between consecutive indices

#### **Method 2: Bit Manipulation**

1. Use bit operations to find 1's positions
2. Track previous and current 1's positions
3. Update maximum gap

### Edge Cases:

- **Single 1:** No adjacent pairs → return 0
- **No 1's:** Not possible given constraints
- **All consecutive 1's:** Minimum distance = 1
- **Powers of 2:** Only one 1 → return 0

### Binary Patterns:

- **"1001"** → distance = 3
- **"1010"** → distance = 2
- **"1100"** → distance = 1
- **"1000"** → distance = 0 (no adjacent pairs)

## Company Tags

- Google
- Facebook

## Topic Tags

- Bit Manipulation
- Math
- Binary Representation

## Problem Category

- Bit Manipulation
- Mathematical Problems
- String Processing

## Difficulty

Easy
