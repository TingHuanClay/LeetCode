105. Construct Binary Tree from Preorder and Inorder Traversal

https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/

---

#### Problem Description:

Given preorder and inorder traversal of a tree, construct the binary tree.

**Note:**
You may assume that duplicates do not exist in the tree.

For example, given

```
preorder = [3,9,20,15,7]
inorder = [9,3,15,20,7]
```

Return the following binary tree:

```
    3
   / \
  9  20
    /  \
   15   7
```

---

###### Idea:

Solution idea:
the first node at the **sub-array** of **preOrder** is the root.
aim to find out the index of root in the **sub-array** of **InOrder**
(sub-array is initial as the full array)
After that, the **sInOrder ub-array** will be separated at 3 parts
**Preorder: `[ root, [Left Subtree], [Right Subtree] ]`**
**Inorder: `[ [Left Subtree], root, [Right Subtree] ]`**
Be Noticed that the size of the Subtree is the same in both array
which is useful to find out the beginning and the end of the sub-array for next iteration.

**Time Complexity**: `O()`
**Space Complexity**: `O()`
