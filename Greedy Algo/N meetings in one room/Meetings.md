# N Meetings in One Room

**Difficulty:** Easy | **Topics:** Greedy Algorithm, Activity Selection

You are given timings of `n` meetings in the form of `(start[i], end[i])` where `start[i]` is the start time of meeting `i` and `end[i]` is the finish time of meeting `i`. Return the maximum number of meetings that can be accommodated in a single meeting room, when only one meeting can be held in the meeting room at a particular time.

**Note:** The start time of one chosen meeting can't be equal to the end time of the other chosen meeting.

## Examples

### Example 1:

```
Input: start[] = [1, 3, 0, 5, 8, 5], end[] = [2, 4, 6, 7, 9, 9]
Output: 4
```

**Explanation:** Maximum four meetings can be held with given start and end timings. The meetings are - (1, 2), (3, 4), (5, 7) and (8, 9).

### Example 2:

```
Input: start[] = [10, 12, 20], end[] = [20, 25, 30]
Output: 1
```

**Explanation:** Only one meeting can be held with given start and end timings.

### Example 3:

```
Input: start[] = [1, 2], end[] = [100, 99]
Output: 1
```

**Explanation:** Only one meeting can be accommodated.

## Constraints:

- 1 ≤ n ≤ 10^5
- 0 ≤ start[i] < end[i] ≤ 10^6

## Expected Complexities

- **Time Complexity:** O(n log n)
- **Auxiliary Space:** O(n)

## Solution Approach

This is a classic **Activity Selection Problem** that can be solved optimally using a **greedy approach**.

### Key Insight:

To maximize the number of meetings, we should always select the meeting that ends earliest among all available meetings. This leaves maximum time for accommodating future meetings.

### Algorithm:

1. **Create pairs** of (start_time, end_time) for each meeting
2. **Sort meetings** by their end times in ascending order
3. **Select the first meeting** (earliest ending time)
4. **Iterate through remaining meetings:**
   - If a meeting's start time is greater than the last selected meeting's end time
   - Select this meeting and update the last end time
5. **Return** the count of selected meetings

### Pseudocode:

```
function maxMeetings(start[], end[], n):
    // Create array of meetings with (start, end, index)
    meetings = []
    for i = 0 to n-1:
        meetings.add((start[i], end[i], i))

    // Sort by end time
    sort(meetings by end_time)

    count = 1  // First meeting is always selected
    lastEndTime = meetings[0].end

    for i = 1 to n-1:
        if meetings[i].start > lastEndTime:
            count++
            lastEndTime = meetings[i].end

    return count
```

### Example Walkthrough:

For `start[] = [1, 3, 0, 5, 8, 5]`, `end[] = [2, 4, 6, 7, 9, 9]`:

1. **Create meetings:** [(1,2), (3,4), (0,6), (5,7), (8,9), (5,9)]
2. **Sort by end time:** [(1,2), (3,4), (0,6), (5,7), (8,9), (5,9)]
3. **Selection process:**
   - Select (1,2), lastEnd = 2
   - Check (3,4): 3 > 2 ✓ Select, lastEnd = 4
   - Check (0,6): 0 < 4 ✗ Skip
   - Check (5,7): 5 > 4 ✓ Select, lastEnd = 7
   - Check (8,9): 8 > 7 ✓ Select, lastEnd = 9
   - Check (5,9): 5 < 9 ✗ Skip
4. **Result:** 4 meetings selected

## Company Tags

- Flipkart
- Amazon
- Microsoft
- MakeMyTrip
- Cisco

## Topic Tags

- Greedy Algorithm
- Activity Selection
- Sorting
- Arrays

## Problem Category

- Greedy Algorithm
- Scheduling Problems
- Optimization

## Difficulty

Easy
