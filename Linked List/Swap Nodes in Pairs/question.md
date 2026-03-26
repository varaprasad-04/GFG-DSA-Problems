# Swap Nodes in Pairs

**Difficulty:** Easy | **Topics:** Linked List, Pointers

Given the head of a singly linked list, swap every two adjacent nodes and return the head of the modified list. You must swap the nodes themselves — do not modify node values.

## Examples

### Example 1

```
Input: head = [1,2,3,4]
Output: [2,1,4,3]
```

### Example 2

```
Input: head = []
Output: []
```

### Example 3

```
Input: head = [1]
Output: [1]
```

### Example 4

```
Input: head = [1,2,3]
Output: [2,1,3]
```

## Constraints

- The number of nodes in the list is in the range [0, 100].
- 0 ≤ Node.val ≤ 100

## Approach (One-pass, iterative)

1. Use a dummy node before head to simplify edge cases.
2. Maintain a pointer `prev` initially at dummy.
3. While there are at least two nodes ahead:
   - Let `first = prev.next`, `second = first.next`.
   - Perform swap:
     - prev.next = second
     - first.next = second.next
     - second.next = first
   - Move `prev = first` (now the second node in the pair).
4. Return `dummy.next`.

This achieves O(n) time and O(1) extra space.

## Example pseudocode

```
dummy.next = head
prev = dummy
while prev.next != null and prev.next.next != null:
    first = prev.next
    second = first.next

    prev.next = second
    first.next = second.next
    second.next = first

    prev = first

return dummy.next
```

```// filepath: /home/varaprasad/GFG-DSA-Problems/Linked List/Swap Nodes in Pairs/question.ms
# Swap Nodes in Pairs

**Difficulty:** Easy | **Topics:** Linked List, Pointers

Given the head of a singly linked list, swap every two adjacent nodes and return the head of the modified list. You must swap the nodes themselves — do not modify node values.

## Examples

### Example 1
```

Input: head = [1,2,3,4]
Output: [2,1,4,3]

```

### Example 2
```

Input: head = []
Output: []

```

### Example 3
```

Input: head = [1]
Output: [1]

```

### Example 4
```

Input: head = [1,2,3]
Output: [2,1,3]

```

## Constraints
- The number of nodes in the list is in the range [0, 100].
- 0 ≤ Node.val ≤ 100

## Approach (One-pass, iterative)
1. Use a dummy node before head to simplify edge cases.
2. Maintain a pointer `prev` initially at dummy.
3. While there are at least two nodes ahead:
   - Let `first = prev.next`, `second = first.next`.
   - Perform swap:
     - prev.next = second
     - first.next = second.next
     - second.next = first
   - Move `prev = first` (now the second node in the pair).
4. Return `dummy.next`.

This achieves O(n) time and O(1) extra space.

## Example pseudocode
```

dummy.next = head
prev = dummy
while prev.next != null and prev.next.next != null:
first = prev.next
second = first.next

    prev.next = second
    first.next = second.next
    second.next = first

    prev =
