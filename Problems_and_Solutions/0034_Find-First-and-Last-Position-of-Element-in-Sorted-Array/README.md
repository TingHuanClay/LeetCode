Given an array of integers `nums` sorted in ascending order, find the starting and ending position of a given `target` value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return `[-1, -1]`.

#### Example 1:

```
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
```

#### Example 2:

```
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
```

###### Idea:

Run ~BinarySearch twice for searching the left most target and right most target.

~BinarySearch is similar to Binary Search, but change the index when ever searched and found the target to get the corner.

so generally time complexity is logn + log n =< O(logn)

but we can do some enhance when there is no target found in the first run of ~BinarySearch.

**Time Complexity**: `O(logn)`
**Space Complexity**: `O(1)`
