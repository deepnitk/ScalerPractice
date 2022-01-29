/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode solve(ListNode head) {
         if(head== null)
            return null;
        ListNode temp=head;
        int noOfNodes = 0;
        while(temp !=null){
            temp=temp.next;
            noOfNodes++;
        }
        int k= (noOfNodes/2)+1;
        if(k==1) return null;
        ListNode prev=null;
        ListNode nxt =null;
        ListNode curr=head;
        while(curr.next!=null && k>1){
            prev=curr;
            curr= curr.next;
            nxt=curr.next;
            k--;
        }
        prev.next= nxt;
        return head;


    }
}
