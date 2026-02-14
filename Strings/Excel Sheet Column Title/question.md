# Excel Sheet Column Title

**Difficulty:** Easy | **Topics:** Math, String

Given an integer `columnNumber`, return its corresponding column title as it appears in an Excel sheet.

**Mapping Pattern:**

```
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
...
```

## Examples

### Example 1:

```
Input: columnNumber = 1
Output: "A"
```

**Explanation:** Column 1 corresponds to "A" in Excel.

### Example 2:

```
Input: columnNumber = 28
Output: "AB"
```

**Explanation:**

- After Z (26), the pattern continues with AA (27), AB (28), etc.
- 28 corresponds to "AB".

### Example 3:

```
Input: columnNumber = 701
Output: "ZY"
```

**Explanation:**

- This follows the base-26 numbering system with A-Z representing 1-26.
- 701 corresponds to "ZY".

## Constraints:

- 1 ≤ columnNumber ≤ 2^31 - 1

## Expected Complexities

- **Time Complexity:** O(log₂₆(n))
- **Auxiliary Space:** O(log₂₆(n))

## Solution Approach

### Key Insight:

This problem is similar to base conversion, but with a twist - it's a **1-indexed base-26 system** where:

- A = 1, B = 2, ..., Z = 26
- Unlike typical base conversion where digits are 0-25, here they are 1-26

### Algorithm:

```java
public String convertToTitle(int columnNumber) {
    StringBuilder result = new StringBuilder();

    while (columnNumber > 0) {
        // Subtract 1 to make it 0-indexed (A=0, B=1, ..., Z=25)
        columnNumber--;

        // Get the character (A + remainder)
        result.append((char) ('A' + columnNumber % 26));

        // Move to next position
        columnNumber /= 26;
    }

    // Reverse because we built it backwards
    return result.reverse().toString();
}
```
