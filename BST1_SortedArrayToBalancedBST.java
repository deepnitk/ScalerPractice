/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public TreeNode sortedArrayToBST(final int[] A) {
        if(A.length < 2) return new TreeNode(A[0]);
        return construct(A, 0, A.length-1);
    }
    TreeNode construct(int[] A, int start, int end){
        if(start > end) {
            return null;
        }

        int mid = (start+end)/2;

        TreeNode newNode = new TreeNode(A[mid]);
        newNode.left = construct(A, start, mid-1);
        newNode.right = construct(A, mid+1, end);
        return newNode;
    }
}
