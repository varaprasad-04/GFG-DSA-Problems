Given a string s of lowercase English letters, you can swap all occurrences of any two distinct characters at most once. Return the lexicographically smallest string after this operation.
Examples:

Input: s = "ccad"
Output: "aacd"
Explanation: In ccad, we choose a and c and after doing the replacement operation once, we get aacd and this is the lexicographically smallest string possible. 
Input: s = "abba"
Output: "abba"
Explanation: In abba, we can get baab after doing the replacement operation once for a and b but that is not lexicographically smaller than abba. So, the answer is abba. 
Constraints:
1 ≤ |s| ≤ 105

Expected Complexities
Time Complexity: O(n)
Auxiliary Space: O(1)
Topic Tags
Greedy