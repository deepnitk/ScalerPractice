/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode A, int B) {
        if(A== null)
            return null;
        ListNode prev =null;
        ListNode curr = A;
        ListNode nxt = null;
        int k = B;
        while(curr!=null && k>0){
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
            k--;
        }
        if (nxt != null)
            A.next = reverseList(nxt, B);
        return prev;
    }
}
