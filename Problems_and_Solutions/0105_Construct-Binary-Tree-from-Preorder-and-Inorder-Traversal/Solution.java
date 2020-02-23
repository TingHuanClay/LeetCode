/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> mapInorderIdx = new HashMap<Integer, Integer>();

        for (int i = 0; i < inorder.length; i++) {
            mapInorderIdx.put(inorder[i], i);
        }

        return buildTree(preorder, inorder, mapInorderIdx, 0, 0, inorder.length - 1);
    }

    public TreeNode buildTree(int[] preorder, int[] inorder, Map<Integer, Integer> map, int preStart, int inStart,
            int inEnd) {
        if (inStart > inEnd || preStart > preorder.length - 1) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[preStart]);

        int rootIdx = map.get(preorder[preStart]);
        int leftSubTreeSize = rootIdx - inStart + 1;

        root.left = buildTree(preorder, inorder, map, preStart + 1, inStart, rootIdx - 1);
        root.right = buildTree(preorder, inorder, map, preStart + leftSubTreeSize, rootIdx + 1, inEnd);
        return root;
    }
}