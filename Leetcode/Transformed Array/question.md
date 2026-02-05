# Transformed Array

**Difficulty:** Easy | **Topics:** Array, Simulation, Modular Arithmetic

You are given an integer array `nums` that represents a circular array. Your task is to create a new array `result` of the same size, following these rules:

For each index `i` (where `0 ≤ i < nums.length`), perform the following independent actions:

- **If `nums[i] > 0`:** Start at index `i` and move `nums[i]` steps to the right in the circular array. Set `result[i]` to the value of the index where you land.
- **If `nums[i] < 0`:** Start at index `i` and move `abs(nums[i])` steps to the left in the circular array. Set `result[i]` to the value of the index where you land.
- **If `nums[i] == 0`:** Set `result[i]` to `nums[i]`.

Return the new array `result`.

**Note:** Since `nums` is circular, moving past the last element wraps around to the beginning, and moving before the first element wraps back to the end.

## Examples

### Example 1:

```
Input: nums = [3, -2, 1, 1]
Output: [1, 1, 1, 3]
```

**Explanation:**

- For `nums[0] = 3`: Move 3 steps to right from index 0 → reach `nums[3] = 1`. So `result[0] = 1`
- For `nums[1] = -2`: Move 2 steps to left from index 1 → reach `nums[3] = 1`. So `result[1] = 1`
- For `nums[2] = 1`: Move 1 step to right from index 2 → reach `nums[3] = 1`. So `result[2] = 1`
- For `nums[3] = 1`: Move 1 step to right from index 3 → reach `nums[0] = 3`. So `result[3] = 3`

### Example 2:

```
Input: nums = [-1, 4, -1]
Output: [-1, -1, 4]
```

**Explanation:**

- For `nums[0] = -1`: Move 1 step to left from index 0 → reach `nums[2] = -1`. So `result[0] = -1`
- For `nums[1] = 4`: Move 4 steps to right from index 1 → reach `nums[2] = -1`. So `result[1] = -1`
- For `nums[2] = -1`: Move 1 step to left from index 2 → reach `nums[1] = 4`. So `result[2] = 4`

## Constraints:

- 1 ≤ nums.length ≤ 100
- -100 ≤ nums[i] ≤ 100

## Expected Complexities

- **Time Complexity:** O(n)
- **Auxiliary Space:** O(1) excluding the result array

## Solution Approach

### Key Insight:

Since the array is circular, we need to handle wraparound when moving left or right. We can use modular arithmetic to calculate the target index.

### Algorithm:

1. **For each element** at index `i`:
   - If `nums[i] > 0`: Calculate `(i + nums[i]) % n` for rightward movement
   - If `nums[i] < 0`: Calculate `(i + nums[i]) % n` for leftward movement (handle negative modulo)
   - If `nums[i] == 0`: Simply copy the value

2. **Handle negative modulo** for leftward movement:
   - `(i + nums[i]) % n` might be negative
   - Use `((i + nums[i]) % n + n) % n` to ensure positive result

### Mathematical Formula:

```
For positive nums[i]: target_index = (i + nums[i]) % n
For negative nums[i]: target_index = ((i + nums[i]) % n + n) % n
For zero nums[i]: result[i] = nums[i]
```

## Topic Tags

- Array
- Simulation
- Modular Arithmetic
- Circular Array

## Problem Category

- Array Manipulation
- Mathematical Problems
- Simulation

## Difficulty

Easy
