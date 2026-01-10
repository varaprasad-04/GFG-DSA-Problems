# Substring with K Distinct Characters

You are given a string `s` consisting of lowercase characters and an integer `k`. You have to count all possible substrings that have exactly `k` distinct characters.

## Examples

### Example 1:

```
Input: s = "abc", k = 2
Output: 2
Explanation: Possible substrings are ["ab", "bc"]
```

### Example 2:

```
Input: s = "aba", k = 2
Output: 3
Explanation: Possible substrings are ["ab", "ba", "aba"]
```

### Example 3:

```
Input: s = "aa", k = 1
Output: 3
Explanation: Possible substrings are ["a", "a", "aa"]
```

## Constraints:

- 1 ≤ s.size() ≤ 10^6
- 1 ≤ k ≤ 26

## Expected Complexities

- **Time Complexity:** O(n)
- **Auxiliary Space:** O(1)

## Topic Tags

- Sliding Window
- String
- Hash Map
- Two Pointer Algorithm

## Problem Category

- Sliding Window
- String
- Substring Problems

## Difficulty

Medium

## This is same as exactly k sum subarray problem you can easily understand
