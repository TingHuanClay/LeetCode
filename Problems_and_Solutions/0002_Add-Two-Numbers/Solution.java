/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }
        ListNode ndDummy = new ListNode(0);
        ListNode ndPtr = new ListNode(0);
        ndPtr = ndDummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            if (l1 != null) {
                carry += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                carry += l2.val;
                l2 = l2.next;
            }
            ndPtr.next = new ListNode(carry % 10);
            carry = carry / 10;
            ndPtr = ndPtr.next;
        }
        return ndDummy.next;
    }
}