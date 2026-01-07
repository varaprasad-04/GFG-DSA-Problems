1. Minimum Length Subarray with Sum ≥ X

Problem Statement
Given an array of integers and a value X, find the minimum length subarray
whose sum is greater than or equal to X.


Core Idea

The brute force approach tries every possible subarray and checks whether its sum is greater than or equal to X.
Among all such subarrays, we choose the one with the minimum length.

🔍 What is a subarray?

A subarray is a continuous part of the array.

Example:

Array: [1, 4, 45, 6, 0, 19]
Subarrays starting at index 1:
[4]
[4, 45]
[4, 45, 6]
[4, 45, 6, 0]
[4, 45, 6, 0, 19]

🔁 How brute force works (step by step)

Start from the first element

Treat each index as the starting point of a subarray.

Extend the subarray to the right

Add elements one by one.

Keep calculating the running sum.

Check the condition

As soon as the sum becomes ≥ X, we:

Note the current subarray length

Compare it with the minimum length found so far

Update the minimum if the current one is smaller

Move to the next starting index

Repeat the same process for every index in the array.

🧪 Example Walkthrough
X = 51
Array = [1, 4, 45, 6, 0, 19]



[1, 4] → sum = 5 ❌

[1, 4, 45] → sum = 50 ❌

[1, 4, 45, 6] → sum = 56 ✅ → length = 4
