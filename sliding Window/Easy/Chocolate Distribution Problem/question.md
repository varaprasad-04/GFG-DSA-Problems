# Excel Sheet Column Number

**Difficulty:** Easy | **Topics:** Math, String

Given a string `columnTitle` that represents the column title as it appears in an Excel sheet, return its corresponding column number.

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
Input: columnTitle = "A"
Output: 1
```

**Explanation:** Column "A" corresponds to 1 in Excel.

### Example 2:

```
Input: columnTitle = "AB"
Output: 28
```

**Explanation:**

- A = 1, B = 2, ..., Z = 26, AA = 27, AB = 28
- "AB" corresponds to 28.

### Example 3:

```
Input: columnTitle = "ZY"
Output: 701
```

**Explanation:**

- This follows the base-26 numbering system with A-Z representing 1-26.
- "ZY" corresponds to 701.

## Constraints:

- 1 ≤ columnTitle.length ≤ 7
- columnTitle consists only of uppercase English letters
- columnTitle is in the range ["A", "FXSHRXW"]

## Expected Complexities

- **Time Complexity:** O(n)
- **Auxiliary Space:** O(1)

## Solution Approach

### Key Insight:

This is a **base-26 number system conversion** where:

- A = 1, B = 2, ..., Z = 26
- Each position represents a power of 26
- Unlike typical base conversion, this uses 1-26 instead of 0-25

### Algorithm:

```java
public int titleToNumber(String columnTitle) {
    int result = 0;

    for (int i = 0; i < columnTitle.length(); i++) {
        // Get the numeric value of current character (A=1, B=2, ..., Z=26)
        int charValue = columnTitle.charAt(i) - 'A' + 1;

        // Multiply by 26^position and add to result
        result = result * 26 + charValue;
    }

    return result;
}
```
