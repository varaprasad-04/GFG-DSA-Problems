# Maximum Length of Pair Chain

**Difficulty:** Medium | **Topics:** Greedy Algorithm, Dynamic Programming, Sorting

You are given an array of `n` pairs `pairs` where `pairs[i] = [lefti, righti]` and `lefti < righti`.

A pair `p2 = [c, d]` follows a pair `p1 = [a, b]` if `b < c`. A chain of pairs can be formed in this fashion.

Return the length of the longest chain which can be formed.

**Note:** You do not need to use up all the given intervals. You can select pairs in any order.

## Examples

### Example 1:

```
Input: pairs = [[1,2],[2,3],[3,4]]
Output: 2
```

**Explanation:** The longest chain is [1,2] → [3,4].

- We cannot include [2,3] because 2 is not less than 2

### Example 2:

```
Input: pairs = [[1,2],[7,8],[4,5]]
Output: 3
```

**Explanation:** The longest chain is [1,2] → [4,5] → [7,8].

- All pairs can be chained: 2 < 4 < 5 < 7

### Example 3:

```
Input: pairs = [[1,2],[3,4],[2,3]]
Output: 2
```

**Explanation:** The longest chain can be [1,2] → [3,4] or [1,2] → [2,3], both have length 2.

## Constraints:

- n == pairs.length
- 1 ≤ n ≤ 1000
- -1000 ≤ lefti < righti ≤ 1000

## Expected Complexities

- **Time Complexity:** O(n log n)
- **Auxiliary Space:** O(1)

## Solution Approach

This is a classic **Activity Selection Problem** variant that can be solved optimally using a **greedy approach**.

### Key Insight:

To maximize the chain length, we should always select the pair that ends earliest among all available pairs. This leaves maximum opportunity to chain more pairs.

### Algorithm:

1. **Sort pairs** by their second element (right value) in ascending order
2. **Initialize** count = 1 and currentEnd = first pair's right value
3. **Iterate through remaining pairs:**
   - If current pair's left value > currentEnd:
     - Include this pair in the chain
     - Update currentEnd to this pair's right value
     - Increment count
4. **Return** the count

### Pseudocode:

```
function findLongestChain(pairs):
    // Sort by second element (right value)
    sort(pairs by pairs[i][1])

    count = 1
    currentEnd = pairs[0][1]

    for i = 1 to pairs.length - 1:
        if pairs[i][0] > currentEnd:
            count++
            currentEnd = pairs[i][1]

    return count
```

### Example Walkthrough:

For `pairs = [[1,2],[7,8],[4,5]]`:

1. **Sort by second element:** [[1,2],[4,5],[7,8]]
2. **Selection process:**
   - Select [1,2], currentEnd = 2, count = 1
   - Check [4,5]: 4 > 2 ✓ Select, currentEnd = 5, count = 2
   - Check [7,8]: 7 > 5 ✓ Select, currentEnd = 8, count = 3
3. **Result:** Maximum chain length = 3

## Alternative Approach - Dynamic Programming

We can also solve this using DP with O(n²) time complexity:

```
function findLongestChainDP(pairs):
    sort(pairs by pairs[i][0])  // Sort by first element
    dp = array of size n, initialized to 1

    for i = 1 to n-1:
        for j = 0 to i-1:
            if pairs[j][1] < pairs[i][0]:
                dp[i] = max(dp[i], dp[j] + 1)

    return max(dp)
```

## Company Tags

- Amazon
- Microsoft
- Google
- Facebook

## Topic Tags

- Greedy Algorithm
- Dynamic Programming
- Sorting
- Arrays
- Activity Selection

## Problem Category

- Greedy Algorithm
- Interval Problems
- Chain Formation

## Difficulty

Medium
