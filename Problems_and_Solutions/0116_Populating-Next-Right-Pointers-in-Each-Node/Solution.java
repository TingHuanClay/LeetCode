/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/
class Solution {
    public Node connect(Node root) {
        /*
         * IMPORTANT limitation that we can assume the tree is 'Perfect Binary Tree'
         * traveral the tree level by level build the 'next' pointer in child level when
         * traversing current level Time: O(n) Space: O(1)
         */
        Node level_start = root;
        while (level_start != null) {
            Node curr = level_start;

            // traverse curren level
            while (curr != null) {
                if (curr.left != null) {
                    curr.left.next = curr.right;
                }

                if (curr.right != null && curr.next != null) {
                    curr.right.next = curr.next.left;
                }
                // go to next node in current level
                curr = curr.next;
            }

            // go to next level
            level_start = level_start.left; // beacuse perfect binary tree
        }
        return root;
    }
}