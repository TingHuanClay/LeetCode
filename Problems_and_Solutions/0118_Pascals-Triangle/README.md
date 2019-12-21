### 118. Pascal's Triangle

https://leetcode.com/problems/pascals-triangle/

---

#### Problem Description:

Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
![image](PascalTriangleAnimated2.gif)

In Pascal's triangle, each number is the sum of the two numbers directly above it.

###### Example :

**Input**: 5

**Output**:

```
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
```

---

###### Idea:

Change the output from value to index

```
[
     [0],
    [0,1],        j-1,  j
      \/            \  /
   [0,1,2],          j
    \/ \/
  [0,1,2,3],
   \/\/\/
 [0,1,2,3,4]
]
```

in each row, `the first` and `the last` element are `1`
for other elements in the middle, value = `sum (upperRow[j-1] , upperRow[j])`

**Time Complexity**: O(n^2), n: number of rows (input value)
**Space Complexity**: O(n^2), n: number of rows (input value)
