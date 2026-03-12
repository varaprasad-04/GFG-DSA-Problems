# Intersection of Two Linked Lists

**Difficulty:** Easy | **Topics:** Linked List, Two Pointers, Hash Table

Given the heads of two singly linked-lists `headA` and `headB`, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return `null`.

**Note:** The linked lists must retain their original structure after the function returns.

## Problem Description

The test cases are generated such that there are no cycles anywhere in the entire linked structure.

For example, the following two linked lists begin to intersect at node c1:

```
List A: a1 → a2 ↘
                 c1 → c2 → c3 → null
List B: b1 → b2 → b3 ↗
```

## Examples

### Example 1:

```
Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
Output: Intersected at '8'
```

**Explanation:** The intersected node's value is 8 (note that this must not be 0 if the two lists intersect).

**Visual Representation:**

```
List A: 4 → 1 → 8 → 4 → 5
List B: 5 → 6 → 1 → 8 → 4 → 5
                    ↑
               Intersection point
```

From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,6,1,8,4,5]. There are 2 nodes before the intersected node in A; There are 3 nodes before the intersected node in B.

**Note:** The intersected node's value is not 1 because the nodes with value 1 in A and B are different node references pointing to different locations in memory, while the nodes with value 8 point to the same location in memory.

### Example 2:

```
Input: intersectVal = 2, listA = [1,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
Output: Intersected at '2'
```

**Explanation:** The intersected node's value is 2.

**Visual Representation:**

```
List A: 1 → 9 → 1 → 2 → 4
List B: 3 → 2 → 4
            ↑
       Intersection point
```

### Example 3:

```
Input: intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2
Output: No intersection
```

**Explanation:** The two lists do not intersect, so return `null`.

**Visual Representation:**

```
List A: 2 → 6 → 4 → null
List B: 1 → 5 → null
```

## Constraints:

- The number of nodes of listA is `m`
- The number of nodes of listB is `n`
- 1 ≤ m, n ≤ 3 × 10^4
- 1 ≤ Node.val ≤ 10^5
- 0 ≤ skipA ≤ m
- 0 ≤ skipB ≤ n
- intersectVal is 0 if listA and listB do not intersect
- intersectVal == listA[skipA] == listB[skipB] if listA and listB intersect

## Expected Complexities

- **Time Complexity:** O(m + n)
- **Auxiliary Space:** O(1)

## Solution Approach

### Key Insight:

The elegant solution uses the **two-pointer technique** where both pointers traverse both lists, ensuring they meet at the intersection point (if it exists).

### Algorithm:

#### **Approach 1: Two Pointers (Optimal)**

1. **Initialize two pointers** at the heads of both lists
2. **Traverse both lists:** When a pointer reaches the end, redirect it to the other list's head
3. **Meeting point:** If intersection exists, pointers will meet at intersection node
4. **No intersection:** Both pointers will be null simultaneously

#### **Approach 2: Hash Set**

1. **Store all nodes** from list A in a hash set
2. **Traverse list B** and check if any node exists in the hash set
3. **Return first match** or null if no intersection

### Why Two Pointers Work:

**Mathematical Proof:**

- Let lengths be: `lenA = a + c`, `lenB = b + c` (where c is common length)
- Pointer A travels: `a + c + b` = `lenA + b`
- Pointer B travels: `b + c + a` = `lenB + a`
- Both cover same total distance: `lenA + b = lenB + a`

### Step-by-Step Example:

For `listA = [4,1,8,4,5], listB = [5,6,1,8,4,5]`:

```
Round 1:
pA: 4 → 1 → 8 → 4 → 5 → null (switch to listB)
pB: 5 → 6 → 1 → 8 → 4 → 5 → null (switch to listA)

Round 2:
pA: 5 → 6 → 1 → 8 (meets pB here)
pB: 4 → 1 → 8 (meets pA here)

Intersection found at node with value 8
```

### Implementation:

```java
public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    if (headA == null || headB == null) return null;

    ListNode pA = headA;
    ListNode pB = headB;

    while (pA != pB) {
        pA = (pA == null) ? headB : pA.next;
        pB = (pB == null) ? headA : pB.next;
    }

    return pA; // Either intersection node or null
}
```

### Edge Cases:

- **No intersection:** Both pointers become null
- **Same starting node:** Intersection at head
- **Different lengths:** Algorithm handles automatically
- **One list is subset:** Works correctly

## Company Tags

- Amazon
- Microsoft
- Facebook
- Google

## Topic Tags

- Linked List
- Two Pointers
- Hash Table

## Problem Category

- Linked List Traversal
- Two Pointer Technique
- Intersection Problems

## Difficulty

Easy
