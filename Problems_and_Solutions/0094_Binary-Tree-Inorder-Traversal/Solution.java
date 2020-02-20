/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        // getResRecursively(root, res);
        getResIteratively(root, res);
        return res;
    }

    private void getResIteratively(TreeNode root, List<Integer> res) {
        Stack<TreeNode> stk = new Stack<>();
        TreeNode ndPtr = root;

        while (ndPtr != null || !stk.isEmpty()) {
            if (ndPtr != null) {
                stk.push(ndPtr);
                ndPtr = ndPtr.left;
            } else {
                ndPtr = stk.pop();
                res.add(ndPtr.val);
                ndPtr = ndPtr.right;
            }
        }
    }

    private void getResRecursively(TreeNode root, List<Integer> res) {
        if (root == null)
            return;

        if (root.left != null) {
            getResRecursively(root.left, res);
        }

        res.add(root.val);

        if (root.right != null) {
            getResRecursively(root.right, res);
        }
    }
}