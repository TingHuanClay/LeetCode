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

        Queue<Node> queue = new LinkedList<>();
        Node ndCurr = root;
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            Node ndLeftStart = queue.poll();
            addNodeIntoQueue(queue, ndLeftStart.left);
            addNodeIntoQueue(queue, ndLeftStart.right);

            for (int i = 1; i < size; i++) {
                ndLeftStart.next = queue.poll();
                ;
                ndLeftStart = ndLeftStart.next;

                addNodeIntoQueue(queue, ndLeftStart.left);
                addNodeIntoQueue(queue, ndLeftStart.right);
            }
        }
        return root;
    }

    private void addNodeIntoQueue(Queue<Node> queue, Node node) {
        if (queue == null || node == null) {
            return;
        }
        queue.offer(node);
    }
}