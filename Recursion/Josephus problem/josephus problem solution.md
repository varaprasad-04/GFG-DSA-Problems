# Josephus Problem

**Difficulty:** Easy | **Accuracy:** 57.26% | **Submissions:** 122K+ | **Points:** 2

You are playing a game with `n` people standing in a circle, numbered from 1 to n. Starting from person 1, every kth person is eliminated in a circular fashion. The process continues until only one person remains.

Given integers `n` and `k`, return the position (1-based index) of the person who will survive.

## Examples

### Example 1:

```
Input: n = 5, k = 2
Output: 3
```

**Explanation:** Firstly, the person at position 2 is killed, then the person at position 4 is killed, then the person at position 1 is killed. Finally, the person at position 5 is killed. So the person at position 3 survives.

### Example 2:

```
Input: n = 7, k = 3
Output: 4
```

**Explanation:** The elimination order is 3 → 6 → 2 → 7 → 5 → 1, and the person at position 4 survives.

## Constraints:

- 1 ≤ n, k ≤ 500

## Expected Complexities

- **Time Complexity:** O(n)
- **Auxiliary Space:** O(n)

## Company Tags

- Amazon
- Microsoft
- Walmart

## Topic Tags

- Recursion
- Data Structures
- Algorithms

## Solution Approach

To solve this problem we use **recursion**.

### Algorithm:

1. **Store all values** in a particular data structure
2. **Remove elements** from index 0 to k-1 in circular fashion
3. **Main formula:** `(start + k - 1) % current_number_of_elements`
4. **Apply recursively** until only one element remains
5. **Return** the last surviving element

### Key Formula:

```
(start + k - 1) % current_number_of_elements
```

Where:

- `n` = number of people
- `k` = step count for elimination
- Base case: `josephus(1, k) = 0` (0-indexed)

## Problem Category

- Recursion
- Mathematical Problems
- Game Theory

## Difficulty

Easy
