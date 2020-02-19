/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
/**
 * Time Complexity: O(n) the while loop would traverse the lists twice when
 * ListA has different length with ListB and switch the start node at 2nd
 * iteration. => the 2 pointers would meet at the intersection point at 2nd
 * iteration.
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode ptrA = headA, ptrB = headB;

        while (ptrA != ptrB) {
            ptrA = (ptrA != null) ? ptrA.next : headB;
            ptrB = (ptrB != null) ? ptrB.next : headA;
        }
        return ptrA;
    }
}