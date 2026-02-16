# Reverse Bits

**Difficulty:** Easy | **Topics:** Bit Manipulation, Math

Given a 32-bit signed integer `n`, reverse the bits and return the resulting integer.

## Examples

### Example 1:

```
Input: n = 43261596
Output: 964176192
```

**Explanation:**

| Integer   | Binary Representation            |
| --------- | -------------------------------- |
| 43261596  | 00000010100101000001111010011100 |
| 964176192 | 00111001011110000010100101000000 |

The binary representation is reversed bit by bit.

### Example 2:

```
Input: n = 2147483644
Output: 1073741822
```

**Explanation:**

| Integer    | Binary Representation            |
| ---------- | -------------------------------- |
| 2147483644 | 01111111111111111111111111111100 |
| 1073741822 | 00111111111111111111111111111110 |

The binary representation is reversed bit by bit.

## Constraints:

- 0 ≤ n ≤ 2^31 - 2
- n is even

## Expected Complexities

- **Time Complexity:** O(1) - Fixed 32 iterations
- **Auxiliary Space:** O(1)

## Solution Approach

### Key Insight:

We need to reverse the bit pattern of a 32-bit integer. This can be achieved by extracting bits from the rightmost position of the input and placing them at the leftmost position of the result.

### Algorithm:

#### **Approach 1: Bit Manipulation**

```java
public int reverseBits(int n) {
    int result = 0;

    for (int i = 0; i < 32; i++) {
        // Extract the rightmost bit of n
        int bit = n & 1;

        // Shift result left and add the extracted bit
        result = (result << 1) | bit;

        // Shift n right to process next bit
        n >>>= 1;
    }

    return result;
}
```
