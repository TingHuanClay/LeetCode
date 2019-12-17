### 66. Plus One

https://leetcode.com/problems/plus-one/

---

#### Problem Description:

Given a **non-empty** array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

###### Example 1:

**Input**: [1,2,3]
**Output**: [1,2,4]
**Explanation**: TThe array represents the integer 123.

###### Example 2:

**Input**: [4,3,2,1]
**Output**: [4,3,2,2]
**Explanation**: The array represents the integer 4321.

---

###### Idea:

**Time Complexity**: `O(n)`
**Space Complexity**: `O(1)`

Step 1-1: Trace the array backwardly, and check current digit is 9 or NOT for carrying 1 to next digit
Step 1-2: If the first digit = 9 + 1 => 1**0**

the original array would need to expand with `[1]` in the beginning

```
Example:
[9,9,9]
=> [0,0,0]
=> [1] + [0,0,0]
=> [1,0,0,0]
```
