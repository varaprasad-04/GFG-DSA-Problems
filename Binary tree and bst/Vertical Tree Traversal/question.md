# Vertical Tree Traversal

**Difficulty:** Medium | **Topics:** Binary Tree, Breadth-First Search, Hash Map

Given the root of a binary tree, return its vertical order traversal from the leftmost vertical line to the rightmost. If multiple nodes share the same vertical line, output them in the order they appear in a level-order traversal (top to bottom, left to right).

## Definition
- Vertical line = nodes with the same horizontal distance from the root.
- Root horizontal distance = 0. Left child = hd - 1, right child = hd + 1.
- For nodes on the same vertical and same depth, preserve level-order order.

## Examples

### Example 1
Input: root = [1,2,3,4,5,6,7,null,null,null,8,null,9,null,10,11,null]

Output: [[4], [2], [1, 5, 6, 11], [3, 8, 9], [7], [10]]

Explanation: Vertical order from leftmost to rightmost produces the listed groups. Nodes on the same vertical are listed by their level-order appearance.

### Example 2
Input: root = [1,2,3,4,5,null,6]

Output: [[4], [2], [1, 5], [3], [6]]

Explanation: Vertical order from left to right is [[4], [2], [1, 5], [3], [6]].

## Constraints
- 1 ≤ number of nodes ≤ 10^5
- 1 ≤ node->data ≤ 10^5

## Expected Complexities
- Time Complexity: O(n)
- Auxiliary Space: O(n)

## Solution Outline

1. Perform a level-order traversal (BFS) while tracking each node's horizontal distance (hd).
2. Use a map from hd → list to collect nodes in BFS order so nodes at the same vertical follow level-order.
3. Track minimum and maximum hd encountered.
4. After traversal, output lists from min hd to max hd.

Algorithm sketch:
- Initialize queue with (root, 0).
- While queue not empty:
  - Pop (node, hd), append node.val to map[hd].
  - Push left child with hd-1, right child with hd+1.
- Collect map[hd] for hd = minHd..maxHd.

## Notes
- Using BFS ensures nodes on the same vertical are ordered by level-order (top to bottom, left to right).
- Use a TreeMap or record min/max hd and use an array/list indexed by shifted hd for output ordering.

## Company Tags
Flipkart, Accolite, Amazon, Microsoft, MakeMyTrip, Walmart, BrowserStack, Dell, Grofers, Netskope

## Topic Tags
Binary Tree, BFS, Hash Map, Vertical