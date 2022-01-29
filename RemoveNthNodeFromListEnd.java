/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int B) {
        int sizeOfLinekedList = 0;
        ListNode temp = head;
        while(temp!=null){
            temp=temp.next;
            sizeOfLinekedList++;
        }
        if(sizeOfLinekedList==1) return null;
        if(B>=sizeOfLinekedList) return head.next;
        int count=0;
        ListNode prev = head;
        while (count < sizeOfLinekedList-B-1) {
            prev = prev.next;
            count++;
        }
        prev.next = prev.next.next;
        return head;
    }
}
