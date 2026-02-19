# Count Binary Substrings

**Difficulty:** Medium | **Topics:** String, Two Pointers

Given a binary string `s`, return the number of non-empty substrings that have the same number of 0's and 1's, and all the 0's and all the 1's in these substrings are grouped consecutively.

**Note:** Substrings that occur multiple times are counted the number of times they occur.

## Examples

### Example 1:

```
Input: s = "00110011"
Output: 6
```

**Explanation:** There are 6 substrings that have equal number of consecutive 1's and 0's:

- `"0011"` (positions 0-3)
- `"01"` (positions 1-2)
- `"1100"` (positions 2-5)
- `"10"` (positions 3-4)
- `"0011"` (positions 4-7)
- `"01"` (positions 5-6)

**Note:** Some substrings repeat and are counted each time they occur. Also, `"00110011"` is not valid because all 0's and 1's are not grouped consecutively within the substring.

### Example 2:

```
Input: s = "10101"
Output: 4
```

**Explanation:** There are 4 substrings: `"10"`, `"01"`, `"10"`, `"01"` that have equal number of consecutive 1's and 0's.

## Constraints:

- 1 ≤ s.length ≤ 10^5
- s[i] is either '0' or '1'

## Expected Complexities

- **Time Complexity:** O(n)
- **Auxiliary Space:** O(1)

## Solution Approach

### Key Insight:

Valid substrings must have consecutive 0's followed by consecutive 1's (or vice versa) with equal counts. We can solve this by counting consecutive groups and finding valid pairs between adjacent groups.

### Algorithm:

1. **Count consecutive groups** of same characters
2. **For each pair of adjacent groups**, the number of valid substrings equals the minimum of their sizes
3. **Sum up all valid substrings** from adjacent group pairs

### Step-by-Step Process:

For `s = "00110011"`:

1. **Identify groups:** `[2, 2, 2, 2]` (groups of consecutive same characters)
   - Group 1: "00" (count = 2)
   - Group 2: "11" (count = 2)
   - Group 3: "00" (count = 2)
   - Group 4: "11" (count = 2)

2. **Count valid substrings between adjacent groups:**
   - Between groups 1 and 2: min(2, 2) = 2 → substrings: "01", "0011"
   - Between groups 2 and 3: min(2, 2) = 2 → substrings: "10", "1100"
   - Between groups 3 and 4: min(2, 2) = 2 → substrings: "01", "0011"

3. **Total:** 2 + 2 + 2 = 6

### Why This Works:

- **Adjacent groups:** Only consecutive groups of different characters can form valid substrings
- **Minimum count:** The number of valid substrings between two groups equals the smaller group size
- **All combinations:** This counts all possible valid substrings of different lengths

### Pattern Recognition:

For consecutive groups of sizes `a` and `b`:

- Valid substring lengths: 1, 2, ..., min(a, b)
- Each length has exactly 1 valid substring
- Total: min(a, b) substrings

### Example Breakdown:

For groups "00" and "11":

- Length 1: "01"
- Length 2: "0011"
- Total: min(2, 2) = 2 substrings

## Company Tags

- Facebook
- Amazon

## Topic Tags

- String
- Two Pointers
- Pattern Matching
- Consecutive Groups

## Problem Category

- String Processing
- Substring Problems
- Pattern Recognition

## Difficulty

Medium
