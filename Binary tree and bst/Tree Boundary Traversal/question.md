# Tree Boundary Traversal

**Difficulty:** Medium | **Topics:** Binary Tree, Tree Traversal

Given the root of a binary tree, return its boundary traversal in the following order:

1. Left boundary: nodes from the root to the leftmost non-leaf node (prefer left child). Exclude leaf nodes.
2. Leaf nodes: all leaf nodes from left to right.
3. Right boundary: nodes from the root to the rightmost non-leaf node (prefer right child). Exclude leaf nodes and add these nodes in reverse order.

Notes:

- Include the root once.
- Do not duplicate leaf nodes.

## Examples

### Example 1

```
Input: root = [1,2,3,4,5,6,7,N,N,8,9,N,N,N,N]
Output: [1,2,4,8,9,6,7,3]
```

Explanation: left boundary [1,2,4], leaves [8,9,6,7], right boundary reversed [3].

### Example 2

```
Input: root = [1,N,2,N,3,N,4,N,N]
Output: [1,4,3,2]
```

Explanation:

- Left boundary: [1] (no left subtree)
- Leaves: [4]
- Right boundary (reverse): [3,2]
- Final: [1,4,3,2]

## Constraints

- 1 ≤ number of nodes ≤ 10^5
- 1 ≤ node->data ≤ 10^5

## Expected Complexities

- Time Complexity: O(n)
- Auxiliary Space: O(n) (for recursion/stack and result list)

## Solution Outline

1. If root is null, return [].
2. Add root value to result.
3. Collect left boundary:
   - Traverse from root.left, prefer left child; add node values while node is non-null and not a leaf.
4. Collect leaf nodes:
   - Do a DFS (preorder) and add node values when node is a leaf.
5. Collect right boundary:
   - Traverse from root.right, prefer right child; collect nodes while node is non-null and not a leaf. Reverse this list and append to result.
6. Return the concatenated result.

## Edge Cases

- Single-node tree → result is [root].
- All nodes on one side → left/right boundary logic handles missing subtrees.
- Avoid duplicating root or leaf nodes.

## Tags

Company: Flipkart, Morgan Stanley, Accolite, Amazon, Microsoft, OYO, Samsung, Snapdeal, FactSet, Hike, Payu, Kritikal Solutions
