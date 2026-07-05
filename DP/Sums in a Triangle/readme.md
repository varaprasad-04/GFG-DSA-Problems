Given an integer
N
N, let us consider a triangle of numbers of
N
N lines in which a number
a
11
a
11
​
appears in the first line, two numbers
a
21
a
21
​
and
a
22
a
22
​
appear in the second line, three numbers
a
31
a
31
​
,
a
32
a
32
​
and
a
33
a
33
​
appear in the third line, etc. In general,
i
i numbers
a
i
1
,
a
i
2
…
a
i
i
a
i1
​
,a
i2
​
…a
ii
​
appear in the
i
t
h
i
th
line for all
1
≤
i
≤
N
1≤i≤N. Develop a program that will compute the largest of the sums of numbers that appear on the paths starting from the top towards the base, so that:

on each path the next number is located on the row below, more precisely either directly below or below and one place to the right.
Warning: large Input/Output data, be careful with certain languages

Input Format
The first line of the input contains an integer
T
T, the number of test cases.
Then T test cases follow. Each test case starts with an integer
N
N, the number of rows. Then
N
N lines follow where in
i
t
h
i
th
line contains
i
i integers
a
i
1
,
a
i
2
…
a
i
i
a
i1
​
,a
i2
​
…a
ii
​
.
Output Format
For each test case print the maximum path sum in a separate line.

Constraints
1
≤
T
≤
1000
1≤T≤1000
1
≤
N
<
100
1≤N<100
0
≤
a
i
j
<
100
0≤a
ij
​
<100
Sample 1:
Input
Output
2
3
1
2 1
1 2 3
4
1
1 2
4 1 2
2 3 1 1
5
9
Explanation
