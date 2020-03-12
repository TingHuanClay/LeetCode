79. Word Search

https://leetcode.com/problems/word-search/

---

#### Problem Description:

Given a 2D board and a word, find if the word exists in the grid.

The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.

#### Example:

```
board =
[
  ['A','B','C','E'],
  ['S','F','C','S'],
  ['A','D','E','E']
]
```

`Given word =`**`"ABCCED"`**`, return true.`
`Given word =`**`"SEE"`**`, return true.`
`Given word =`**`"ABCB"`**`, return false.`

---

###### Idea:

Backtracking pattern:

- Step 1: check bottom case
- Step 2: check boundary or NOT
- Step 3: Find target for current iteration (mark current position as visited) and move to next iteration(4 directions in this question)
- Step 4: clean the mark in previous step

**Time Complexity**: `O(n^2 * 4^L), n: row/col size, L: length of the word`
**Space Complexity**: `O(L)`
