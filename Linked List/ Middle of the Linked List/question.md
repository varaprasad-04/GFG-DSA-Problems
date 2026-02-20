# Middle of the Linked List

**Difficulty:** Easy | **Topics:** Linked List, Two Pointers

Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.

## Examples

### Example 1:

```
Input: head = [1,2,3,4,5]
Output: [3,4,5]
```

**Explanation:** The middle node of the list is node 3.

### Example 2:

```
Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
```

**Explanation:** Since the list has two middle nodes with values 3 and 4, we return the second one.

### Example 3:

```
Input: head = [1]
Output: [1]
```

**Explanation:** For a single node, it is the middle node.

## Constraints:

- The number of nodes in the list is in the range [1, 100]
- 1 ≤ Node.val ≤ 100

## Expected Complexities

- **Time Complexity:** O(n)
- **Auxiliary Space:** O(1)

## Solution Approach

### Key Insight:

We can find the middle node efficiently using the **two-pointer technique** (also known as the "tortoise and hare" algorithm).

### Algorithm:

#### **Approach 1: Two Pointers (Optimal)**

Use two pointers moving at different speeds:

- **Slow pointer:** Moves one step at a time
- **Fast pointer:** Moves two steps at a time
- When fast pointer reaches the end, slow pointer will be at the middle

#### **Approach 2: Two Pass**

1. First pass: Count total nodes
2. Second pass: Move to the middle position (count/2 + 1)

### Two Pointer Logic:

```
Initial: slow = head, fast = head

While fast and fast.next exist:
    slow = slow.next        (move 1 step)
    fast = fast.next.next   (move 2 steps)

Return slow (middle node)
```

### Step-by-Step Example:

For `head = [1,2,3,4,5]`:

```
Step 0: slow=1, fast=1
Step 1: slow=2, fast=3
Step 2: slow=3, fast=5
Step 3: fast.next=null, stop

Middle node: 3
```

For `head = [1,2,3,4,5,6]`:

```
Step 0: slow=1, fast=1
Step 1: slow=2, fast=3
Step 2: slow=3, fast=5
Step 3: slow=4, fast=null, stop

Middle node: 4 (second middle)
```

### Why This Works:

- **Odd length:** Slow pointer lands exactly at middle
- **Even length:** Slow pointer lands at second middle (as required)
- **Time efficient:** Single pass through the list
- **Space efficient:** Only uses two pointers

### Edge Cases:

- **Single node:** Returns the only node
- **Two nodes:** Returns the second node
- **Empty list:** Not possible per constraints

### Mathematical Reasoning:

When fast pointer travels 2n steps, slow pointer travels n steps:

- **Odd list (2k+1 nodes):** Slow reaches position k+1 (middle)
- **Even list (2k nodes):** Slow reaches position k+1 (second middle)

## Company Tags

- Amazon
- Microsoft
- Facebook

## Topic Tags

- Linked List
- Two Pointers
- Fast and Slow Pointers

## Problem Category

- Linked List Traversal
- Two Pointer Technique
- Basic Data Structures

## Difficulty

Easy
