# Isomorphic Strings

**Difficulty:** Easy | **Topics:** Strings, Data Structures, Hash

Given two strings `s1` and `s2` consisting of only lowercase English letters and of equal length, check if these two strings are isomorphic to each other.

If the characters in `s1` can be changed to get `s2`, then two strings, `s1` and `s2` are isomorphic. A character must be completely swapped out for another character while maintaining the order of the characters. A character may map to itself, but no two characters may map to the same character.

## Examples

### Example 1:

```
Input: s1 = "aab", s2 = "xxy"
Output: true
```

**Explanation:** Each character in s1 can be consistently mapped to a unique character in s2 (a → x, b → y).

**Mapping Analysis:**

- Position 0: a → x
- Position 1: a → x (consistent with previous mapping)
- Position 2: b → y

### Example 2:

```
Input: s1 = "aab", s2 = "xyz"
Output: false
```

**Explanation:** Same character 'a' in s1 maps to two different characters 'x' and 'y' in s2.

**Mapping Analysis:**

- Position 0: a → x
- Position 1: a → y (inconsistent! 'a' already mapped to 'x')

### Example 3:

```
Input: s1 = "abc", s2 = "xxz"
Output: false
```

**Explanation:** Two different characters 'a' and 'b' in s1 maps with same character 'x' in s2.

**Mapping Analysis:**

- Position 0: a → x
- Position 1: b → x (invalid! 'x' already mapped from 'a')

## Constraints:

- 1 ≤ s1.size() = s2.size() ≤ 10^5
- s1 and s2 consist of only lowercase English letters

## Expected Complexities

- **Time Complexity:** O(n)
- **Auxiliary Space:** O(1)

## Solution Approach

### Key Insight:

Two strings are isomorphic if there exists a **bijective (one-to-one) mapping** between characters of the two strings. We need to ensure:

1. **Each character in s1 maps to exactly one character in s2**
2. **Each character in s2 is mapped by exactly one character in s1**

### Algorithm:

#### **Approach 1: Two Hash Maps**

1. **Create two mappings:** s1→s2 and s2→s1
2. **Check consistency:** For each character pair, verify both mappings are consistent
3. **Return result:** True if all mappings are valid

#### **Approach 2: Single Pass with Arrays (Optimal)**

Since we only have lowercase letters, use arrays of size 26 for O(1) space complexity:

```java
public boolean areIsomorphic(String s1, String s2) {
    int[] mapS1 = new int[26];  // s1 to s2 mapping
    int[] mapS2 = new int[26];  // s2 to s1 mapping

    for (int i = 0; i < s1.length(); i++) {
        char c1 = s1.charAt(i);
        char c2 = s2.charAt(i);

        // Check if mapping is consistent
        if (mapS1[c1 - 'a'] != mapS2[c2 - 'a']) {
            return false;
        }

        // Update mappings with current position + 1
        mapS1[c1 - 'a'] = i + 1;
        mapS2[c2 - 'a'] = i + 1;
    }

    return true;
}
```

### Step-by-Step Example:

For `s1 = "aab", s2 = "xxy"`:

```
Position 0: (a, x)
- mapS1[0] = 0, mapS2[23] = 0 → Equal ✓
- Update: mapS1[0] = 1, mapS2[23] = 1

Position 1: (a, x)
- mapS1[0] = 1, mapS2[23] = 1 → Equal ✓
- Update: mapS1[0] = 2, mapS2[23] = 2

Position 2: (b, y)
- mapS1[1] = 0, mapS2[24] = 0 → Equal ✓
- Update: mapS1[1] = 3, mapS2[24] = 3

Result: true
```

For `s1 = "aab", s2 = "xyz"`:

```
Position 0: (a, x)
- mapS1[0] = 0, mapS2[23] = 0 → Equal ✓
- Update: mapS1[0] = 1, mapS2[23] = 1

Position 1: (a, y)
- mapS1[0] = 1, mapS2[24] = 0 → Not equal ✗

Result: false
```

### Why This Works:

- **Position-based mapping:** Using position+1 ensures we track the last seen position
- **Bidirectional check:** Both mappings must be consistent for valid isomorphism
- **Early termination:** Return false as soon as inconsistency is found

### Edge Cases:

- **Identical strings:** Always isomorphic
- **Single character:** Always isomorphic if equal length
- **Empty strings:** Isomorphic by definition
- **Self-mapping:** Character can map to itself

## Company Tags

- Google

## Topic Tags

- Strings
- Data Structures
- Hash
- Character Mapping

## Problem Category

- String Processing
- Hash Map Applications
- Character Mapping

## Difficulty

Easy
