/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode m = getMiddle(head);
        ListNode head2 = m.next;
        m.next = null;
        head = sortList(head);
        head2 = sortList(head2);
        return sortedMerge(head, head2);
    }

    public ListNode getMiddle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

    public ListNode sortedMerge(ListNode a, ListNode b){
        ListNode result = null;
        if (a == null)
            return b;
        if (b == null)
            return a;
        if (a.val <= b.val) {
            result = a;
            result.next = sortedMerge(a.next, b);
        }
        else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;
    }
}
