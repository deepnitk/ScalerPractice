/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head == null) return null;

        //Step 1: Combine the nodes
        RandomListNode curr = head;
        while(curr!=null){
            RandomListNode x = new RandomListNode(curr.label);
            x.next = curr.next;
            curr.next = x;
            curr=curr.next.next;
        }

        //Step 2: Update Random pointer for new nodes
        curr = head;
        while(curr!=null){
            // if(curr.random != null){
            //     curr.next.random=curr.random.next;
            //     curr = curr.next.next;
            // }
            curr.next.random=curr.random!=null?curr.random.next:curr.random;
            curr = curr.next.next;
        }

        //Step 3: Detach the combined Linked list
        curr=head;
        RandomListNode head2 = curr.next;
        RandomListNode ptr = curr.next;
        while(curr!=null){
            curr.next= curr.next.next;
            curr= curr.next;
            // if(curr!=null){
            //     ptr.next= ptr.next.next;
            //     ptr=ptr.next;
            // }
            ptr.next=ptr.next!=null?ptr.next.next:ptr.next;
            ptr=ptr.next;
        }
        return head2;
    }
}
