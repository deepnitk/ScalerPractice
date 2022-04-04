/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode detectCycle(ListNode head) {
        if(head == null) return null;

        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next !=null) {
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                break;
            }
        }

        if(fast == null || fast.next == null){
            return null;
        }
        ListNode t1 = head;
        ListNode t2 = slow;
        while(t1!=t2){
            t1 = t1.next;
            t2 = t2.next;
        }
        return t1;
	}

}
