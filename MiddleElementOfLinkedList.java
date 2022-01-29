/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public int solve(ListNode head) {
        if(head== null)
            return 0;
        ListNode temp=head;
        int noOfNodes = 0;
        while(temp !=null){
            temp=temp.next;
            noOfNodes++;
        }
        int k= (noOfNodes/2)+1;
        temp=head;
        while(temp.next!=null && k>1){
            temp=temp.next;
            k--;
        }
        return temp.val;
    }
}
