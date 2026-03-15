# Top View of Binary Tree

**Difficulty:** Medium | **Topics:** Binary Tree, Breadth-First Search, Hash Map

Given the root of a binary tree, return its top view: the nodes visible when the tree is seen from above. Output nodes from the leftmost to the rightmost horizontal position. If multiple nodes share the same horizontal distance, include only the topmost (closest to the root).

## Definition

- Horizontal distance (hd): root = 0, left child = hd - 1, right child = hd + 1.
- Top view includes the first node encountered at each hd during a level-order traversal.

## Examples

### Example 1

```
Input: root = [1, 2, 3]
Output: [2, 1, 3]
```

### Example 2

```
Input: root = [10, 20, 30, 40, 60, 90, 100]
Output: [40, 20, 10, 30, 100]
```

## Constraints

- 1 ≤ number of nodes ≤ 10^5
- 1 ≤ node.val ≤ 10^5

## Expected Complexities

- Time Complexity: O(n)
- Auxiliary Space: O(n)

## Solution Outline

1. Perform a BFS (level-order) while tracking each node's horizontal distance.
2. Maintain a map hd → first-seen node value (insert only on first encounter).
3. Track minHd and maxHd during traversal.
4. After BFS, output map values from minHd to maxHd.

Algorithm sketch:

- Initialize queue with (root, 0).
- While queue not empty:
  - Pop (node, hd). If hd not in map, set map[hd] = node.val.
  - Enqueue left child with hd-1, right child with hd+1.
- Collect results for hd = minHd..maxHd.

## Notes

- BFS ensures topmost nodes (smallest depth) are recorded first for each hd.
- Use an ordered map or record min/max hd and index accordingly for output order.

## Company Tags

Paytm, Ola Cabs, Walmart, NPCI

## Topic Tags

Binary
