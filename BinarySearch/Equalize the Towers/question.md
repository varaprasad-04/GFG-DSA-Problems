# Equalize the Towers

**Difficulty:** Medium | **Topics:** Arrays, Binary Search, Optimization

You are given an array `heights[]` representing the heights of towers and another array `cost[]` where each element represents the cost of modifying the height of respective tower.

The goal is to make all towers of same height by either adding or removing blocks from each tower.

**Rules:**

- Modifying the height of tower `i` by 1 unit (add or remove) costs `cost[i]`
- You can add or remove any number of blocks from any tower
- All towers must reach the same final height

Return the minimum cost to equalize the heights of all the towers.

## Examples

### Example 1:

```
Input: heights[] = [1, 2, 3], cost[] = [10, 100, 1000]
Output: 120
```

**Explanation:**
The heights can be equalized by either:

- **Option 1:** "Removing one block from tower 3 and adding one in tower 1"
  - Cost = 1000 (remove from 3) + 10 (add to 1) = 1010
- **Option 2:** "Adding two blocks in tower 1 and adding one in tower 2"
  - Cost = 10×2 (add 2 to tower 1) + 100×1 (add 1 to tower 2) = 120

Since 120 < 1010, the minimum cost is 120.

### Example 2:

```
Input: heights[] = [7, 1, 5], cost[] = [1, 1, 1]
Output: 6
```

**Explanation:**
The minimum cost to equalize the towers is 6, achieved by setting all towers to height 5:

- Tower 1: Remove 2 blocks → Cost = 1×2 = 2
- Tower 2: Add 4 blocks → Cost = 1×4 = 4
- Tower 3: No change → Cost = 0
- Total cost = 2 + 4 + 0 = 6

## Constraints:

- 1 ≤ heights.size() = cost.size() ≤ 10^5
- 1 ≤ heights[i] ≤ 10^4
- 1 ≤ cost[i] ≤ 10^3

## Expected Complexities

- **Time Complexity:** O(n log(max_height))
- **Auxiliary Space:** O(1)

## Solution Approach

### Key Insight:

This is a **binary search on answer** problem. We need to find the optimal target height that minimizes the total cost.

### Algorithm:

1. **Search Range:** The optimal target height lies between `min(heights)` and `max(heights)`
2. **Binary Search:** Try different target heights and find the one with minimum cost
3. **Cost Calculation:** For each target height, calculate the total cost to transform all towers

### Cost Calculation Formula:

For target height `h`:

```
Total Cost = Σ |heights[i] - h| × cost[i]
```

Where:

- If `heights[i] > h`: Remove `(heights[i] - h)` blocks, cost = `(heights[i] - h) × cost[i]`
- If `heights[i] < h`: Add `(h - heights[i])` blocks, cost = `(h - heights[i]) × cost[i]`

### Binary Search Strategy:

The cost function is **unimodal** (has a single minimum), so we can use ternary search or check the derivative to find the optimal point.

### Alternative Approaches:

1. **Brute Force:** Try all possible heights from `min(heights)` to `max(heights)`
2. **Mathematical:** Find the weighted median for optimal solution
3. **Binary Search:** More efficient for large ranges

### Step-by-Step Process:

1. **Define search boundaries:** `[min(heights), max(heights)]`
2. **For each candidate height:** Calculate total transformation cost
3. **Find the height** that gives minimum cost
4. **Return minimum cost**

## Company Tags

- Google
- Amazon

## Topic Tags

- Arrays
- Binary Search
- Optimization
- Mathematical

## Problem Category

- Binary Search
- Optimization Problems
- Array Manipulation

## Difficulty

Medium
