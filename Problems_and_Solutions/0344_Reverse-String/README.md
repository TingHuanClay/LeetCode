344. Reverse String

https://leetcode.com/problems/reverse-string/

---

#### Problem Description:

Write a function that reverses a string. The input string is given as an array of characters `char[]`.

Do not allocate extra space for another array, you must do this by **modifying the input array** `in-place` with O(1) extra memory.

You may assume all the characters consist of [printable ascii characters](https://en.wikipedia.org/wiki/ASCII#Printable_characters).

##### Example 1

**`Input`**`: ["h","e","l","l","o"]`

**`Output`**`: ["o","l","l","e","h"]`

##### Example 2

**`Input`**`: ["H","a","n","n","a","h"]`

**`Output`**`: ["h","a","n","n","a","H"]`

---

#### Idea

just leverage two pointers and appoint them to the beginning and the end of the String
and swap the characters of current positions at each iteration
beginning++ & end-- after the iteration
break the loop when beginning >= end
then we have the answer of the reverse string.

**Time Complexity**: `O(n)` n is the length of the String
