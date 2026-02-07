# K-Beauty of an Integer

The **k-beauty** of an integer `num` is defined as the number of substrings of `num` (when read as a string) that satisfy the following conditions: the substring has a length of `k`, and the integer value of the substring is a divisor of `num`.

**Notes:** Leading zeros in substrings are allowed. `0` is not a divisor of any number. A substring is a contiguous sequence of characters in a string.

**Example 1:**  
Input: `num = 240, k = 2`  
Substrings of length `k`: `"24"` → 24 is a divisor of 240, `"40"` → 40 is a divisor of 240  
Output: `2`

**Example 2:**  
Input: `num = 430043, k = 2`  
Substrings of length `k`: `"43"` → divisor, `"30"` → not a divisor, `"00"` → not a divisor, `"04"` → not a divisor, `"43"` → divisor  
Output: `2`

**Constraints:** `1 ≤ num ≤ 10⁹`, `1 ≤ k ≤ length of num (as a string)`

**Task:** Given integers `num` and `k`, return the k-beauty of `num`.
