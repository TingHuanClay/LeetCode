/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    private int count;
    private int res = Integer.MIN_VALUE;

    public int kthSmallest(TreeNode root, int k) {
        count = k;
        traverse(root);
        return res;
    }

    private void traverse(TreeNode root) {
        if (root.left != null) {
            traverse(root.left);
        }
        if (--count == 0) {
            res = root.val;
            return;
        }
        if (root.right != null) {
            traverse(root.right);
        }
    }
}