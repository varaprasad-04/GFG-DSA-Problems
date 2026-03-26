# Construct Product Matrix

**Difficulty:** Medium | **Topics:** Matrix, Modular Arithmetic, Number Theory

Given a 0-indexed 2D integer matrix `grid` of size n × m, define a 0-indexed 2D matrix `p` of the same size as the product matrix of `grid` if:

- Each element `p[i][j]` is equal to the product of all elements in `grid` except `grid[i][j]`, taken modulo 12345.

Return the product matrix `p`.

Note: All grid values are positive integers and the modulo is 12345.

## Examples

### Example 1

```
Input: grid = [[1,2],[3,4]]
Output: [[24,12],[8,6]]
```

Explanation:

- p[0][0] = 2 _ 3 _ 4 = 24
- p[0][1] = 1 _ 3 _ 4 = 12
- p[1][0] = 1 _ 2 _ 4 = 8
- p[1][1] = 1 _ 2 _ 3 = 6

### Example 2

```
Input: grid = [[12345],[2],[1]]
Output: [[2],[0],[0]]
```

Explanation:

- p[0][0] = 2 \* 1 = 2
- p[1][0] = 12345 \* 1 = 12345 ≡ 0 (mod 12345)
- p[2][0] = 12345 \* 2 = 24690 ≡ 0 (mod 12345)

## Constraints

- 1 ≤ n = grid.length ≤ 10^5
- 1 ≤ m = grid[i].length ≤ 10^5
- 2 ≤ n \* m ≤ 10^5
- 1 ≤ grid[i][j] ≤ 10^9

## Remarks on modulo 12345

- 12345 = 3 × 5 × 823 (composite). Division modulo 12345 is not always valid since multiplicative inverses exist only for numbers coprime with 12345.
- Simple approach "compute total product mod 12345, then for each cell do total \* inv(grid[i][j]) mod 12345" fails when gcd(grid[i][j], 12345) ≠ 1.

## Solution sketch (recommended)

1. Flatten the matrix into a list of values if convenient.
2. Factor the modulus: primes {3, 5, 823}. For each value, count how many times it contributes each prime factor.
3. Maintain:
   - the product of the parts coprime to 12345 modulo 12345 (or modulo each prime-power),
   - cumulative exponents of the primes across all elements.
4. For each element `grid[i][j]`, compute the product of all other elements by subtracting that element's prime exponents from totals and combining:
   - compute the coprime-part product (using modular inverse when coprime with 12345 or with respect to each modulus component),
   - multiply by the remaining prime powers,
   - reduce with modulo 12345 (use CRT or combine via modulus arithmetic).
5. Edge cases:
   - If after excluding an element the total exponent of any prime factor is ≥ 1 and that prime divides 12345, the resulting product may be 0 modulo 12345.
   - Large n·m (up to 1e5) requires O(n·m) time and O(1) or O(n·m) extra space depending on implementation.

## Complexity

- Time: O(n·m) to scan elements and compute counts/products.
- Space: O(n·m) if storing flattened arrays; can be optimized to O(1) extra space for streaming computation plus an output matrix.

## Implementation notes

- Use 64-bit integers for intermediate multiplications before applying modulo.
- Implement helper to factor out primes {3,5,823} from a number (count exponents and return remaining coprime part).
- Combine residues carefully (CRT or compute final result modulo 12345 from
