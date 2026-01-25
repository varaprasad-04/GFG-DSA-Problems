# Number of Valid Parentheses

**Difficulty:** Medium

You are given a number `n`, your task is to find the number of all the valid parentheses expressions of that length using only "(" and ")" brackets.

## Problem Description

An input string of parentheses is valid if:

- Open brackets must be closed in correct order
- Every close bracket has a corresponding open bracket

For example:

- **Valid:** "()()" or "(())"
- **Invalid:** ")()(" or "))(("

## Examples

### Example 1:

```
Input: n = 2
Output: 1
```

**Explanation:** There is only one possible valid expression of length 2 i.e., "()".

### Example 2:

```
Input: n = 4
Output: 2
```

**Explanation:** Possible valid expressions of length 4 are "(())" and "()()".

### Example 3:

```
Input: n = 6
Output: 5
```

**Explanation:** Possible valid expressions of length 6 are:

- "((()))"
- "(())()"
- "()(())"
- "()()()"
- "(()())"

## Constraints:

- 1 ≤ n ≤ 20

## Expected Complexities

- **Time Complexity:** O(n)
- **Auxiliary Space:** O(1)

## Difficulty

- Medium

## solution apporach:

if n is odd it is not possible to make valid parenthesis.
only if n is even:
By using the recursion the base case if closing parenthesis is greater than the open parenthesis not possible,at every recursion call count the valid set of parenthesis until closed < open
Recursion call is return valid(left-1,right)+valid(left,right-1);

- T.C= O(2^n)
- S.C=O(n)
