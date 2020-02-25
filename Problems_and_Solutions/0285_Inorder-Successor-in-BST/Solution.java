/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    private boolean findP = false;
    private TreeNode res = null;

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        findNodeP(root, p);
        return res;
    }

    public void findNodeP(TreeNode nd, TreeNode p) {
        if (nd.left != null) {
            findNodeP(nd.left, p);
        }
        if (res != null) {
            return;
        } else if (findP) {
            res = nd;
            return;
        } else if (nd.val == p.val) {
            findP = true;
        }

        if (nd.right != null) {
            findNodeP(nd.right, p);
        }
    }
}