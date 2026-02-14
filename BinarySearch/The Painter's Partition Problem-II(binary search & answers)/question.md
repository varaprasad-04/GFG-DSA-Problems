# The Painter's Partition Problem-II (Binary Search & Answers)

**Difficulty:** Hard | **Topics:** Binary Search, Dynamic Programming, Divide and Conquer

Given an array `arr[]` where each element denotes the length of a board, and an integer `k` representing the number of painters available. Each painter takes 1 unit of time to paint 1 unit length of a board.

Determine the minimum amount of time required to paint all the boards, under the constraint that each painter can paint only a contiguous sequence of boards (no skipping or splitting allowed).

## Examples

### Example 1:

```
Input: arr[] = [5, 10, 30, 20, 15], k = 3
Output: 35
```

**Explanation:** The optimal allocation of boards among 3 painters is:

- **Painter 1** → `[5, 10]` → time = 15
- **Painter 2** → `[30]` → time = 30
- **Painter 3** → `[20, 15]` → time = 35

Job will be done when all painters finish i.e. at time = max(15, 30, 35) = **35**

### Example 2:

```
Input: arr[] = [10, 20, 30, 40], k = 2
Output: 60
```

**Explanation:** A valid optimal partition is:

- **Painter 1** → `[10, 20, 30]` → time = 60
- **Painter 2** → `[40]` → time = 40

Job will be complete at time = max(60, 40) = **60**

### Example 3:

```
Input: arr[] = [100, 200, 300, 400], k = 1
Output: 1000
```

**Explanation:** There is only one painter, so the painter must paint all boards sequentially. The total time taken will be the sum of all board lengths, i.e., 100 + 200 + 300 + 400 = **1000**.

## Constraints:

- 1 ≤ arr.size() ≤ 10^5
- 1 ≤ arr[i] ≤ 10^4
- 1 ≤ k ≤ 10^5

## Expected Complexities

- **Time Complexity:** O(n × log(sum(arr)))
- **Auxiliary Space:** O(1)

## Solution Approach

### Key Insight:

This is a classic **binary search on answer** problem. We need to find the minimum time such that `k` painters can complete all boards within that time limit.

### Binary Search Algorithm:

```java
public int findMinTime(int[] arr, int k) {
    int left = Arrays.stream(arr).max().getAsInt();  // At least max board time
    int right = Arrays.stream(arr).sum();            // At most sum of all boards

    while (left < right) {
        int mid = left + (right - left) / 2;

        if (canPaintInTime(arr, k, mid)) {
            right = mid;        // Try smaller time
        } else {
            left = mid + 1;     // Need more time
        }
    }

    return left;
}

private boolean canPaintInTime(int[] arr, int k, int maxTime) {
    int painters = 1;
    int currentTime = 0;

    for (int board : arr) {
        if (currentTime + board > maxTime) {
            painters++;
            currentTime = board;
            if (painters > k) return false;
        } else {
            currentTime += board;
        }
    }

    return painters <= k;
}
```
