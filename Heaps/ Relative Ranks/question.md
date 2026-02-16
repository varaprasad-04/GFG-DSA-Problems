# Relative Ranks

**Difficulty:** Easy | **Topics:** Array, Sorting, Heap (Priority Queue)

You are given an integer array `score` of size `n`, where `score[i]` is the score of the ith athlete in a competition. All the scores are guaranteed to be unique.

The athletes are placed based on their scores, where the 1st place athlete has the highest score, the 2nd place athlete has the 2nd highest score, and so on. The placement of each athlete determines their rank:

**Ranking System:**

- The 1st place athlete's rank is **"Gold Medal"**
- The 2nd place athlete's rank is **"Silver Medal"**
- The 3rd place athlete's rank is **"Bronze Medal"**
- For the 4th place to the nth place athlete, their rank is their placement number (i.e., the xth place athlete's rank is **"x"**)

Return an array `answer` of size `n` where `answer[i]` is the rank of the ith athlete.

## Examples

### Example 1:

```
Input: score = [5,4,3,2,1]
Output: ["Gold Medal","Silver Medal","Bronze Medal","4","5"]
```

**Explanation:** The placements are [1st, 2nd, 3rd, 4th, 5th].

**Breakdown:**

- Score 5 (highest) → 1st place → "Gold Medal"
- Score 4 → 2nd place → "Silver Medal"
- Score 3 → 3rd place → "Bronze Medal"
- Score 2 → 4th place → "4"
- Score 1 → 5th place → "5"

### Example 2:

```
Input: score = [10,3,8,9,4]
Output: ["Gold Medal","5","Bronze Medal","Silver Medal","4"]
```

**Explanation:** The placements are [1st, 5th, 3rd, 2nd, 4th].

**Breakdown:**

- Score 10 (highest) → 1st place → "Gold Medal"
- Score 3 (lowest) → 5th place → "5"
- Score 8 → 3rd place → "Bronze Medal"
- Score 9 → 2nd place → "Silver Medal"
- Score 4 → 4th place → "4"

## Constraints:

- n == score.length
- 1 ≤ n ≤ 10^4
- 0 ≤ score[i] ≤ 10^6
- All the values in score are unique

## Expected Complexities

- **Time Complexity:** O(n log n)
- **Auxiliary Space:** O(n)

## Solution Approach

### Key Insight:

We need to determine the relative ranking of each athlete while maintaining their original position in the result array. This requires mapping scores to ranks and then placing ranks at correct indices.
