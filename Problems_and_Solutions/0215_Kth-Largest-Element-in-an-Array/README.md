215. Kth Largest Element in an Array

https://leetcode.com/problems/kth-largest-element-in-an-array/

---

#### Problem Description:

Find the **k**th largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.

#### Example 1:

```
Input: [3,2,1,5,6,4] and k = 2
Output: 5
```

#### Example 2:

```
Input: [3,2,3,1,2,4,5,5,6] and k = 4
Output: 4
```

###### Note:

You may assume k is always valid, 1 ≤ k ≤ array's length.

###### Idea:

1. Use MaxHeap to get the k-th largest element

**Time Complexity**: `O(nlogn)`
**Space Complexity**: `O(n)`
