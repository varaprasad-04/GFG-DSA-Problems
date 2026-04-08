# Minimum Platforms

**Difficulty:** Medium | **Topics:** Greedy, Sorting, Two Pointers

Given arrival times `arr[]` and departure times `dep[]` of trains on the same day, find the minimum number of platforms required so that no train waits. A platform cannot serve two trains at the same time — if a train arrives before another departs, an extra platform is needed.

Times are in 24-hour HHMM format (e.g., 900 or 0900 for 09:00). 0000 ≤ arr[i] ≤ dep[i] ≤ 2359.

## Examples

Example 1

```
Input:
arr = [900, 940, 950, 1100, 1500, 1800]
dep = [910, 1200, 1120, 1130, 1900, 2000]
Output: 3
Explanation: Three trains overlap between 9:40 and 12:00.
```

Example 2

```
Input:
arr = [900, 1235, 1100]
dep = [1000, 1240, 1200]
Output: 1
Explanation: No overlapping trains.
```

Example 3

```
Input:
arr = [1000, 935, 1100]
dep = [1200, 1240, 1130]
Output: 3
Explanation: All three trains overlap between 11:00 and 11:30.
```

## Constraints

- 1 ≤ number of trains ≤ 10^5
- 0000 ≤ arr[i] ≤ dep[i] ≤ 2359

## Expected Complexities

- Time: O(n log n)
- Space: O(1) or O(n) for sorting

## Optimal Approach (concise)

1. Sort `arr` and `dep` independently.
2. Use two pointers i (arrivals) and j (departures), and counters:
   - platforms = 0, maxPlatforms = 0
3. While i < n:
   - If arr[i] ≤ dep[j]: platforms++, i++, update maxPlatforms.
   - Else: platforms--, j++.
4. Return maxPlatforms.

This counts concurrent trains efficiently after sorting arrivals and departures.

## Company Tags

Paytm, Amazon, Microsoft, D-E-Shaw, Hike, Walmart, Adobe, Google, Atlassian, NPCI

## Topic Tags

Greedy, Sorting, Two Pointers

```// filepath: /home/varaprasad/GFG-DSA-Problems/Greedy Algo/Minimum Platforms/question.md
# Minimum Platforms

**Difficulty:** Medium | **Topics:** Greedy, Sorting, Two Pointers

Given arrival times `arr[]` and departure times `dep[]` of trains on the same day, find the minimum number of platforms required so that no train waits. A platform cannot serve two trains at the same time — if a train arrives before another departs, an extra platform is needed.

Times are in 24-hour HHMM format (e.g., 900 or 0900 for 09:00). 0000 ≤ arr[i] ≤ dep[i] ≤ 2359.

## Examples

Example 1
```

Input:
arr = [900, 940, 950, 1100, 1500, 1800]
dep = [910, 1200, 1120, 1130, 1900, 2000]
Output: 3
Explanation: Three trains overlap between 9:40 and 12:00.

```

Example 2
```

Input:
arr = [900, 1235, 1100]
dep = [1000, 1240, 1200]
Output: 1
Explanation: No overlapping trains.

```

Example 3
```

Input:
arr = [1000, 935, 1100]
dep = [1200, 1240, 1130]
Output: 3
Explanation: All three trains overlap between 11:00 and 11:30.

```

## Constraints
- 1 ≤ number of trains ≤ 10^5
- 0000 ≤ arr[i] ≤ dep[i] ≤ 2359

## Expected Complexities
- Time: O(n log n)
- Space: O(1) or O(n) for sorting

## Optimal Approach (concise)
1. Sort `arr` and `dep` independently.
2. Use two pointers i (arrivals) and j (departures), and counters:
   - platforms = 0, maxPlatforms = 0
3. While i < n:
   - If arr[i] ≤ dep[j]: platforms++, i++, update maxPlatforms.
   - Else: platforms--, j++.
4. Return maxPlatforms.

This counts concurrent trains efficiently after sorting arrivals and departures.

## Company Tags
Paytm, Amazon, Microsoft, D-E-Shaw, Hike, Walmart, Adobe, Google, Atlassian, NPCI

## Topic Tags
Greedy, Sorting, Two Pointers
```
