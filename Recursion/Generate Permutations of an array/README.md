# Generate Permutations of an Array

**Difficulty:** Medium | **Topics:** Backtracking, Arrays, Recursion

Given an array `arr[]` of unique elements. Generate all possible permutations of the elements in the array.

**Note:** You can return the permutations in any order, the driver code will print them in sorted order.

## Examples

### Example 1:

```
Input: arr[] = [1, 2, 3]
Output: [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]
```

**Explanation:** There are 6 possible permutations (3! = 6) of the array.

### Example 2:

```
Input: arr[] = [1, 3]
Output: [[1, 3], [3, 1]]
```

**Explanation:** There are 2 possible permutations (2! = 2) of the array.

## Constraints:

- 1 ≤ arr.size() ≤ 9

## Expected Complexities

- **Time Complexity:** O(n! × n)
- **Auxiliary Space:** O(n)

## Solution Approach

### Intuition:

We use **backtracking** to generate all possible permutations by building them step by step.

### Key Concepts:

1. **Choose:** At each position, we can choose any unused element from the array
2. **Explore:** Recursively build the permutation with the chosen element
3. **Unchoose:** Backtrack by removing the element to try other possibilities

### Algorithm:

1. **Use a frequency array** `freq[]` to track which elements are already used
2. **Build permutation incrementally** by adding one element at a time
3. **Base case:** When current permutation size equals array length, add it to result
4. **Recursive case:** Try each unused element at the current position
5. **Backtrack:** Mark element as unused after exploring that path

### Pseudocode:

```
function generatePermutations(arr):
    result = []
    freq = array of size n, initialized to false
    current = empty list
    backtrack(arr, current, freq, result)
    return result

function backtrack(arr, current, freq, result):
    if current.size() == arr.size():
        result.add(copy of current)
        return

    for i = 0 to arr.size() - 1:
        if not freq[i]:
            freq[i] = true           // Choose
            current.add(arr[i])

            backtrack(arr, current, freq, result)  // Explore

            current.removeLast()     // Unchoose
            freq[i] = false
```

### Step-by-Step Example:

For `arr = [1, 2, 3]`:

```
Start: current = [], freq = [false, false, false]

Level 1: Try 1 → current = [1], freq = [true, false, false]
  Level 2: Try 2 → current = [1, 2], freq = [true, true, false]
    Level 3: Try 3 → current = [1, 2, 3] ✓ Add to result
  Level 2: Try 3 → current = [1, 3], freq = [true, false, true]
    Level 3: Try 2 → current = [1, 3, 2] ✓ Add to result

Level 1: Try 2 → current = [2], freq = [false, true, false]
  ... and so on
```

## Topic Tags

- Backtracking
- Arrays
- Recursion
- Permutation
- Combinatorics

## Problem Category

- Backtracking
- Array Manipulation
- Recursive Problems

## Difficulty

Medium
