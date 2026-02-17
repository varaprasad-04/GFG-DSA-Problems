# Maximum Number of Overlapping Intervals

**Difficulty:** Medium | **Topics:** Sorting, Greedy, Array

You are given an array of intervals `arr[][]`, where each interval is represented by two integers `[start, end]` (inclusive). Return the maximum number of intervals that overlap at any point in time.

## Examples

### Example 1:

```
Input: arr[][] = [[1, 2], [2, 4], [3, 6]]
Output: 2
```

**Explanation:** The maximum overlapping intervals are 2. This occurs between:

- Intervals `[1, 2]` and `[2, 4]` at time point 2
- Intervals `[2, 4]` and `[3, 6]` at time points 3-4

### Example 2:

```
Input: arr[][] = [[1, 8], [2, 5], [5, 6], [3, 7]]
Output: 4
```

**Explanation:** The maximum overlapping intervals are 4. All intervals `[1, 8]`, `[2, 5]`, `[5, 6]`, and `[3, 7]` overlap at time point 5.

## Constraints:

- 2 ≤ arr.size() ≤ 2 × 10^4
- 1 ≤ arr[i][0] < arr[i][1] ≤ 4 × 10^6

## Expected Complexities

- **Time Complexity:** O(n log n)
- **Auxiliary Space:** O(n)

## Solution Approach

### Key Insight:

To find the maximum overlap, we use the **sweep line algorithm**. Track when intervals start and end, then count the maximum number of active intervals at any point.

### Algorithm Steps:

1. **Create Events:** For each interval, create two events:
   - Start event: `[start_time, +1]`
   - End event: `[end_time + 1, -1]` (end+1 for inclusive intervals)

2. **Sort Events:** Sort all events by time. If times are equal, process end events before start events.

3. **Sweep Through Events:**
   - Maintain a counter for active intervals
   - For start events: increment counter
   - For end events: decrement counter
   - Track maximum counter value

4. **Return Maximum:** The highest counter value is the answer.

### Example Walkthrough:

For `arr = [[1, 8], [2, 5], [5, 6], [3, 7]]`:

**Events Created:**

- `[1, +1], [9, -1]` (from [1, 8])
- `[2, +1], [6, -1]` (from [2, 5])
- `[5, +1], [7, -1]` (from [5, 6])
- `[3, +1], [8, -1]` (from [3, 7])

**Sorted Events:** `[1,+1], [2,+1], [3,+1], [5,+1], [6,-1], [7,-1], [8,-1], [9,-1]`

**Processing:**

- Time 1: +1 → overlap = 1
- Time 2: +1 → overlap = 2
- Time 3: +1 → overlap = 3
- Time 5: +1 → overlap = 4 ← **Maximum**
- Time 6: -1 → overlap = 3
- Time 7: -1 → overlap = 2
- Time 8: -1 → overlap = 1
- Time 9: -1 → overlap = 0

**Result:** Maximum overlap = 4

## Company Tags

- Microsoft
- Amazon
- Google

## Topic Tags

- Sorting
- Greedy
- Array
- Sweep Line Algorithm

## Problem Category

- Interval Problems
- Sweep Line Algorithm
- Array Manipulation

## Difficulty

Medium
