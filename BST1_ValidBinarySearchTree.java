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
    public int isValidBST(TreeNode A) {
        //Top down Approach
        if(isValid(A, Integer.MIN_VALUE, Integer.MAX_VALUE)) return 1;
        return 0;
    }
    
    public boolean isValid(TreeNode root, Integer min, Integer max){
        if(root==null) return true;
        if(root.val<min || root.val>max) return false;
        return(isValid(root.left,min, root.val-1) && isValid(root.right, root.val+1, max));
    }
}
