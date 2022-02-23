/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        TreeLinkNode curr = root;
        while(curr.left!=null){

            TreeLinkNode temp = curr;
            while(temp!=null){
                temp.left.next=temp.right;
                if(temp.next!=null){
                    temp.right.next =temp.next.left;
                }
                temp=temp.next;      
            }
            curr = curr.left;
        }
    }
}
