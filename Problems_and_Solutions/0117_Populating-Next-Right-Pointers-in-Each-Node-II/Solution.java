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
        if (root == null) {
            return root;
        }

        Node ndCurr = root;
        Node ndNxtLvlHead = new Node(0);

        // Iteration level by level
        while (ndCurr != null) {
            Node ndNxtLvlCurr = ndNxtLvlHead;

            // Iteration on current level
            while (ndCurr != null) {
                if (ndCurr.left != null) {
                    ndNxtLvlCurr.next = ndCurr.left;
                    ndNxtLvlCurr = ndNxtLvlCurr.next;
                }
                if (ndCurr.right != null) {
                    ndNxtLvlCurr.next = ndCurr.right;
                    ndNxtLvlCurr = ndNxtLvlCurr.next;
                }
                ndCurr = ndCurr.next;
            }

            // Move to next level and reset the ndNxtLvlHead.next pointer
            ndCurr = ndNxtLvlHead.next;
            ndNxtLvlHead.next = null;
        }

        return root;
    }
}