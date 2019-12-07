/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

/*
My first idea about this problem is using set to identify existed or not.
However, we don't need any set with extra space for this problem
Due to it is 'sorted' linked list. 
So, We can TWO pointers solution to resolve it.

Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode slow = head, fast = head.next;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        while (fast != null) {
            if (slow.val != fast.val) {
                slow.next = fast;
                slow = slow.next;
            }
            fast = fast.next;
        }
        slow.next = fast;
        
        return dummy.next;
    }
}