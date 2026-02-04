# Last Moment Before All Ants Fall Out

**Difficulty:** Medium | **Topics:** Greedy, Arrays

We have a wooden plank of length `n` units. Some ants are walking on the plank, each ant moves with a speed of 1 unit per second, with some moving left and others right.

When two ants moving in two different directions meet at some point, they change their directions and continue moving again. Assume changing directions does not take any additional time. When an ant reaches one end of the plank at a time `t`, it falls out of the plank immediately.

Given an integer `n` and two integer arrays `left[]` and `right[]`, the positions of the ants moving to the left and the right, return the time when the last ant(s) fall out of the plank.

## Examples

### Example 1:

```
Input: n = 4, left[] = [2], right[] = [0, 1, 3]
Output: 4
```

**Explanation:** As seen in the above image, the last ant falls off the plank at t = 4.

### Example 2:

```
Input: n = 4, left[] = [], right[] = [0, 1, 2, 3, 4]
Output: 4
```

**Explanation:** All ants are going to the right, the ant at index 0 needs 4 seconds to fall.

### Example 3:

```
Input: n = 3, left[] = [0], right[] = [3]
Output: 0
```

**Explanation:** The ants will fall off the plank as they are already on the end of the plank.

## Constraints:

- 1 ≤ n ≤ 10^5
- 0 ≤ left.length, right.length ≤ n + 1
- 0 ≤ left[i], right[i] ≤ n
- 1 ≤ left.length + right.length ≤ n + 1
- All values of left and right are unique, and each value can appear only in one of the two arrays

## Expected Complexities

- **Time Complexity:** O(n)
- **Auxiliary Space:** O(1)

## Solution Approach

### Key Insight:

When ants collide and change directions, we can think of them as passing through each other instead of changing directions. The total time remains the same because each ant will eventually fall off at the same time it would have if there were no collisions.

### Algorithm:

1. **For ants moving left:** Calculate the maximum time needed for any left-moving ant to reach position 0
   - Time for ant at position `left[i]` to reach 0 = `left[i]`

2. **For ants moving right:** Calculate the maximum time needed for any right-moving ant to reach position n
   - Time for ant at position `right[i]` to reach n = `n - right[i]`

3. **Return the maximum** of all these times

### Mathematical Formula:

```
Maximum Time = max(
    max(left[i]) for all i,           // Left-moving ants
    max(n - right[i]) for all i       // Right-moving ants
)
```

### Why This Works:

- **Left-moving ants:** Need to travel from their current position to 0
- **Right-moving ants:** Need to travel from their current position to n
- **Collisions don't matter:** We can treat them as ants passing through each other
- **Last ant:** The one that takes the longest time to reach either end

## Company Tags

- Google

## Topic Tags

- Greedy
- Arrays
- Simulation

## Problem Category

- Greedy Algorithm
- Array Manipulation
- Physics Simulation

## Difficulty

Medium
