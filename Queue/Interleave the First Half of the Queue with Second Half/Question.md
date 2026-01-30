# Interleave the First Half of the Queue with Second Half

**Difficulty:** Easy | **Topics:** Queue, Data Structures, Implementation

Given a queue `q[]` of even size. Your task is to rearrange the queue by interleaving its first half with the second half.

**Interleaving** is the process of mixing two sequences by alternating their elements while preserving their relative order.

In other words, Interleaving means place the first element from the first half and then first element from the 2nd half and again second element from the first half and then second element from the 2nd half and so on.

## What is Interleaving?

Interleaving is the process of combining two strings/arrays such that:

- **All characters/elements** of both are used
- **Order of each individual sequence** is preserved

### Example (Strings):

Given: A = "ab", B = "cd"

**Valid interleavings:**

- "abcd" ✅
- "acbd" ✅
- "acdb" ✅
- "cabd" ❌ (order of "ab" is broken)

## Examples

### Example 1:

```
Input: q[] = [2, 4, 3, 1]
Output: [2, 3, 4, 1]
```

**Explanation:**

- First half: [2, 4], Second half: [3, 1]
- Interleaving: Take 2 from first half, then 3 from second half, then 4 from first half, then 1 from second half
- Result: [2, 3, 4, 1]

### Example 2:

```
Input: q[] = [3, 5]
Output: [3, 5]
```

**Explanation:**

- First half: [3], Second half: [5]
- Interleaving: Take 3 from first half, then 5 from second half
- Result: [3, 5]

### Example 3:

```
Input: q[] = [1, 2, 3, 4, 5, 6]
Output: [1, 4, 2, 5, 3, 6]
```

**Explanation:**

- First half: [1, 2, 3], Second half: [4, 5, 6]
- Interleaving: 1, 4, 2, 5, 3, 6
- Result: [1, 4, 2, 5, 3, 6]

## Constraints:

- 1 ≤ queue.size() ≤ 10^3
- 1 ≤ queue[i] ≤ 10^5
- Queue size is always even

## Expected Complexities

- **Time Complexity:** O(n)
- **Auxiliary Space:** O(n)

## Solution Approach

### Key Insight:

Split the queue into two halves and then merge them alternatively.

### Algorithm:

1. **Split the queue** into two separate queues of size n/2 each
2. **Create two auxiliary queues:**
   - `firstHalf` - contains first n/2 elements
   - `secondHalf` - contains remaining n/2 elements
3. **Merge alternatively:**
   - Take one element from `firstHalf`
   - Take one element from `secondHalf`
   - Repeat until both queues are empty
4. **Return** the interleaved queue

### Pseudocode:

```
function interleaveQueue(q):
    n = q.size()
    firstHalf = new Queue()
    secondHalf = new Queue()

    // Split into two halves
    for i = 0 to n/2 - 1:
        firstHalf.push(q.front())
        q.pop()

    for i = n/2 to n - 1:
        secondHalf.push(q.front())
        q.pop()

    // Interleave back into original queue
    while firstHalf is not empty:
        q.push(firstHalf.front())
        firstHalf.pop()

        q.push(secondHalf.front())
        secondHalf.pop()

    return q
```

### Step-by-Step Example:

For `q = [2, 4, 3, 1]`:

1. **Split:**
   - firstHalf = [2, 4]
   - secondHalf = [3, 1]
   - Original q = []

2. **Interleave:**
   - Take 2 from firstHalf → q = [2]
   - Take 3 from secondHalf → q = [2, 3]
   - Take 4 from firstHalf → q = [2, 3, 4]
   - Take 1 from secondHalf → q = [2, 3, 4, 1]

3. **Result:** [2, 3, 4, 1]

## Alternative Approach - Using Stack

```
function interleaveUsingStack(q):
    n = q.size()
    stack = new Stack()

    // Move first half to stack (reverses order)
    for i = 0 to n/2 - 1:
        stack.push(q.front())
        q.pop()

    // Put stack elements back to queue (restores order)
    while stack is not empty:
        q.push(stack.top())
        stack.pop()

    // Move first n/2 elements to back
    for i = 0 to n/2 - 1:
        q.push(q.front())
        q.pop()

    // Interleave process continues...
```

## Company Tags

- Microsoft
- Amazon
- Flipkart

## Topic Tags

- Queue
- Stack
- Implementation
- Data Structures

## Problem Category

- Queue
- Data Structure Implementation
- Array Manipulation

## Difficulty

Easy
