/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode solve(ListNode A) {
        ListNode loop = detectCycle(A);
        ListNode temp=loop;
        while(loop.next!=temp){
            loop=loop.next;
        }
        loop.next=null; 
        return A;
    }

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next!=null && fast.next.next !=null) {
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                slow = head;
                while(slow!=null){
                    slow=slow.next;
                    fast=fast.next;
                    if(slow==fast)
                        return slow;
                }
            }
        }
        return null;
	}
}
