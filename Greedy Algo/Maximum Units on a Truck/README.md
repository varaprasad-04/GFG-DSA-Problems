# Maximum Units on a Truck

**Difficulty:** Easy | **Topics:** Array, Greedy, Sorting

You are assigned to put some amount of boxes onto one truck. You are given a 2D array `boxTypes`, where `boxTypes[i] = [numberOfBoxesi, numberOfUnitsPerBoxi]`:

- `numberOfBoxesi` is the number of boxes of type i.
- `numberOfUnitsPerBoxi` is the number of units in each box of the type i.

You are also given an integer `truckSize`, which is the maximum number of boxes that can be put on the truck. You can choose any boxes to put on the truck as long as the number of boxes does not exceed `truckSize`.

Return the maximum total number of units that can be put on the truck.

## Examples

### Example 1:

```
Input: boxTypes = [[1,3],[2,2],[3,1]], truckSize = 4
Output: 8
```

**Explanation:** There are:

- 1 box of the first type that contains 3 units.
- 2 boxes of the second type that contain 2 units each.
- 3 boxes of the third type that contain 1 unit each.

You can take all the boxes of the first and second types, and one box of the third type.
The total number of units will be = (1 × 3) + (2 × 2) + (1 × 1) = 8.

### Example 2:

```
Input: boxTypes = [[5,10],[2,5],[4,7],[3,9]], truckSize = 10
Output: 91
```

**Explanation:**

- Take all 5 boxes of type [5,10] = 5 × 10 = 50 units
- Take all 3 boxes of type [3,9] = 3 × 9 = 27 units
- Take all 2 boxes of type [2,5] = 2 × 5 = 10 units
- Total boxes so far = 5 + 3 + 2 = 10 boxes (reached truckSize)
- Total units = 50 + 27 + 10 = 87 units

Wait, let me recalculate:

- Sort by units per box: [[5,10],[3,9],[4,7],[2,5]]
- Take all 5 boxes of [5,10] = 50 units
- Take all 3 boxes of [3,9] = 27 units
- Take 2 boxes of [4,7] = 14 units (only 2 boxes left in truck)
- Total = 50 + 27 + 14 = 91 units

## Constraints:

- 1 ≤ boxTypes.length ≤ 1000
- 1 ≤ numberOfBoxesi, numberOfUnitsPerBoxi ≤ 1000
- 1 ≤ truckSize ≤ 10^6

## Expected Complexities

- **Time Complexity:** O(n log n)
- **Auxiliary Space:** O(1)

## Solution Approach

This is a classic **greedy algorithm** problem where we want to maximize the total units.

### Key Insight:

To maximize units, we should prioritize boxes with higher units per box. This ensures we get the maximum value for each box we take.

### Algorithm:

1. **Sort box types** by units per box in descending order
2. **Greedily select boxes** starting from highest units per box
3. **For each box type:**
   - Take as many boxes as possible (min of available boxes and remaining truck capacity)
   - Add units to total
   - Reduce remaining truck capacity
4. **Stop** when truck is full or no more boxes available

### Pseudocode:

```
function maximumUnits(boxTypes, truckSize):
    // Sort by units per box in descending order
    sort(boxTypes by boxTypes[i][1] in descending order)

    totalUnits = 0
    remainingCapacity = truckSize

    for each boxType in boxTypes:
        numberOfBoxes = boxType[0]
        unitsPerBox = boxType[1]

        // Take as many boxes as possible
        boxesToTake = min(numberOfBoxes, remainingCapacity)
        totalUnits += boxesToTake * unitsPerBox
        remainingCapacity -= boxesToTake

        // If truck is full, stop
        if remainingCapacity == 0:
            break

    return totalUnits
```

### Step-by-Step Example:

For `boxTypes = [[1,3],[2,2],[3,1]], truckSize = 4`:

1. **Sort by units per box:** [[1,3],[2,2],[3,1]]
2. **Selection process:**
   - Take 1 box of [1,3]: units = 1×3 = 3, remaining = 3 boxes
   - Take 2 boxes of [2,2]: units = 3 + 2×2 = 7, remaining = 1 box
   - Take 1 box of [3,1]: units = 7 + 1×1 = 8, remaining = 0 boxes
3. **Result:** Maximum units = 8

## Company Tags

- Amazon
- Microsoft
- Facebook
- Google

## Topic Tags

- Array
- Greedy Algorithm
- Sorting
- Optimization

## Problem Category

- Greedy Algorithm
- Array Manipulation
- Optimization Problems

## Difficulty

Easy
