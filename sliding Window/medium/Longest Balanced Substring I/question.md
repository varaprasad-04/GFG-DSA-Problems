# Longest Balanced Substring I

**Difficulty:** Medium | **Topics:** String, Hash Map, Sliding Window

You are given a string `s` consisting of lowercase English letters.

A substring of `s` is called **balanced** if all distinct characters in the substring appear the same number of times.

Return the length of the longest balanced substring of `s`.

## Examples

### Example 1:

```
Input: s = "abbac"
Output: 4
```

**Explanation:** The longest balanced substring is "abba" because both distinct characters 'a' and 'b' each appear exactly 2 times.

### Example 2:

```
Input: s = "zzabccy"
Output: 4
```

**Explanation:** The longest balanced substring is "zabc" because the distinct characters 'z', 'a', 'b', and 'c' each appear exactly 1 time.

### Example 3:

```
Input: s = "aba"
Output: 2
```

**Explanation:** One of the longest balanced substrings is "ab" because both distinct characters 'a' and 'b' each appear exactly 1 time. Another longest balanced substring is "ba".

## Constraints:

- 1 ≤ s.length ≤ 1000
- s consists of lowercase English letters

## Expected Complexities

- **Time Complexity:** O(n²) or O(n³)
- **Auxiliary Space:** O(1) or O(26)

## Solution Approach

### Key Insight:

A substring is balanced when all distinct characters have the same frequency. We need to check all possible substrings and find the longest one that satisfies this condition.

### Algorithm:

#### **Approach 1: Brute Force**

1. **Generate all substrings** using nested loops
2. **For each substring:**
   - Count frequency of each character
   - Check if all frequencies are equal
   - Track maximum length of valid substrings

#### **Approach 2: Optimized with Early Termination**

1. **For each starting position:**
   - Maintain character frequency map
   - Extend substring character by character
   - Check balance condition at each extension
   - Update maximum length when balanced

### Balance Check Logic:

For a substring to be balanced:

```
All non-zero frequencies must be equal
```

### Implementation Strategy:

```
For each starting index i:
    frequency_map = empty
    For each ending index j from i:
        Add s[j] to frequency_map
        If all frequencies are equal:
            Update max_length = max(max_length, j - i + 1)
```

### Frequency Validation:

A substring is balanced when:

1. **All characters** have the same frequency count
2. **No character** has frequency 0 (since we only consider distinct characters in substring)

## Company Tags

- Google
- Meta

## Topic Tags

- String
- Hash Map
- Brute Force
- Sliding Window

## Problem Category

- String Processing
- Substring Problems
- Frequency Analysis

## Difficulty

Medium
