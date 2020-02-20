94. Binary Tree Inorder Traversal

https://leetcode.com/problems/binary-tree-inorder-traversal/

---

#### Problem Description:

Given a binary tree, return the inorder traversal of its nodes' values.

###### Example:

![image](160_example_1.png)

**Input**: [1,null,2,3]

```
1
\
 2
/
3
```

**Output**: [1,3,2]

**Follow up**:

Recursive solution is trivial, could you do it iteratively?

---

###### Idea:

Iterative:
use **Stack** to keep the node
keep push the node into stack and traverse to the left side
until reach the null
pop the stack and get the node with the value append to the list (result)
After that, move the pointer the right child node and start traverse the right subtree.

**Time Complexity**: `O(n)`
**Space Complexity**: `O(n)`
