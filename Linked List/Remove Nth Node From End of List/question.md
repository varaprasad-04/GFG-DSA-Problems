# Remove Nth Node From End of List

**Difficulty:** Medium | **Topics:** Linked List, Two Pointers

Given the head of a linked list, remove the nth node from the end of the list and return its head.

## Examples

### Example 1:

```
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
```

**Explanation:** The 2nd node from the end is node with value 4. After removing it, the list becomes [1,2,3,5].

### Example 2:

```
Input: head = [1], n = 1
Output: []
```

**Explanation:** The list has only one node, and removing it results in an empty list.

### Example 3:

```
Input: head = [1,2], n = 1
Output: [1]
```

**Explanation:** The 1st node from the end is node with value 2. After removing it, the list becomes [1].

## Constraints:

- The number of nodes in the list is `sz`
- 1 ≤ sz ≤ 30
- 0 ≤ Node.val ≤ 100
- 1 ≤ n ≤ sz

## Expected Complexities

- **Time Complexity:** O(n)
- **Auxiliary Space:** O(1)

## Solution Approach

### Key Insight:

To remove the nth node from the end in one pass, we can use the **two-pointer technique**. Maintain a gap of `n` nodes between two pointers, so when the fast pointer reaches the end, the slow pointer will be at the node to be removed.

### Algorithm:

#### **Approach 1: Two Pass (Straightforward)**

1. **First pass:** Count total nodes
2. **Calculate position:** nth from end = (total - n + 1)th from start
3. **Second pass:** Remove the node at calculated position

#### **Approach 2: One Pass with Two Pointers (Optimal)**

1. **Create dummy node:** Points to head (handles edge case of removing first node)
2. **Initialize pointers:** Both start at dummy
3. **Move fast pointer:** Advance `n+1` steps ahead
4. **Move both pointers:** Until fast reaches end
5. **Remove node:** Skip the target node
6. **Return new head:** dummy.next

### Step-by-Step Example:

For `head = [1,2,3,4,5], n = 2`:

```
Step 1: Create dummy node
dummy -> 1 -> 2 -> 3 -> 4 -> 5 -> null
↑
slow, fast

Step 2: Move fast pointer n+1 = 3 steps
dummy -> 1 -> 2 -> 3 -> 4 -> 5 -> null
↑              ↑
slow          fast

Step 3: Move both until fast reaches end
dummy -> 1 -> 2 -> 3 -> 4 -> 5 -> null
               ↑              ↑
              slow           fast

Step 4: Remove node (slow.next = slow.next.next)
dummy -> 1 -> 2 -> 3 -----> 5 -> null
               ↑
              slow

Result: [1,2,3,5]
```

### Why Two Pointers Work:

- **Gap maintenance:** Fast pointer is always `n+1` nodes ahead of slow
- **End condition:** When fast reaches null, slow is at the node before target
- **One pass:** No need to count nodes first

### Edge Cases:

1. **Remove head node:** When n equals list length
2. **Single node list:** Remove the only node → empty list
3. **Remove last node:** n = 1

### Visual Representation:

```
For n = 2 (remove 2nd from end):
Original:  1 -> 2 -> 3 -> 4 -> 5
Positions: 5th  4th  3rd  2nd  1st (from end)
                        ↑
                    Remove this
Result:    1 -> 2 -> 3 -----> 5
```

## Follow-up: One Pass Solution

Yes! The two-pointer approach achieves this in one pass:

- **Time:** O(n) - single traversal
- **Space:** O(1) - only using two pointers

## Company Tags

- Amazon
- Microsoft
- Facebook
- Google

## Topic Tags

- Linked List
- Two Pointers
- Fast and Slow Pointers

## Problem Category

- Linked List Manipulation
- Two Pointer Technique
- Node Removal

## Difficulty

Medium
