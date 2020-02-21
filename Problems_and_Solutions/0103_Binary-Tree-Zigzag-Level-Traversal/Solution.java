/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> res = new LinkedList<>();
        if (root == null) {
            return res;
        }

        queue.offer(root);
        while (!queue.isEmpty()) {
            LinkedList<Integer> lsCurrLevel = new LinkedList<Integer>();
            res.add(lsCurrLevel);

            int ndCountCurrLevel = queue.size();

            // Move the value from queue to List of current level
            while (ndCountCurrLevel > 0) {
                TreeNode nd = queue.poll();
                if (res.size() % 2 == 1) {
                    lsCurrLevel.add(nd.val);
                } else {
                    lsCurrLevel.addFirst(nd.val);
                }

                // Add child nodes into queue
                if (nd.left != null) {
                    queue.offer(nd.left);
                }
                if (nd.right != null) {
                    queue.offer(nd.right);
                }
                ndCountCurrLevel--;
            }
        }
        return res;
    }
}