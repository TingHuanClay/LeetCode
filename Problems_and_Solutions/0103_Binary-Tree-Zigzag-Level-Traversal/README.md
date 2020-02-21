103. Binary Tree Zigzag Level Order Traversal

https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/

---

#### Problem Description:

Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).

For example:
Given binary tree `[3,9,20,null,null,15,7]`,

```
    3
   / \
  9  20
    /  \
   15   7
```

return its zigzag level order traversal as:

```
[
  [3],
  [20,9],
  [15,7]
]
```

---

###### Idea:

Generally, we should use BFS algorithm with Queue as data structure
to keep traverse the tree level by level.
Then, we poll each node from the queue and move to value into a **LinkedList**
The reason we use **LinkedList** due to it provides both **add()** & **addFirst()**
That would be helpful for different direction (sequence) of result for Zigzag

**Time Complexity**: `O(n)`
**Space Complexity**: `O(n)`
