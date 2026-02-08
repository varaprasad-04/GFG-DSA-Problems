# Merge Adjacent Equal Elements

**Difficulty:** Medium | **Topics:** Stack, Array, Simulation

You are given an integer array `nums`.

You must repeatedly apply the following merge operation until no more changes can be made:

- If any two adjacent elements are equal, choose the **leftmost** such adjacent pair in the current array and replace them with a single element equal to their sum.
- After each merge operation, the array size decreases by 1. Repeat the process on the updated array until no more changes can be made.

Return the final array after all possible merge operations.

## Examples

### Example 1:

```
Input: nums = [3,1,1,2]
Output: [3,4]
```

**Explanation:**

- Step 1: The middle two elements are equal → merge 1 + 1 = 2 → `[3, 2, 2]`
- Step 2: The last two elements are equal → merge 2 + 2 = 4 → `[3, 4]`
- No adjacent equal elements remain. Final answer: `[3, 4]`

### Example 2:

```
Input: nums = [2,2,4]
Output: [8]
```

**Explanation:**

- Step 1: The first two elements are equal → merge 2 + 2 = 4 → `[4, 4]`
- Step 2: The first two elements are equal → merge 4 + 4 = 8 → `[8]`
- Final answer: `[8]`

### Example 3:

```
Input: nums = [3,7,5]
Output: [3,7,5]
```

**Explanation:**

- There are no adjacent equal elements in the array, so no operations are performed.
- Final answer: `[3,7,5]`

## Constraints:

- 1 ≤ nums.length ≤ 10^5
- 1 ≤ nums[i] ≤ 10^5

## Expected Complexities

- **Time Complexity:** O(n)
- **Auxiliary Space:** O(n)

## Solution Approach

### Key Insight:

This problem is perfect for a **stack-based approach** because:

1. We need to process elements from left to right
2. When we merge elements, we might create new adjacent equal pairs with previously processed elements
3. Stack allows us to efficiently check and merge with the most recently added element

### Algorithm:

1. **Use a stack** to store the final result
2. **For each element** in the array:
   - If stack is empty OR top of stack ≠ current element: Push current element
   - If top of stack = current element: Pop from stack, add (popped + current), and push the sum
3. **Continue until** all elements are processed
4. **Return** stack contents as the final array

### Why Stack Works:

- **Leftmost priority:** Stack naturally processes from left to right
- **Cascading merges:** When we merge and push back, the new element can immediately merge with the stack top
- **Efficient:** Each element is pushed and popped at most once

### Step-by-Step Example:

For `nums = [3,1,1,2]`:

```
Stack: []
Process 3: Stack = [3]
Process 1: Stack = [3,1]
Process 1: 1 == 1 (top), merge → Stack = [3,2]
Process 2: 2 == 2 (top), merge → Stack = [3,4]
Result: [3,4]
```

### Cascading Effect Example:

For `nums = [2,2,2,2]`:

```
Stack: []
Process 2: Stack = [2]
Process 2: 2 == 2 (top), merge → Stack = [4]
Process 2: 2 ≠ 4 (top) → Stack = [4,2]
Process 2: 2 == 2 (top), merge → Stack = [4,4]
Now 4 == 4 (cascading merge) → Stack = [8]
Result: [8]
```

## Company Tags

- Google
- Meta

## Topic Tags

- Stack
- Array
- Simulation
- Greedy

## Problem Category

- Stack
- Array Manipulation
- Simulation Problems

## Difficulty

Medium
