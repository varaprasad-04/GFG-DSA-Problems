# Same Tree

**Difficulty:** Easy | **Topics:** Binary Tree, Recursion, DFS

Given the roots of two binary trees `p` and `q`, write a function to check if they are the same.

Two binary trees are the same if they are structurally identical and the nodes have the same values.

## Examples

### Example 1

```
Input: p = [1,2,3], q = [1,2,3]
Output: true
```

### Example 2

```
Input: p = [1,2], q = [1,null,2]
Output: false
```

### Example 3

```
Input: p = [1,2,1], q = [1,1,2]
Output: false
```

## Constraints

- The number of nodes in both trees is in the range [0, 100].
- -10^4 ≤ Node.val ≤ 10^4

## Approach

Use recursion (or iterative traversal) to compare corresponding nodes:

- If both nodes are null → they match.
- If one is null or values differ → not the same.
- Recursively compare left subtrees and right subtrees.

Pseudocode:

```
isSameTree(p, q):
    if p == null and q == null: return true
    if p == null or q == null: return false
    if p.val != q.val: return false
    return isSameTree(p.left, q.left) and isSameTree(p.right, q.right)
```

## Complexity

- Time: O(n) — n is min(total nodes in both trees)
- Space: O(h) — recursion stack, h is tree height

```<!-- filepath: /home/varaprasad/GFG-DSA-Problems/Binary tree and bst/Same Tree/question.md -->
# Same Tree

**Difficulty:** Easy | **Topics:** Binary Tree, Recursion, DFS

Given the roots of two binary trees `p` and `q`, write a function to check if they are the same.

Two binary trees are the same if they are structurally identical and the nodes have the same values.

## Examples

### Example 1
```

Input: p = [1,2,3], q = [1,2,3]
Output: true

```

### Example 2
```

Input: p = [1,2], q = [1,null,2]
Output: false

```

### Example 3
```

Input: p = [1,2,1], q = [1,1,2]
Output: false

```

## Constraints
- The number of nodes in both trees is in the range [0, 100].
- -10^4 ≤ Node.val ≤ 10^4

## Approach

Use recursion (or iterative traversal) to compare corresponding nodes:

- If both nodes are null → they match.
- If one is null or values differ → not the same.
- Recursively compare left subtrees and right subtrees.

Pseudocode:
```

isSameTree(p, q):
if p == null and q == null: return true
if p == null or q == null: return false
if p.val != q.val: return false
return isSameTree(p.left, q.left) and isSameTree(p.right, q.right)

```

## Complexity
- Time: O(n) — n is min(total nodes in both trees)
- Space: O(h)
```
