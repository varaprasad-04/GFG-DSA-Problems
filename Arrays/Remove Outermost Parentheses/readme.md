You are given a valid parentheses string
s
s.
A valid parentheses string is composed of '(' and ')' that are properly balanced.

A valid parentheses string is called primitive if it cannot be split into two smaller valid parentheses strings.

Your task is to remove the outermost parentheses from every primitive part of
s
s and print the final result.

Function Declaration
Function Name
r
e
m
o
v
e
O
u
t
e
r
P
a
r
e
n
t
h
e
s
e
s
removeOuterParentheses – This function removes the outermost parentheses from every primitive substring of a valid parentheses string.

Parameters
s
s: A valid parentheses string consisting only of the characters ‘(’ and ‘)’. The string may contain multiple primitive valid parentheses substrings concatenated together.
Return Value
Returns a new string formed by removing the outermost parentheses from every primitive part of the input string.
The returned string preserves the internal structure of the parentheses inside each primitive substring.
Constraints
1
≤
T
≤
100
1≤T≤100
1
≤
∣
s
∣
≤
10
5
1≤∣s∣≤10
5

s
contains only the characters ‘(’ and ‘)’.
s contains only the characters ‘(’ and ‘)’.
s
is guaranteed to be a valid parentheses string.
s is guaranteed to be a valid parentheses string.
Input Format
The first line contains an integer
T
T, the number of test cases.

Each test case consists of a single line containing the string
s
s.

Output Format
For each test case, print the modified string after removing the outermost parentheses.

Sample 1:
Input
Output
4
((()))
(()(()))
()()
((())())(()(()))
(())
()(())
(())()()(())

Explanation:
Test Case 1:
s = ((()))
Primitive decomposition = "((()))"
After removing the outermost parentheses -> (())

Test Case 2:
s = (()(())) Primitive decomposition = "(()(()))" After removing the outermost -> ()(())

Test Case 3:
s = ()()
Primitive decomposition = "()" + "()"
After removing the outermost from each -> "" + "" = ""

Did you like the problem?
50 users found this helpful
