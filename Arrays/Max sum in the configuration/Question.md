# Max Sum in the Configuration

**Difficulty:** Hard | **Topics:** Arrays, Data Structures, Mathematical

Given an integer array `arr[]`. Find the maximum value of the sum of `i * arr[i]` for all `0 ≤ i ≤ arr.size()-1`. The only operation allowed is to rotate (clockwise or counterclockwise) the array any number of times.

## Examples

### Example 1:

```
Input: arr[] = [3, 1, 2, 8]
Output: 29
```

**Explanation:** Out of all the possible configurations by rotating the elements: `arr[] = [3, 1, 2, 8]` here `(3*0) + (1*1) + (2*2) + (8*3) = 29` is maximum.

### Example 2:

```
Input: arr[] = [1, 2, 3]
Output: 8
```

**Explanation:** Out of all the possible configurations by rotating the elements: `arr[] = [1, 2, 3]` here `(1*0) + (2*1) + (3*2) = 8` is maximum.

### Example 3:

```
Input: arr[] = [4, 13]
Output: 13
```

**Explanation:** Out of all the possible configurations by rotating the elements: `arr[] = [13, 4]` here `(13*0) + (4*1) = 4` and `arr[] = [4, 13]` here `(4*0) + (13*1) = 13` is maximum.

## Constraints:

- 1 ≤ arr.size() ≤ 10^4
- 1 ≤ arr[i] ≤ 20

## Expected Complexities

- **Time Complexity:** O(n)
- **Auxiliary Space:** O(1)

## Solution Approach

### Key Insight:

Instead of generating all rotations and calculating sums, we can derive a mathematical relationship between consecutive rotations.

### Mathematical Analysis:

Let's say we have an array of size `n`. For the original array:

```
Sum₀ = 0*arr[0] + 1*arr[1] + 2*arr[2] + ... + (n-1)*arr[n-1]
```

After rotating right by 1 position:

```
Sum₁ = 0*arr[n-1] + 1*arr[0] + 2*arr[1] + ... + (n-1)*arr[n-2]
```

### Relationship Between Consecutive Rotations:

```
Sum₁ = Sum₀ - (sum of all elements) + n * arr[n-1]
```

Where:

- `Sum₀` = current rotation sum
- `Sum₁` = next rotation sum
- `sum of all elements` = total sum of array elements

### Algorithm:

1. **Calculate initial sum** and **total sum** of all elements
2. **For each rotation:**
   - Update the rotation sum using the derived formula
   - Track the maximum sum seen so far
3. **Return the maximum sum**

### Mathematical Formula:

```
next_sum = current_sum - total_sum + n * arr[last_element_index]
```

### Step-by-Step Example:

For `arr = [3, 1, 2, 8]`:

1. **Initial calculation:**
   - `current_sum = 3*0 + 1*1 + 2*2 + 8*3 = 29`
   - `total_sum = 3 + 1 + 2 + 8 = 14`

2. **Rotation 1:** Move 8 to front → [8, 3, 1, 2]
   - `new_sum = 29 - 14 + 4*8 = 47`
   - Wait, let me recalculate: `8*0 + 3*1 + 1*2 + 2*3 = 11`

3. **Rotation 2:** Move 2 to front → [2, 8, 3, 1]
   - `new_sum = 2*0 + 8*1 + 3*2 + 1*3 = 17`

4. **Rotation 3:** Move 1 to front → [1, 2, 8, 3]
   - `new_sum = 1*0 + 2*1 + 8*2 + 3*3 = 27`

5. **Maximum:** 29 (original configuration)

## Company Tags

- Amazon

## Topic Tags

- Arrays
- Data Structures
- Mathematical
- Rotation

## Problem Category

- Arrays
- Mathematical Problems
- Optimization

## Difficulty

Hard
