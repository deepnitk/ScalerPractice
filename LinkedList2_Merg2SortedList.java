/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode h1, ListNode h2) {
        // ListNode head = null;
        // if(h1==null ) return h2;
        // if(h2== null) return h1;
        // if(h1== null && h2==null) return null;
        // if(h1.val<=h2.val){
        //      head = h1;
        //      h1= h1.next;
        // }
        // else {
        //     head =h2;
        //     h2=h2.next;
        // }

        // Creating dummy node to get rid of above condition check....
        ListNode head = new ListNode(-1);
        ListNode tail = head;
        while(h1!=null && h2!= null){
            if(h1.val<=h2.val){
                tail.next= h1;
                tail=tail.next;
                h1= h1.next;
                tail.next=null;
            } else {
                tail.next= h2;
                tail=tail.next;
                h2= h2.next;
                tail.next=null;
            }
        }
        if(h1!=null) tail.next = h1;
        else tail.next = h2;
        return head.next;
    }
}
