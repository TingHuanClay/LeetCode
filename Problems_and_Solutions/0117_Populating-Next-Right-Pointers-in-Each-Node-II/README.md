117. Populating Next Right Pointers in Each Node II

https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/

---

#### Problem Description:

Given a binary tree

```
struct Node {
  int val;
  Node *left;
  Node *right;
  Node *next;
}
```

Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to `NULL`.

Initially, all next pointers are set to `NULL`.

**Follow up:**

- You may only use constant extra space.
- Recursive approach is fine, you may assume implicit stack space does not count as extra space for this problem.

**Example:**
![image](117_sample.png)

```
Input: root = root = [1,2,3,4,5,null,7]
Output: [1,#,2,3,#,4,5,7,#]
Explanation: Given the above binary tree (Figure A), your function should populate each next pointer to point to its next right node, just like in Figure B. The serialized output is in level order as connected by the next pointers, with '#' signifying the end of each level.
```

**Constraints:**

- The number of nodes in the given tree is less than `6000`.
- `-100 <= node.val <= 100`

---

###### Idea:

Use 2 pointer and traverse the tree level by level (using .next)

and keep building pointer of lower level by .next while traversing the upper level.

Besides, you have to memorize with third pointer for the beginning of lower level.

After that, you can move the pointer to next level for next level iteration.

**Time Complexity**: `O(n)`
**Space Complexity**: `O(1)`
