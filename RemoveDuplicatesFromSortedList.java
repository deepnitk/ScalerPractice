/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return null;
        ListNode temp = head;
        while(temp!=null && temp.next!=null){
            if(temp.val == temp.next.val){
                temp.next= temp.next.next;
            }
            else {
                temp= temp.next;
            }
        }
        return head;

    }
}
