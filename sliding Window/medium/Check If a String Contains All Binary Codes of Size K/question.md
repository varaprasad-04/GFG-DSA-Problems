# Check If a String Contains All Binary Codes of Size K

**Difficulty:** Medium | **Topics:** Hash Set, String, Sliding Window

Given a binary string `s` and an integer `k`, return `true` if every binary code of length `k` is a substring of `s`. Otherwise, return `false`.

## Examples

### Example 1:

```
Input: s = "00110110", k = 2
Output: true
```

**Explanation:** The binary codes of length 2 are "00", "01", "10" and "11". They can be all found as substrings at indices 0, 1, 3 and 2 respectively.

### Example 2:

```
Input: s = "0110", k = 1
Output: true
```

**Explanation:** The binary codes of length 1 are "0" and "1", it is clear that both exist as a substring.

### Example 3:

```
Input: s = "0110", k = 2
Output: false
```

**Explanation:** The binary code "00" is of length 2 and does not exist in the string.

## Constraints:

- 1 ≤ s.length ≤ 5 × 10^5
- s[i] is either '0' or '1'
- 1 ≤ k ≤ 20

## Expected Complexities

- **Time Complexity:** O(n × k)
- **Auxiliary Space:** O(2^k × k)

## Solution Approach

### Key Insight:

For a given `k`, there are exactly **2^k** possible binary codes of length `k`. We need to check if all of them appear as substrings in the given string `s`.

### Total Binary Codes of Length k:

- k = 1: "0", "1" → 2^1 = 2 codes
- k = 2: "00", "01", "10", "11" → 2^2 = 4 codes
- k = 3: "000", "001", "010", "011", "100", "101", "110", "111" → 2^3 = 8 codes

### Algorithm:

#### **Approach 1: Hash Set with Sliding Window**

1. **Early termination:** If `s.length < k`, return false
2. **Length check:** If `s.length < 2^k + k - 1`, return false (minimum length needed)
3. **Sliding window:** Extract all substrings of length `k`
4. **Hash set:** Store unique substrings in a set
5. **Count check:** Return `set.size() == 2^k`

#### **Approach 2: Generate and Check**

1. **Generate all binary codes** of length `k`
2. **Check existence** of each code in string `s`
3. **Return result** based on whether all codes are found

### Step-by-Step Example:

For `s = "00110110", k = 2`:

1. **Required codes:** 2^2 = 4 codes → {"00", "01", "10", "11"}

2. **Extract substrings of length 2:**
   - Index 0-1: "00" ✓
   - Index 1-2: "01" ✓
   - Index 2-3: "11" ✓
   - Index 3-4: "11" (duplicate)
   - Index 4-5: "10" ✓
   - Index 5-6: "01" (duplicate)
   - Index 6-7: "10" (duplicate)

3. **Unique substrings:** {"00", "01", "10", "11"} = 4 codes

4. **Result:** 4 == 2^2 → `true`

### Optimization Strategies:

#### **Early Termination:**

```java
// If string is too short to contain all codes
if (s.length() < (1 << k) + k - 1) {
    return false;
}
```

#### **Efficient Substring Extraction:**

```java
Set<String> seen = new HashSet<>();
for (int i = 0; i <= s.length() - k; i++) {
    seen.add(s.substring(i, i + k));
    // Early termination when all codes found
    if (seen.size() == (1 << k)) {
        return true;
    }
}
return false;
```

### Mathematical Analysis:

**Minimum string length needed:**

- To contain all 2^k codes of length k
- Minimum length = 2^k + k - 1
- This occurs when codes overlap maximally

**Example for k=2:**

- String "00110" contains all 4 codes: "00", "01", "10", "11"
- Length = 4 + 2 - 1 = 5 (but "00110" has length 5)

### Edge Cases:

- **k = 1:** Always check for "0" and "1"
- **String too short:** If `s.length < k`, impossible to have any k-length substring
- **k = 20:** Maximum 2^20 = ~1M possible codes
- **All same character:** e.g., "0000" for k=2 only has "00"

## Company Tags

- Facebook
- Google

## Topic Tags

- Hash Set
- String
- Sliding Window
- Bit Manipulation

## Problem Category

- String Processing
- Sliding Window
- Set Operations

## Difficulty

Medium
