28. Implement strStr()

https://leetcode.com/problems/implement-strstr/

---

#### Problem Description:

Implement [strStr()](http://www.cplusplus.com/reference/cstring/strstr/).

Return the index of the first occurrence of needle in haystack, or **-1** if needle is not part of haystack.

###### Example 1:

**Input**: haystack = "hello", needle = "ll"

**Output**: 2

###### Example 2:

**Input**: haystack = "aaaaa", needle = "bba"

**Output**: -1

###### Example 3:

**Input**: haystack = "adsgwadsxdsgwadsgz", needle = "dsgwadsgz"

**Output**: 9

#### Clarification:

What should we return when `needle` is an empty string? This is a great question to ask during an interview.

For the purpose of this problem, we will return 0 when `needle` is an empty string. This is consistent to C's [strStr()](http://www.cplusplus.com/reference/cstring/strstr/) and Java's [indexOf()](<https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#indexOf(java.lang.String)>).

---

###### Idea:

`this initial solution is quite slow`
**Time Complexity**: `O(m*n)`, m & n are the length of string input

###### Solution with KMP Algorithm

Knuth–Morris–Pratt (KMP) Pattern Matching Substring Search
[Reference](https://www.youtube.com/watch?v=BXCEFAzhxGY)
sds

[Code Example](https://www.geeksforgeeks.org/kmp-algorithm-for-pattern-searching/)
