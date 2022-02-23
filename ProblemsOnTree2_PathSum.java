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
    public int hasPathSum(TreeNode A, int B) {
        return getPathSum(A,B) ? 1: 0;
    }

    public boolean getPathSum(TreeNode A, int B){
        if(A==null) return false;
        if(A.left==null && A.right == null){
            if(A.val == B) return true;
        }
        return getPathSum(A.left, B-A.val) || getPathSum(A.right, B-A.val);
    }
}
