/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

/*
Use 2 pointer with distance is N
Then plus one for both pointer in each iteration
when the 1st pointer (ndFast) reach the end of the array
then the 2nd pointer (ndSlow) is the solution of Nth Node from the End

traverse both nodes in each iteration
and skip ndSlow.next when ndFast reach the tail
*/
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ndDummy = new ListNode(0);
        ndDummy.next = head;
        
        ListNode ndFast = ndDummy;
        ListNode ndSlow = ndDummy;
        
        
        for (int i = 0; i < n ; i++) {
            ndFast = ndFast.next;
        }
        
        while (ndFast.next != null) {
            ndFast = ndFast.next;
            ndSlow = ndSlow.next;
        }
        
        ndSlow.next = (ndSlow.next != null)? ndSlow.next.next : null;

        return ndDummy.next;
    }
}