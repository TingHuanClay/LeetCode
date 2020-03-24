56. Merge Intervals

https://leetcode.com/problems/merge-intervals/

---

#### Problem Description:

Given a collection of intervals, merge all overlapping intervals.

#### Example 1:

```
Input: [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
```

#### Example 2:

```
Input: [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
```

---

###### Idea:

force solution
Time Complexity: O(n^2)
traverse the input iterationally
and merge the interval when overlapping
[L1, R1][l2, r2]
over lapping
L1 <= L2 <= R1
or
L2 <= L1 <= R2
new interval: [min(L1,L2) , max(R1,R2)]
or add a new interval when no overlapping

sort the interval by their first element
[[1,3],[2,6],[8,10],[15,18]]

each iteration, take care only the current interval with previous interval
we already knoe L1 <= L2, then we only have to worry about L2 <= R1 not
[L1, R1][l2, r2]
merge the interval when L2 < R1

sort: O(nlogn) + merge: O(n)
Time complexity: O(nlogn)

**Time Complexity**: `O(nlogn)`
**Space Complexity**: `O(n)`
