/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reorderList(ListNode head) {
        ListNode m = getMiddle(head);
        ListNode head2 = m.next;
        m.next= null;
        head2=reverseList(head2);
        mergeList(head,head2);
        return head;
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

    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode nxt = curr.next;
            curr.next=prev;
            prev= curr;
            curr=nxt;
        }
        return prev;
    }

    public void mergeList(ListNode h1, ListNode h2){
        ListNode curr =h1;
        while(h2 !=null){
            ListNode temp = h2;
            h2=h2.next;
            temp.next=curr.next;
            curr.next= temp;
            curr= curr.next.next;   
        }
    }
}
