### 67. Add Binary

https://leetcode.com/problems/add-binary/

---

#### Problem Description:

Given two binary strings, return their sum (also a binary string).

The input strings are both **non-empty** and contains only characters `1` or `0`.

###### Example 1:

**Input**: a = "11", b = "1"

**Output**: "100"

###### Example 2:

**Input**: a = "1010", b = "1011"

**Output**: "10101"

---

###### Idea:

some key point to solve this question:

1. when adding each digit, we can leverage
   `sum % 2` as the `remaining` in current digit
   `sum / 2` as the `carry` to next digit

2. iterate the string from the last digit for add operation
   `(from n-1 to 0`

3. use `chartAt(i)` to get `char` value
   use `chartAt(i) - '0'` to get `int` value

**Time Complexity**: `O(m+n)`, m & n are the length of string input
**Space Complexity**: `O(max(m,n))`, m & n are the length of string input
