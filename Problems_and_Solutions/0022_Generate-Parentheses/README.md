22. Generate Parentheses

https://leetcode.com/problems/generate-parentheses/

---

#### Problem Description:

Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

For example, given n = 3, a solution set is:

```
[
  "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
]
```

---

###### Idea:

Use Backtracking and limit possible options to fit the rule of valid parentheses.

```
1. You can add opening parenthese when lefting openning
2. You can add closing parenthese when #(opening) is more than #(closing)
```

**Time Complexity**: `O(n)`
**Space Complexity**: `O(n)`
