# Meeting Rooms

**Difficulty:** Easy | **Topics:** Sorting, Greedy, Arrays

Given a 2D array `arr[][]`, where `arr[i][0]` is the starting time of ith meeting and `arr[i][1]` is the ending time of ith meeting, the task is to check if it is possible for a person to attend all the meetings such that he can attend only one meeting at a particular time.

**Note:** A person can attend a meeting if its starting time is greater than or equal to the previous meeting's ending time.

## Examples

### Example 1:

```
Input: arr[][] = [[1, 4], [10, 15], [7, 10]]
Output: true
```

**Explanation:** Since all the meetings are held at different times, it is possible to attend all the meetings.

### Example 2:

```
Input: arr[][] = [[2, 4], [9, 12], [6, 10]]
Output: false
```

**Explanation:** Since the second and third meeting overlap, a person cannot attend all the meetings.

## Constraints:

- 1 ≤ arr.size() ≤ 10^5
- 0 ≤ arr[i] ≤ 2 × 10^6

## Expected Complexities

- **Time Complexity:** O(n log n)
- **Auxiliary Space:** O(1)

## Solution Approach

### Key Insight:

To attend all meetings without overlap, we need to check if any two meetings have overlapping time intervals. The optimal approach is to sort meetings by start time and then check for consecutive overlaps.

### Algorithm:

```java
public boolean canAttendMeetings(int[][] intervals) {
    if (intervals == null || intervals.length <= 1) {
        return true;
    }

    // Sort meetings by start time
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

    // Check for overlaps between consecutive meetings
    for (int i = 1; i < intervals.length; i++) {
        // If current meeting starts before previous meeting ends
        if (intervals[i][0] < intervals[i-1][1]) {
            return false;
        }
    }

    return true;
}
```
