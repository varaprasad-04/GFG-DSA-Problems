# Maximum Non-Negative Product in a Matrix

**Difficulty:** Medium | **Topics:** Dynamic Programming, Matrix

You are given an m × n integer matrix `grid`. Start at top-left (0,0) and move only right or down to reach bottom-right (m-1,n-1). The product of a path is the product of all visited cells. Among all paths, return the maximum non-negative product modulo 10^9 + 7. If the maximum product is negative, return -1.

> The modulo is applied after computing the maximum product (if non-negative).

## Examples

Example 1

```
Input: grid = [[-1,-2,-3],
               [-2,-3,-3],
               [-3,-3,-2]]
Output: -1
```

Explanation: No path yields a non-negative product.

Example 2

```
Input: grid = [[1,-2,1],
               [1,-2,1],
               [3,-4,1]]
Output: 8
```

Explanation: One optimal path product is 8.

Example 3

```
Input: grid = [[1,3],
               [0,-4]]
Output: 0
```

Explanation: A path containing 0 yields product 0.

## Constraints

- m == grid.length, n == grid[i].length
- 1 ≤ m, n ≤ 15
- -4 ≤ grid[i][j] ≤ 4

## Key idea

Because values can be negative, at each cell keep both the maximum and minimum product achievable to that cell. Multiplying by a negative may swap min/max. Use dynamic programming:

- dpMax[i][j] = maximum product to reach (i,j)
- dpMin[i][j] = minimum product to reach (i,j)

Transition from top and left neighbors:

- candidates = { dpMax[top] _ val, dpMin[top] _ val, dpMax[left] _ val, dpMin[left] _ val }
- dpMax[i][j] = max(candidates)
- dpMin[i][j] = min(candidates)

Initialize dpMax[0][0] = dpMin[0][0] = grid[0][0]. Handle edges by considering only existing neighbors.

At the end:

- ans = dpMax[m-1][n-1]
- if ans < 0 return -1
- else return ans % 1_000_000_007

## Pseudocode

```
MOD = 1_000_000_007
m, n = dimensions
dpMax, dpMin = arrays m x n

dpMax[0][0] = dpMin[0][0] = grid[0][0]

for i in 0..m-1:
  for j in 0..n-1:
    if i==0 and j==0: continue
    val = grid[i][j]
    candidates = []
    if i>0:
      candidates.add(dpMax[i-1][j] * val)
      candidates.add(dpMin[i-1][j] * val)
    if j>0:
      candidates.add(dpMax[i][j-1] * val)
      candidates.add(dpMin[i][j-1] * val)
    dpMax[i][j] = max(candidates)
    dpMin[i][j] = min(candidates)

ans = dpMax[m-1][n-1]
if ans < 0: return -1
return ans % MOD
```

## Complexity

- Time: O(m · n)
- Space: O(m · n) (can be optimized to O(n) by rolling arrays)

## Notes

- Use 64-bit integers for intermediate products to avoid overflow before modulo.
- Zeros are handled naturally by candidate set; a zero may produce maximum non-negative product 0.

```<!-- filepath: /home/varaprasad/GFG-DSA-Problems/Matrix/Maximum Non Negative Product in a Matrix/question.md -->
# Maximum Non-Negative Product in a Matrix

**Difficulty:** Medium | **Topics:** Dynamic Programming, Matrix

You are given an m × n integer matrix `grid`. Start at top-left (0,0) and move only right or down to reach bottom-right (m-1,n-1). The product of a path is the product of all visited cells. Among all paths, return the maximum non-negative product modulo 10^9 + 7. If the maximum product is negative, return -1.

> The modulo is applied after computing the maximum product (if non-negative).

## Examples

Example 1
```

Input: grid = [[-1,-2,-3],
               [-2,-3,-3],
               [-3,-3,-2]]
Output: -1

```
Explanation: No path yields a non-negative product.

Example 2
```

Input: grid = [[1,-2,1],
               [1,-2,1],
               [3,-4,1]]
Output: 8

```
Explanation: One optimal path product is 8.

Example 3
```

Input: grid = [[1,3],
               [0,-4]]
Output: 0

```
Explanation: A path containing 0 yields product 0.

## Constraints

- m == grid.length, n == grid[i].length
- 1 ≤ m, n ≤ 15
- -4 ≤ grid[i][j] ≤ 4

## Key idea

Because values can be negative, at each cell keep both the maximum and minimum product achievable to that cell. Multiplying by a negative may swap min/max. Use dynamic programming:

- dpMax[i][j] = maximum product to reach (i,j)
- dpMin[i][j] = minimum product to reach (i,j)

Transition from top and left neighbors:
- candidates = { dpMax[top] * val, dpMin[top] * val, dpMax[left] * val, dpMin[left] * val }
- dpMax[i][j] = max(candidates)
- dpMin[i][j] = min(candidates)

Initialize dpMax[0][0] = dpMin[0][0] = grid[0][0]. Handle edges by considering only existing neighbors.

At the end:
- ans = dpMax[m-1][n-1]
- if ans < 0 return -1
- else return ans % 1_000_000_007

## Pseudocode

```

MOD = 1_000_000_007
m, n = dimensions
dpMax, dpMin = arrays m x n

dpMax[0][0] = dpMin[0][0] = grid[0][0]

for i in 0..m-1:
for j in 0..n-1:
if i==0 and j==0: continue
val = grid[i][j]
candidates = []
if i>0:
candidates.add(dpMax[i-1][j] _ val)
candidates.add(dpMin[i-1][j] _ val)
if j>0:
candidates.add(dpMax[i][j-1] _ val)
candidates.add(dpMin[i][j-1] _ val)
dpMax[i][j] = max(candidates)
dpMin[i][j] = min(candidates)

ans = dpMax[m-1][n-1]
if ans < 0: return -1
return ans % MOD

```

## Complexity

- Time: O(m · n)
- Space: O(m · n) (can be optimized to O(n) by rolling arrays)

## Notes

- Use 64-bit integers for intermediate products to avoid overflow before modulo.
- Zeros are handled naturally by candidate set; a zero may produce maximum non-negative product
```
