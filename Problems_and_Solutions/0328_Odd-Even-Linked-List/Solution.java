/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode ndOdd = head, ndEven = head.next, ndEvenHead = ndEven;
        while (ndEven != null && ndEven.next != null) {
            ndOdd.next = ndEven.next;
            ndOdd = ndOdd.next;

            ndEven.next = ndOdd.next;
            ndEven = ndEven.next;
        }
        ndOdd.next = ndEvenHead;
        return head;
    }
}