# Stream First Non-Repeating Character

**Difficulty:** Medium | **Topics:** Hash, Data Structures, Queue

Given a string `s` consisting of only lowercase alphabets, for each index `i` in the string (0 ≤ i < n), find the first non-repeating character in the prefix `s[0..i]`. If no such character exists, use '#'.

## Examples

### Example 1:

```
Input: s = "aabc"
Output: "a#bb"
```

**Explanation:**

- At i=0 ("a"): First non-repeating character is 'a'
- At i=1 ("aa"): No non-repeating character, so '#'
- At i=2 ("aab"): First non-repeating character is 'b'
- At i=3 ("aabc"): Non-repeating characters are 'b' and 'c'; 'b' appeared first, so 'b'

### Example 2:

```
Input: s = "bb"
Output: "b#"
```

**Explanation:**

- At i=0 ("b"): First non-repeating character is 'b'
- At i=1 ("bb"): No non-repeating character, so '#'

### Example 3:

```
Input: s = "zz"
Output: "z#"
```

**Explanation:**

- At i=0 ("z"): First non-repeating character is 'z'
- At i=1 ("zz"): No non-repeating character, so '#'

## Constraints:

- 1 ≤ s.size() ≤ 10^5
- s contains only lowercase English letters

## Expected Complexities

- **Time Complexity:** O(n)
- **Auxiliary Space:** O(1)

## Solution Approach

### Key Insight:

We need to efficiently track:

1. **Character frequencies** in the current prefix
2. **Order of appearance** of characters to find the first non-repeating one

### Algorithm:

1. **Use a frequency array** `freq[26]` to count occurrences of each character
2. **Use a queue** to maintain the order of characters as they appear
3. **For each character in the string:**
   - Increment its frequency
   - Add it to the queue
   - Remove characters from the front of queue that have frequency > 1
   - The front of queue is the first non-repeating character (or queue is empty → '#')

### Pseudocode:

```
function firstNonRepeating(s):
    n = s.length
    freq = array of size 26, initialized to 0
    queue = empty queue
    result = ""

    for i = 0 to n-1:
        char = s[i]
        freq[char - 'a']++
        queue.push(char)

        // Remove characters that are now repeating
        while queue is not empty and freq[queue.front() - 'a'] > 1:
            queue.pop()

        // Add result for current prefix
        if queue is empty:
            result += '#'
        else:
            result += queue.front()

    return result
```

### Example Walkthrough:

For `s = "aabc"`:

```
i=0, char='a': freq[a]=1, queue=[a], result="a"
i=1, char='a': freq[a]=2, queue=[a], remove 'a' (freq>1), queue=[], result="a#"
i=2, char='b': freq[b]=1, queue=[b], result="a#b"
i=3, char='c': freq[c]=1, queue=[b,c], result="a#bb"
```

## Alternative Approach - Hash Map + Linked List

```
function firstNonRepeatingAlt(s):
    freq = hashmap
    order = linked list or array to maintain order
    result = ""

    for each character:
        update frequency
        maintain order of unique characters
        find first character with frequency 1
        append to result

    return result
```

## Company Tags

- Flipkart
- Amazon
- Microsoft
- FactSet
- Payu
- Adobe
- Yahoo

## Topic Tags

- Hash
- Data Structures
- Queue
- String Processing
- Stream Processing

## Problem Category

- Hash
- Queue
- String Manipulation
- Data Stream Problems

## Difficulty

Medium
