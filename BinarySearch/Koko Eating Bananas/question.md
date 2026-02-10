# Koko Eating Bananas

**Difficulty:** Medium | **Topics:** Arrays, Binary Search, Algorithms

Koko is given an array `arr[]`, where each element represents a pile of bananas. She has exactly `k` hours to eat all the bananas.

Each hour, Koko can choose one pile and eat up to `s` bananas from it.

**Rules:**

- If the pile has at least `s` bananas, she eats exactly `s` bananas.
- If the pile has fewer than `s` bananas, she eats the entire pile in that hour.
- Koko can only eat from one pile per hour.

Your task is to find the minimum value of `s` (bananas per hour) such that Koko can finish all the piles within `k` hours.

## Examples

### Example 1:

```
Input: arr[] = [5, 10, 3], k = 4
Output: 5
```

**Explanation:** If Koko eats at the rate of 5 bananas per hour:

- First pile of 5 bananas will be finished in 1 hour (⌈5/5⌉ = 1)
- Second pile of 10 bananas will be finished in 2 hours (⌈10/5⌉ = 2)
- Third pile of 3 bananas will be finished in 1 hour (⌈3/5⌉ = 1)

Therefore, Koko can finish all piles of bananas in 1 + 2 + 1 = 4 hours.

### Example 2:

```
Input: arr[] = [5, 10, 15, 20], k = 7
Output: 10
```

**Explanation:** If Koko eats at the rate of 10 bananas per hour:

- Pile 1: ⌈5/10⌉ = 1 hour
- Pile 2: ⌈10/10⌉ = 1 hour
- Pile 3: ⌈15/10⌉ = 2 hours
- Pile 4: ⌈20/10⌉ = 2 hours

Total time = 1 + 1 + 2 + 2 = 6 hours ≤ 7 hours ✓

## Constraints:

- 1 ≤ arr.size() ≤ k ≤ 10^6
- 1 ≤ arr[i] ≤ 10^6

## Expected Complexities

- **Time Complexity:** O(n log(max(arr)))
- **Auxiliary Space:** O(1)

## Solution Approach

### Key Insight:

This is a classic **binary search on answer** problem. We need to find the minimum eating speed that allows Koko to finish within `k` hours.

### Algorithm:

1. **Set search bounds:**
   - Minimum speed: 1 banana per hour
   - Maximum speed: max(arr) bananas per hour

2. **Binary search on speed:**
   - For each mid speed, calculate total hours needed
   - If total hours ≤ k: try smaller speed (search left)
   - If total hours > k: need faster speed (search right)

3. **Calculate hours for given speed:**
   ```
   For each pile of size p:
   hours_needed = ⌈p / speed⌉ = (p + speed - 1) / speed
   ```

### Mathematical Formula:

For a pile of `p` bananas and eating speed `s`:

```
Time needed = ⌈p / s⌉ = (p + s - 1) / s
```

### Step-by-Step Process:

1. **Binary search range:** [1, max(arr)]
2. **For each candidate speed:** Calculate total hours
3. **Adjust search range** based on feasibility
4. **Return minimum feasible speed**

### Why This Works:

- **Monotonic property:** Higher speed → less time needed
- **Search space:** All possible speeds from 1 to max pile size
- **Optimization:** Find minimum speed that satisfies time constraint

## Company Tags

- Bloomberg
- Amazon
- Microsoft
- Walmart
- Adobe
- Arcesium
- Uber
- NPCI

## Topic Tags

- Arrays
- Binary Search
- Algorithms
- Mathematical

## Problem Category

- Binary Search
- Optimization Problems
- Search Problems

## Difficulty

Medium
