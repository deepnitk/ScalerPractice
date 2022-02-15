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
    public int isBalanced(TreeNode A) {
        if(heightOfBinaryTree(A) != -1) return 1;
        return 0;
        
        
    }
    int heightOfBinaryTree(TreeNode A){
        if(A== null) return 0;
        int lh = heightOfBinaryTree(A.left);
        if(lh==-1) return -1;
        int rh = heightOfBinaryTree(A.right);
        if(rh ==-1) return -1;
        if(Math.abs(lh-rh)>1) return -1;
        return Math.max(lh,rh) + 1;

    }
}
