# Maximum People Visible in a Line

You are given an array `arr[]`, where `arr[i]` represents the height of the ith person standing in a line.

A person `i` can see another person `j` if:

- `height[j] < height[i]`
- There is no person `k` standing between them such that `height[k] ≥ height[i]`

Each person can see in both directions (front and back).

Your task is to find the maximum number of people that any person can see (including themselves).

## Examples

### Example 1:

```
Input: arr[] = [6, 2, 5, 4, 5, 1, 6]
Output: 6
```

**Explanation:**

- Person 1 (height = 6) can see five other people at positions (2, 3, 4, 5, 6) in addition to himself, i.e. total 6
- Person 2 (height = 2) can see only himself
- Person 3 (height = 5) is able to see people 2nd, 3rd, and 4th person
- Person 4 (height = 4) can see himself
- Person 5 (height = 5) can see people 4th, 5th, and 6th
- Person 6 (height = 1) can only see himself
- Person 7 (height = 6) can see 2nd, 3rd, 4th, 5th, 6th, and 7th people

A maximum of six people can be seen by Person 1 and Person 7.

### Example 2:

```
Input: arr[] = [1, 3, 6, 4]
Output: 4
```

**Explanation:** Person with height 6 can see persons with heights 1, 3 on the left and 4 on the right, along with himself, giving a total of 4.

## Constraints:

- 1 ≤ arr.size() ≤ 10^4
- 1 ≤ arr[i] ≤ 10^5

## Expected Complexities

- **Time Complexity:** O(n)
- **Auxiliary Space:** O(n)

## Topic Tags

- Stack
- Arrays
- Data Structures
- Monotonic Stack

## Problem Category

- Stack
- Array
- Line of Sight Problems

## Difficulty

Medium

# Solution Explanation - Maximum People Visible in a Line

## Approach

To solve this problem, we use a **monotonic stack approach**.

For each person, we find the nearest person with height greater than or equal to them on both the left side and the right side. These two people act as boundaries, because visibility stops when someone of greater or equal height appears.

## Algorithm

We maintain two arrays:

- **`previousGreater[]`** → index of nearest greater or equal element on the left
- **`nextGreater[]`** → index of nearest greater or equal element on the right

Using **monotonic decreasing stacks**, we can compute these arrays in O(n) time.

## Key Insight

All people lying between these two boundaries have height smaller than the current person, so they are all visible.

## Formula

The number of people visible for index `i` is:

```
visible = nextGreater[i] - previousGreater[i] - 1
```

We calculate this for every index and return the maximum value.

## Complexity Analysis

- **Time Complexity:** O(n)
- **Space Complexity:** O(n)

## Steps

1. **Find Previous Greater Elements:** Use a monotonic stack to find the nearest greater or equal element on the left for each position
2. **Find Next Greater Elements:** Use a monotonic stack to find the nearest greater or equal element on the right for each position
3. **Calculate Visible People:** For each position, count people between the boundaries using the formula
4. **Return Maximum:** Find and return the maximum count among all positions

## Why Monotonic Stack?

- Monotonic decreasing stack helps us efficiently find the nearest greater elements
- Each element is pushed and popped at most once, ensuring O(n) time complexity
- Stack maintains elements in decreasing order, making boundary detection straightforward
