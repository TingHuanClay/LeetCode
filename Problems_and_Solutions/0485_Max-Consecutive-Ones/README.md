485. Max Consecutive Ones

https://leetcode.com/problems/max-consecutive-ones/

---

#### Problem Description:

Given a binary array, find the maximum number of consecutive 1s in this array.

###### Example 1:

**`Input:`**`[1,1,0,1,1,1]`

**`Output:`**`3`

**`Explanation:`**`3The first two digits or the last three digits are consecutive 1s.`
`The maximum number of consecutive 1s is 3.`

**Note:**

- The input array will only contain `0` and `1`.
- The length of input array is a positive integer and will not exceed 10,000

---

###### Idea:

You can use two pointer to resolve this question with sliding window.
But we can reduce it to one pointer and 1 time traverse with keeping the global optimal result.

Please be noticed that you can also enhance the source code to one line in each iteration to enhance performance when it run in JVM.
For more detail, please check [[source code]](./Solution.java)

**Time Complexity**: `O(n)`
